
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 部门经理
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/jingli")
public class JingliController {
    private static final Logger logger = LoggerFactory.getLogger(JingliController.class);

    private static final String TABLE_NAME = "jingli";

    @Autowired
    private JingliService jingliService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private BumenService bumenService;//部门
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private FenpeiService fenpeiService;//任务分配
    @Autowired
    private GonggaoService gonggaoService;//公告资讯
    @Autowired
    private QingjiaService qingjiaService;//员工请假
    @Autowired
    private RenwuService renwuService;//任务
    @Autowired
    private XinxiService xinxiService;//基本信息
    @Autowired
    private XinziService xinziService;//薪资
    @Autowired
    private YonghuService yonghuService;//用户
    @Autowired
    private ZiliaoService ziliaoService;//资料
    @Autowired
    private UsersService usersService;//管理员


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        else if("部门经理".equals(role))
            params.put("jingliId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = jingliService.queryPage(params);

        //字典表数据转换
        List<JingliView> list =(List<JingliView>)page.getList();
        for(JingliView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JingliEntity jingli = jingliService.selectById(id);
        if(jingli !=null){
            //entity转view
            JingliView view = new JingliView();
            BeanUtils.copyProperties( jingli , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody JingliEntity jingli, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,jingli:{}",this.getClass().getName(),jingli.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<JingliEntity> queryWrapper = new EntityWrapper<JingliEntity>()
            .eq("username", jingli.getUsername())
            .or()
            .eq("jingli_phone", jingli.getJingliPhone())
            .or()
            .eq("jingli_id_number", jingli.getJingliIdNumber())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JingliEntity jingliEntity = jingliService.selectOne(queryWrapper);
        if(jingliEntity==null){
            jingli.setCreateTime(new Date());
            jingli.setPassword("123456");
            jingliService.insert(jingli);
            return R.ok();
        }else {
            return R.error(511,"账户或者部门经理手机号或者部门经理身份证号已经被使用");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody JingliEntity jingli, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,jingli:{}",this.getClass().getName(),jingli.toString());
        JingliEntity oldJingliEntity = jingliService.selectById(jingli.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        if("".equals(jingli.getJingliPhoto()) || "null".equals(jingli.getJingliPhoto())){
                jingli.setJingliPhoto(null);
        }

            jingliService.updateById(jingli);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<JingliEntity> oldJingliList =jingliService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        jingliService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //.eq("time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
        try {
            List<JingliEntity> jingliList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            JingliEntity jingliEntity = new JingliEntity();
//                            jingliEntity.setUsername(data.get(0));                    //账户 要改的
//                            jingliEntity.setPassword("123456");//密码
//                            jingliEntity.setJingliUuidNumber(data.get(0));                    //部门经理编号 要改的
//                            jingliEntity.setJingliName(data.get(0));                    //部门经理姓名 要改的
//                            jingliEntity.setJingliPhone(data.get(0));                    //部门经理手机号 要改的
//                            jingliEntity.setJingliIdNumber(data.get(0));                    //部门经理身份证号 要改的
//                            jingliEntity.setJingliPhoto("");//详情和图片
//                            jingliEntity.setSexTypes(Integer.valueOf(data.get(0)));   //性别 要改的
//                            jingliEntity.setJingliEmail(data.get(0));                    //部门经理邮箱 要改的
//                            jingliEntity.setCreateTime(date);//时间
                            jingliList.add(jingliEntity);


                            //把要查询是否重复的字段放入map中
                                //账户
                                if(seachFields.containsKey("username")){
                                    List<String> username = seachFields.get("username");
                                    username.add(data.get(0));//要改的
                                }else{
                                    List<String> username = new ArrayList<>();
                                    username.add(data.get(0));//要改的
                                    seachFields.put("username",username);
                                }
                                //部门经理编号
                                if(seachFields.containsKey("jingliUuidNumber")){
                                    List<String> jingliUuidNumber = seachFields.get("jingliUuidNumber");
                                    jingliUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> jingliUuidNumber = new ArrayList<>();
                                    jingliUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("jingliUuidNumber",jingliUuidNumber);
                                }
                                //部门经理手机号
                                if(seachFields.containsKey("jingliPhone")){
                                    List<String> jingliPhone = seachFields.get("jingliPhone");
                                    jingliPhone.add(data.get(0));//要改的
                                }else{
                                    List<String> jingliPhone = new ArrayList<>();
                                    jingliPhone.add(data.get(0));//要改的
                                    seachFields.put("jingliPhone",jingliPhone);
                                }
                                //部门经理身份证号
                                if(seachFields.containsKey("jingliIdNumber")){
                                    List<String> jingliIdNumber = seachFields.get("jingliIdNumber");
                                    jingliIdNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> jingliIdNumber = new ArrayList<>();
                                    jingliIdNumber.add(data.get(0));//要改的
                                    seachFields.put("jingliIdNumber",jingliIdNumber);
                                }
                        }

                        //查询是否重复
                         //账户
                        List<JingliEntity> jingliEntities_username = jingliService.selectList(new EntityWrapper<JingliEntity>().in("username", seachFields.get("username")));
                        if(jingliEntities_username.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(JingliEntity s:jingliEntities_username){
                                repeatFields.add(s.getUsername());
                            }
                            return R.error(511,"数据库的该表中的 [账户] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //部门经理编号
                        List<JingliEntity> jingliEntities_jingliUuidNumber = jingliService.selectList(new EntityWrapper<JingliEntity>().in("jingli_uuid_number", seachFields.get("jingliUuidNumber")));
                        if(jingliEntities_jingliUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(JingliEntity s:jingliEntities_jingliUuidNumber){
                                repeatFields.add(s.getJingliUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [部门经理编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //部门经理手机号
                        List<JingliEntity> jingliEntities_jingliPhone = jingliService.selectList(new EntityWrapper<JingliEntity>().in("jingli_phone", seachFields.get("jingliPhone")));
                        if(jingliEntities_jingliPhone.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(JingliEntity s:jingliEntities_jingliPhone){
                                repeatFields.add(s.getJingliPhone());
                            }
                            return R.error(511,"数据库的该表中的 [部门经理手机号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                         //部门经理身份证号
                        List<JingliEntity> jingliEntities_jingliIdNumber = jingliService.selectList(new EntityWrapper<JingliEntity>().in("jingli_id_number", seachFields.get("jingliIdNumber")));
                        if(jingliEntities_jingliIdNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(JingliEntity s:jingliEntities_jingliIdNumber){
                                repeatFields.add(s.getJingliIdNumber());
                            }
                            return R.error(511,"数据库的该表中的 [部门经理身份证号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        jingliService.insertBatch(jingliList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }

    /**
    * 登录
    */
    @IgnoreAuth
    @RequestMapping(value = "/login")
    public R login(String username, String password, String captcha, HttpServletRequest request) {
        JingliEntity jingli = jingliService.selectOne(new EntityWrapper<JingliEntity>().eq("username", username));
        if(jingli==null || !jingli.getPassword().equals(password))
            return R.error("账号或密码不正确");
        String token = tokenService.generateToken(jingli.getId(),username, "jingli", "部门经理");
        R r = R.ok();
        r.put("token", token);
        r.put("role","部门经理");
        r.put("username",jingli.getJingliName());
        r.put("tableName","jingli");
        r.put("userId",jingli.getId());
        return r;
    }

    /**
    * 注册
    */
    @IgnoreAuth
    @PostMapping(value = "/register")
    public R register(@RequestBody JingliEntity jingli, HttpServletRequest request) {
//    	ValidatorUtils.validateEntity(user);
        Wrapper<JingliEntity> queryWrapper = new EntityWrapper<JingliEntity>()
            .eq("username", jingli.getUsername())
            .or()
            .eq("jingli_phone", jingli.getJingliPhone())
            .or()
            .eq("jingli_id_number", jingli.getJingliIdNumber())
            ;
        JingliEntity jingliEntity = jingliService.selectOne(queryWrapper);
        if(jingliEntity != null)
            return R.error("账户或者部门经理手机号或者部门经理身份证号已经被使用");
        jingli.setJingliUuidNumber(String.valueOf(new Date().getTime()));
        jingli.setCreateTime(new Date());
        jingliService.insert(jingli);

        return R.ok();
    }

    /**
     * 重置密码
     */
    @GetMapping(value = "/resetPassword")
    public R resetPassword(Integer  id, HttpServletRequest request) {
        JingliEntity jingli = jingliService.selectById(id);
        jingli.setPassword("123456");
        jingliService.updateById(jingli);
        return R.ok();
    }

	/**
	 * 修改密码
	 */
	@GetMapping(value = "/updatePassword")
	public R updatePassword(String  oldPassword, String  newPassword, HttpServletRequest request) {
        JingliEntity jingli = jingliService.selectById((Integer)request.getSession().getAttribute("userId"));
		if(newPassword == null){
			return R.error("新密码不能为空") ;
		}
		if(!oldPassword.equals(jingli.getPassword())){
			return R.error("原密码输入错误");
		}
		if(newPassword.equals(jingli.getPassword())){
			return R.error("新密码不能和原密码一致") ;
		}
        jingli.setPassword(newPassword);
		jingliService.updateById(jingli);
		return R.ok();
	}



    /**
     * 忘记密码
     */
    @IgnoreAuth
    @RequestMapping(value = "/resetPass")
    public R resetPass(String username, HttpServletRequest request) {
        JingliEntity jingli = jingliService.selectOne(new EntityWrapper<JingliEntity>().eq("username", username));
        if(jingli!=null){
            jingli.setPassword("123456");
            jingliService.updateById(jingli);
            return R.ok();
        }else{
           return R.error("账号不存在");
        }
    }


    /**
    * 获取用户的session用户信息
    */
    @RequestMapping("/session")
    public R getCurrJingli(HttpServletRequest request){
        Integer id = (Integer)request.getSession().getAttribute("userId");
        JingliEntity jingli = jingliService.selectById(id);
        if(jingli !=null){
            //entity转view
            JingliView view = new JingliView();
            BeanUtils.copyProperties( jingli , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }
    }


    /**
    * 退出
    */
    @GetMapping(value = "logout")
    public R logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return R.ok("退出成功");
    }



    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = jingliService.queryPage(params);

        //字典表数据转换
        List<JingliView> list =(List<JingliView>)page.getList();
        for(JingliView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Integer id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        JingliEntity jingli = jingliService.selectById(id);
            if(jingli !=null){


                //entity转view
                JingliView view = new JingliView();
                BeanUtils.copyProperties( jingli , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody JingliEntity jingli, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,jingli:{}",this.getClass().getName(),jingli.toString());
        Wrapper<JingliEntity> queryWrapper = new EntityWrapper<JingliEntity>()
            .eq("username", jingli.getUsername())
            .or()
            .eq("jingli_phone", jingli.getJingliPhone())
            .or()
            .eq("jingli_id_number", jingli.getJingliIdNumber())
//            .notIn("jingli_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        JingliEntity jingliEntity = jingliService.selectOne(queryWrapper);
        if(jingliEntity==null){
            jingli.setCreateTime(new Date());
            jingli.setPassword("123456");
        jingliService.insert(jingli);

            return R.ok();
        }else {
            return R.error(511,"账户或者部门经理手机号或者部门经理身份证号已经被使用");
        }
    }

}

