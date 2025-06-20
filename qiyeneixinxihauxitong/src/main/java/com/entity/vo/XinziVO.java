package com.entity.vo;

import com.entity.XinziEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 薪资
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xinzi")
public class XinziVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 薪资编号
     */

    @TableField(value = "xinzi_uuid_number")
    private String xinziUuidNumber;


    /**
     * 标题
     */

    @TableField(value = "xinzi_name")
    private String xinziName;


    /**
     * 月份
     */

    @TableField(value = "xinzi_month")
    private String xinziMonth;


    /**
     * 岗位工资
     */

    @TableField(value = "jiben_jine")
    private Double jibenJine;


    /**
     * 薪级工资
     */

    @TableField(value = "jiangjin_jine")
    private Double jiangjinJine;


    /**
     * 房帖
     */

    @TableField(value = "jiangjin_fangtie")
    private Double jiangjinFangtie;


    /**
     * 公积金
     */

    @TableField(value = "jiangjin_jijin")
    private Double jiangjinJijin;


    /**
     * 业绩津贴
     */

    @TableField(value = "jixiao_jine")
    private Double jixiaoJine;


    /**
     * 扣公积金
     */

    @TableField(value = "jixiao_gongjijin")
    private Double jixiaoGongjijin;


    /**
     * 扣医保
     */

    @TableField(value = "jixiao_yibao")
    private Double jixiaoYibao;


    /**
     * 扣养老保险
     */

    @TableField(value = "jixiao_yanglao")
    private Double jixiaoYanglao;


    /**
     * 扣失保金
     */

    @TableField(value = "jixiao_shibao")
    private Double jixiaoShibao;


    /**
     * 扣税款
     */

    @TableField(value = "jixiao_koushui")
    private Double jixiaoKoushui;


    /**
     * 事假扣款
     */

    @TableField(value = "jixiao_shijia")
    private Double jixiaoShijia;


    /**
     * 病假扣款
     */

    @TableField(value = "jixiao_bingjia")
    private Double jixiaoBingjia;


    /**
     * 应扣小计
     */

    @TableField(value = "xiaoji_yingkou")
    private Double xiaojiYingkou;


    /**
     * 应发小计
     */

    @TableField(value = "xiaoji_yingfa")
    private Double xiaojiYingfa;


    /**
     * 实发
     */

    @TableField(value = "shifa_jine")
    private Double shifaJine;


    /**
     * 备注
     */

    @TableField(value = "xinzi_content")
    private String xinziContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：薪资编号
	 */
    public String getXinziUuidNumber() {
        return xinziUuidNumber;
    }


    /**
	 * 获取：薪资编号
	 */

    public void setXinziUuidNumber(String xinziUuidNumber) {
        this.xinziUuidNumber = xinziUuidNumber;
    }
    /**
	 * 设置：标题
	 */
    public String getXinziName() {
        return xinziName;
    }


    /**
	 * 获取：标题
	 */

    public void setXinziName(String xinziName) {
        this.xinziName = xinziName;
    }
    /**
	 * 设置：月份
	 */
    public String getXinziMonth() {
        return xinziMonth;
    }


    /**
	 * 获取：月份
	 */

    public void setXinziMonth(String xinziMonth) {
        this.xinziMonth = xinziMonth;
    }
    /**
	 * 设置：岗位工资
	 */
    public Double getJibenJine() {
        return jibenJine;
    }


    /**
	 * 获取：岗位工资
	 */

    public void setJibenJine(Double jibenJine) {
        this.jibenJine = jibenJine;
    }
    /**
	 * 设置：薪级工资
	 */
    public Double getJiangjinJine() {
        return jiangjinJine;
    }


    /**
	 * 获取：薪级工资
	 */

    public void setJiangjinJine(Double jiangjinJine) {
        this.jiangjinJine = jiangjinJine;
    }
    /**
	 * 设置：房帖
	 */
    public Double getJiangjinFangtie() {
        return jiangjinFangtie;
    }


    /**
	 * 获取：房帖
	 */

    public void setJiangjinFangtie(Double jiangjinFangtie) {
        this.jiangjinFangtie = jiangjinFangtie;
    }
    /**
	 * 设置：公积金
	 */
    public Double getJiangjinJijin() {
        return jiangjinJijin;
    }


    /**
	 * 获取：公积金
	 */

    public void setJiangjinJijin(Double jiangjinJijin) {
        this.jiangjinJijin = jiangjinJijin;
    }
    /**
	 * 设置：业绩津贴
	 */
    public Double getJixiaoJine() {
        return jixiaoJine;
    }


    /**
	 * 获取：业绩津贴
	 */

    public void setJixiaoJine(Double jixiaoJine) {
        this.jixiaoJine = jixiaoJine;
    }
    /**
	 * 设置：扣公积金
	 */
    public Double getJixiaoGongjijin() {
        return jixiaoGongjijin;
    }


    /**
	 * 获取：扣公积金
	 */

    public void setJixiaoGongjijin(Double jixiaoGongjijin) {
        this.jixiaoGongjijin = jixiaoGongjijin;
    }
    /**
	 * 设置：扣医保
	 */
    public Double getJixiaoYibao() {
        return jixiaoYibao;
    }


    /**
	 * 获取：扣医保
	 */

    public void setJixiaoYibao(Double jixiaoYibao) {
        this.jixiaoYibao = jixiaoYibao;
    }
    /**
	 * 设置：扣养老保险
	 */
    public Double getJixiaoYanglao() {
        return jixiaoYanglao;
    }


    /**
	 * 获取：扣养老保险
	 */

    public void setJixiaoYanglao(Double jixiaoYanglao) {
        this.jixiaoYanglao = jixiaoYanglao;
    }
    /**
	 * 设置：扣失保金
	 */
    public Double getJixiaoShibao() {
        return jixiaoShibao;
    }


    /**
	 * 获取：扣失保金
	 */

    public void setJixiaoShibao(Double jixiaoShibao) {
        this.jixiaoShibao = jixiaoShibao;
    }
    /**
	 * 设置：扣税款
	 */
    public Double getJixiaoKoushui() {
        return jixiaoKoushui;
    }


    /**
	 * 获取：扣税款
	 */

    public void setJixiaoKoushui(Double jixiaoKoushui) {
        this.jixiaoKoushui = jixiaoKoushui;
    }
    /**
	 * 设置：事假扣款
	 */
    public Double getJixiaoShijia() {
        return jixiaoShijia;
    }


    /**
	 * 获取：事假扣款
	 */

    public void setJixiaoShijia(Double jixiaoShijia) {
        this.jixiaoShijia = jixiaoShijia;
    }
    /**
	 * 设置：病假扣款
	 */
    public Double getJixiaoBingjia() {
        return jixiaoBingjia;
    }


    /**
	 * 获取：病假扣款
	 */

    public void setJixiaoBingjia(Double jixiaoBingjia) {
        this.jixiaoBingjia = jixiaoBingjia;
    }
    /**
	 * 设置：应扣小计
	 */
    public Double getXiaojiYingkou() {
        return xiaojiYingkou;
    }


    /**
	 * 获取：应扣小计
	 */

    public void setXiaojiYingkou(Double xiaojiYingkou) {
        this.xiaojiYingkou = xiaojiYingkou;
    }
    /**
	 * 设置：应发小计
	 */
    public Double getXiaojiYingfa() {
        return xiaojiYingfa;
    }


    /**
	 * 获取：应发小计
	 */

    public void setXiaojiYingfa(Double xiaojiYingfa) {
        this.xiaojiYingfa = xiaojiYingfa;
    }
    /**
	 * 设置：实发
	 */
    public Double getShifaJine() {
        return shifaJine;
    }


    /**
	 * 获取：实发
	 */

    public void setShifaJine(Double shifaJine) {
        this.shifaJine = shifaJine;
    }
    /**
	 * 设置：备注
	 */
    public String getXinziContent() {
        return xinziContent;
    }


    /**
	 * 获取：备注
	 */

    public void setXinziContent(String xinziContent) {
        this.xinziContent = xinziContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
