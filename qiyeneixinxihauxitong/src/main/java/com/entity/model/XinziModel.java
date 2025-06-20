package com.entity.model;

import com.entity.XinziEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 薪资
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XinziModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 薪资编号
     */
    private String xinziUuidNumber;


    /**
     * 标题
     */
    private String xinziName;


    /**
     * 月份
     */
    private String xinziMonth;


    /**
     * 岗位工资
     */
    private Double jibenJine;


    /**
     * 薪级工资
     */
    private Double jiangjinJine;


    /**
     * 房帖
     */
    private Double jiangjinFangtie;


    /**
     * 公积金
     */
    private Double jiangjinJijin;


    /**
     * 业绩津贴
     */
    private Double jixiaoJine;


    /**
     * 扣公积金
     */
    private Double jixiaoGongjijin;


    /**
     * 扣医保
     */
    private Double jixiaoYibao;


    /**
     * 扣养老保险
     */
    private Double jixiaoYanglao;


    /**
     * 扣失保金
     */
    private Double jixiaoShibao;


    /**
     * 扣税款
     */
    private Double jixiaoKoushui;


    /**
     * 事假扣款
     */
    private Double jixiaoShijia;


    /**
     * 病假扣款
     */
    private Double jixiaoBingjia;


    /**
     * 应扣小计
     */
    private Double xiaojiYingkou;


    /**
     * 应发小计
     */
    private Double xiaojiYingfa;


    /**
     * 实发
     */
    private Double shifaJine;


    /**
     * 备注
     */
    private String xinziContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：薪资编号
	 */
    public String getXinziUuidNumber() {
        return xinziUuidNumber;
    }


    /**
	 * 设置：薪资编号
	 */
    public void setXinziUuidNumber(String xinziUuidNumber) {
        this.xinziUuidNumber = xinziUuidNumber;
    }
    /**
	 * 获取：标题
	 */
    public String getXinziName() {
        return xinziName;
    }


    /**
	 * 设置：标题
	 */
    public void setXinziName(String xinziName) {
        this.xinziName = xinziName;
    }
    /**
	 * 获取：月份
	 */
    public String getXinziMonth() {
        return xinziMonth;
    }


    /**
	 * 设置：月份
	 */
    public void setXinziMonth(String xinziMonth) {
        this.xinziMonth = xinziMonth;
    }
    /**
	 * 获取：岗位工资
	 */
    public Double getJibenJine() {
        return jibenJine;
    }


    /**
	 * 设置：岗位工资
	 */
    public void setJibenJine(Double jibenJine) {
        this.jibenJine = jibenJine;
    }
    /**
	 * 获取：薪级工资
	 */
    public Double getJiangjinJine() {
        return jiangjinJine;
    }


    /**
	 * 设置：薪级工资
	 */
    public void setJiangjinJine(Double jiangjinJine) {
        this.jiangjinJine = jiangjinJine;
    }
    /**
	 * 获取：房帖
	 */
    public Double getJiangjinFangtie() {
        return jiangjinFangtie;
    }


    /**
	 * 设置：房帖
	 */
    public void setJiangjinFangtie(Double jiangjinFangtie) {
        this.jiangjinFangtie = jiangjinFangtie;
    }
    /**
	 * 获取：公积金
	 */
    public Double getJiangjinJijin() {
        return jiangjinJijin;
    }


    /**
	 * 设置：公积金
	 */
    public void setJiangjinJijin(Double jiangjinJijin) {
        this.jiangjinJijin = jiangjinJijin;
    }
    /**
	 * 获取：业绩津贴
	 */
    public Double getJixiaoJine() {
        return jixiaoJine;
    }


    /**
	 * 设置：业绩津贴
	 */
    public void setJixiaoJine(Double jixiaoJine) {
        this.jixiaoJine = jixiaoJine;
    }
    /**
	 * 获取：扣公积金
	 */
    public Double getJixiaoGongjijin() {
        return jixiaoGongjijin;
    }


    /**
	 * 设置：扣公积金
	 */
    public void setJixiaoGongjijin(Double jixiaoGongjijin) {
        this.jixiaoGongjijin = jixiaoGongjijin;
    }
    /**
	 * 获取：扣医保
	 */
    public Double getJixiaoYibao() {
        return jixiaoYibao;
    }


    /**
	 * 设置：扣医保
	 */
    public void setJixiaoYibao(Double jixiaoYibao) {
        this.jixiaoYibao = jixiaoYibao;
    }
    /**
	 * 获取：扣养老保险
	 */
    public Double getJixiaoYanglao() {
        return jixiaoYanglao;
    }


    /**
	 * 设置：扣养老保险
	 */
    public void setJixiaoYanglao(Double jixiaoYanglao) {
        this.jixiaoYanglao = jixiaoYanglao;
    }
    /**
	 * 获取：扣失保金
	 */
    public Double getJixiaoShibao() {
        return jixiaoShibao;
    }


    /**
	 * 设置：扣失保金
	 */
    public void setJixiaoShibao(Double jixiaoShibao) {
        this.jixiaoShibao = jixiaoShibao;
    }
    /**
	 * 获取：扣税款
	 */
    public Double getJixiaoKoushui() {
        return jixiaoKoushui;
    }


    /**
	 * 设置：扣税款
	 */
    public void setJixiaoKoushui(Double jixiaoKoushui) {
        this.jixiaoKoushui = jixiaoKoushui;
    }
    /**
	 * 获取：事假扣款
	 */
    public Double getJixiaoShijia() {
        return jixiaoShijia;
    }


    /**
	 * 设置：事假扣款
	 */
    public void setJixiaoShijia(Double jixiaoShijia) {
        this.jixiaoShijia = jixiaoShijia;
    }
    /**
	 * 获取：病假扣款
	 */
    public Double getJixiaoBingjia() {
        return jixiaoBingjia;
    }


    /**
	 * 设置：病假扣款
	 */
    public void setJixiaoBingjia(Double jixiaoBingjia) {
        this.jixiaoBingjia = jixiaoBingjia;
    }
    /**
	 * 获取：应扣小计
	 */
    public Double getXiaojiYingkou() {
        return xiaojiYingkou;
    }


    /**
	 * 设置：应扣小计
	 */
    public void setXiaojiYingkou(Double xiaojiYingkou) {
        this.xiaojiYingkou = xiaojiYingkou;
    }
    /**
	 * 获取：应发小计
	 */
    public Double getXiaojiYingfa() {
        return xiaojiYingfa;
    }


    /**
	 * 设置：应发小计
	 */
    public void setXiaojiYingfa(Double xiaojiYingfa) {
        this.xiaojiYingfa = xiaojiYingfa;
    }
    /**
	 * 获取：实发
	 */
    public Double getShifaJine() {
        return shifaJine;
    }


    /**
	 * 设置：实发
	 */
    public void setShifaJine(Double shifaJine) {
        this.shifaJine = shifaJine;
    }
    /**
	 * 获取：备注
	 */
    public String getXinziContent() {
        return xinziContent;
    }


    /**
	 * 设置：备注
	 */
    public void setXinziContent(String xinziContent) {
        this.xinziContent = xinziContent;
    }
    /**
	 * 获取：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：添加时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
