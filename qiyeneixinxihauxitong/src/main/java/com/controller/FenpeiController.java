
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
 * 任务分配
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/fenpei")
public class FenpeiController {
    private static final Logger logger = LoggerFactory.getLogger(FenpeiController.class);

    private static final String TABLE_NAME = "fenpei";

    @Autowired
    private FenpeiService fenpeiService;


    @Autowired
    private TokenService tokenService;

    @Autowired
    private BumenService bumenService;//部门
    @Autowired
    private DictionaryService dictionaryService;//字典
    @Autowired
    private GonggaoService gonggaoService;//公告资讯
    @Autowired
    private JingliService jingliService;//部门经理
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
        params.put("fenpeiDeleteStart",1);params.put("fenpeiDeleteEnd",1);
        CommonUtil.checkMap(params);
        PageUtils page = fenpeiService.queryPage(params);

        //字典表数据转换
        List<FenpeiView> list =(List<FenpeiView>)page.getList();
        for(FenpeiView c:list){
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
        FenpeiEntity fenpei = fenpeiService.selectById(id);
        if(fenpei !=null){
            //entity转view
            FenpeiView view = new FenpeiView();
            BeanUtils.copyProperties( fenpei , view );//把实体数据重构到view中
            //级联表 任务
            //级联表
            RenwuEntity renwu = renwuService.selectById(fenpei.getRenwuId());
            if(renwu != null){
            BeanUtils.copyProperties( renwu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setRenwuId(renwu.getId());
            }
            //级联表 用户
            //级联表
            YonghuEntity yonghu = yonghuService.selectById(fenpei.getYonghuId());
            if(yonghu != null){
            BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段,当前表的级联注册表
            view.setYonghuId(yonghu.getId());
            }
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
    public R save(@RequestBody FenpeiEntity fenpei, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,fenpei:{}",this.getClass().getName(),fenpei.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");
        else if("用户".equals(role))
            fenpei.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));

        Wrapper<FenpeiEntity> queryWrapper = new EntityWrapper<FenpeiEntity>()
            .eq("renwu_id", fenpei.getRenwuId())
            .eq("yonghu_id", fenpei.getYonghuId())
            .eq("fenpei_types", fenpei.getFenpeiTypes())
            .eq("fenpei_delete", 1)
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        FenpeiEntity fenpeiEntity = fenpeiService.selectOne(queryWrapper);
        if(fenpeiEntity==null){
            fenpei.setFenpeiDelete(1);
            fenpei.setInsertTime(new Date());
            fenpei.setCreateTime(new Date());
            fenpeiService.insert(fenpei);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody FenpeiEntity fenpei, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,fenpei:{}",this.getClass().getName(),fenpei.toString());
        FenpeiEntity oldFenpeiEntity = fenpeiService.selectById(fenpei.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
//        else if("用户".equals(role))
//            fenpei.setYonghuId(Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId"))));
        if("".equals(fenpei.getFenpeiContent()) || "null".equals(fenpei.getFenpeiContent())){
                fenpei.setFenpeiContent(null);
        }

            fenpeiService.updateById(fenpei);//根据id更新
            return R.ok();
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<FenpeiEntity> oldFenpeiList =fenpeiService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        ArrayList<FenpeiEntity> list = new ArrayList<>();
        for(Integer id:ids){
            FenpeiEntity fenpeiEntity = new FenpeiEntity();
            fenpeiEntity.setId(id);
            fenpeiEntity.setFenpeiDelete(2);
            list.add(fenpeiEntity);
        }
        if(list != null && list.size() >0){
            fenpeiService.updateBatchById(list);
        }

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
            List<FenpeiEntity> fenpeiList = new ArrayList<>();//上传的东西
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
                            FenpeiEntity fenpeiEntity = new FenpeiEntity();
//                            fenpeiEntity.setRenwuId(Integer.valueOf(data.get(0)));   //任务 要改的
//                            fenpeiEntity.setYonghuId(Integer.valueOf(data.get(0)));   //用户 要改的
//                            fenpeiEntity.setFenpeiTime(sdf.parse(data.get(0)));          //分配时间 要改的
//                            fenpeiEntity.setFenpeiTypes(Integer.valueOf(data.get(0)));   //任务进度 要改的
//                            fenpeiEntity.setFenpeiContent("");//详情和图片
//                            fenpeiEntity.setFenpeiDelete(1);//逻辑删除字段
//                            fenpeiEntity.setInsertTime(date);//时间
//                            fenpeiEntity.setCreateTime(date);//时间
                            fenpeiList.add(fenpeiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        fenpeiService.insertBatch(fenpeiList);
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
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = fenpeiService.queryPage(params);

        //字典表数据转换
        List<FenpeiView> list =(List<FenpeiView>)page.getList();
        for(FenpeiView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Integer id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        FenpeiEntity fenpei = fenpeiService.selectById(id);
            if(fenpei !=null){


                //entity转view
                FenpeiView view = new FenpeiView();
                BeanUtils.copyProperties( fenpei , view );//把实体数据重构到view中

                //级联表
                    RenwuEntity renwu = renwuService.selectById(fenpei.getRenwuId());
                if(renwu != null){
                    BeanUtils.copyProperties( renwu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setRenwuId(renwu.getId());
                }
                //级联表
                    YonghuEntity yonghu = yonghuService.selectById(fenpei.getYonghuId());
                if(yonghu != null){
                    BeanUtils.copyProperties( yonghu , view ,new String[]{ "id", "createTime", "insertTime", "updateTime", "username", "password", "newMoney", "yonghuId"});//把级联的数据添加到view中,并排除id和创建时间字段
                    view.setYonghuId(yonghu.getId());
                }
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
    public R add(@RequestBody FenpeiEntity fenpei, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,fenpei:{}",this.getClass().getName(),fenpei.toString());
        Wrapper<FenpeiEntity> queryWrapper = new EntityWrapper<FenpeiEntity>()
            .eq("renwu_id", fenpei.getRenwuId())
            .eq("yonghu_id", fenpei.getYonghuId())
            .eq("fenpei_types", fenpei.getFenpeiTypes())
            .eq("fenpei_delete", fenpei.getFenpeiDelete())
//            .notIn("fenpei_types", new Integer[]{102})
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        FenpeiEntity fenpeiEntity = fenpeiService.selectOne(queryWrapper);
        if(fenpeiEntity==null){
            fenpei.setFenpeiDelete(1);
            fenpei.setInsertTime(new Date());
            fenpei.setCreateTime(new Date());
        fenpeiService.insert(fenpei);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

