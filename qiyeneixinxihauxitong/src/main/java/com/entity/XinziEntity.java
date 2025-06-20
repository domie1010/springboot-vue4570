package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 薪资
 *
 * @author 
 * @email
 */
@TableName("xinzi")
public class XinziEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinziEntity() {

	}

	public XinziEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 薪资编号
     */
    @ColumnInfo(comment="薪资编号",type="varchar(200)")
    @TableField(value = "xinzi_uuid_number")

    private String xinziUuidNumber;


    /**
     * 标题
     */
    @ColumnInfo(comment="标题",type="varchar(200)")
    @TableField(value = "xinzi_name")

    private String xinziName;


    /**
     * 月份
     */
    @ColumnInfo(comment="月份",type="varchar(200)")
    @TableField(value = "xinzi_month")

    private String xinziMonth;


    /**
     * 岗位工资
     */
    @ColumnInfo(comment="岗位工资",type="decimal(10,2)")
    @TableField(value = "jiben_jine")

    private Double jibenJine;


    /**
     * 薪级工资
     */
    @ColumnInfo(comment="薪级工资",type="decimal(10,2)")
    @TableField(value = "jiangjin_jine")

    private Double jiangjinJine;


    /**
     * 房帖
     */
    @ColumnInfo(comment="房帖",type="decimal(10,2)")
    @TableField(value = "jiangjin_fangtie")

    private Double jiangjinFangtie;


    /**
     * 公积金
     */
    @ColumnInfo(comment="公积金",type="decimal(10,2)")
    @TableField(value = "jiangjin_jijin")

    private Double jiangjinJijin;


    /**
     * 业绩津贴
     */
    @ColumnInfo(comment="业绩津贴",type="decimal(10,2)")
    @TableField(value = "jixiao_jine")

    private Double jixiaoJine;


    /**
     * 扣公积金
     */
    @ColumnInfo(comment="扣公积金",type="decimal(10,2)")
    @TableField(value = "jixiao_gongjijin")

    private Double jixiaoGongjijin;


    /**
     * 扣医保
     */
    @ColumnInfo(comment="扣医保",type="decimal(10,2)")
    @TableField(value = "jixiao_yibao")

    private Double jixiaoYibao;


    /**
     * 扣养老保险
     */
    @ColumnInfo(comment="扣养老保险",type="decimal(10,2)")
    @TableField(value = "jixiao_yanglao")

    private Double jixiaoYanglao;


    /**
     * 扣失保金
     */
    @ColumnInfo(comment="扣失保金",type="decimal(10,2)")
    @TableField(value = "jixiao_shibao")

    private Double jixiaoShibao;


    /**
     * 扣税款
     */
    @ColumnInfo(comment="扣税款",type="decimal(10,2)")
    @TableField(value = "jixiao_koushui")

    private Double jixiaoKoushui;


    /**
     * 事假扣款
     */
    @ColumnInfo(comment="事假扣款",type="decimal(10,2)")
    @TableField(value = "jixiao_shijia")

    private Double jixiaoShijia;


    /**
     * 病假扣款
     */
    @ColumnInfo(comment="病假扣款",type="decimal(10,2)")
    @TableField(value = "jixiao_bingjia")

    private Double jixiaoBingjia;


    /**
     * 应扣小计
     */
    @ColumnInfo(comment="应扣小计",type="decimal(10,2)")
    @TableField(value = "xiaoji_yingkou")

    private Double xiaojiYingkou;


    /**
     * 应发小计
     */
    @ColumnInfo(comment="应发小计",type="decimal(10,2)")
    @TableField(value = "xiaoji_yingfa")

    private Double xiaojiYingfa;


    /**
     * 实发
     */
    @ColumnInfo(comment="实发",type="decimal(10,2)")
    @TableField(value = "shifa_jine")

    private Double shifaJine;


    /**
     * 备注
     */
    @ColumnInfo(comment="备注",type="longtext")
    @TableField(value = "xinzi_content")

    private String xinziContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="添加时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间  listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xinzi{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", xinziUuidNumber=" + xinziUuidNumber +
            ", xinziName=" + xinziName +
            ", xinziMonth=" + xinziMonth +
            ", jibenJine=" + jibenJine +
            ", jiangjinJine=" + jiangjinJine +
            ", jiangjinFangtie=" + jiangjinFangtie +
            ", jiangjinJijin=" + jiangjinJijin +
            ", jixiaoJine=" + jixiaoJine +
            ", jixiaoGongjijin=" + jixiaoGongjijin +
            ", jixiaoYibao=" + jixiaoYibao +
            ", jixiaoYanglao=" + jixiaoYanglao +
            ", jixiaoShibao=" + jixiaoShibao +
            ", jixiaoKoushui=" + jixiaoKoushui +
            ", jixiaoShijia=" + jixiaoShijia +
            ", jixiaoBingjia=" + jixiaoBingjia +
            ", xiaojiYingkou=" + xiaojiYingkou +
            ", xiaojiYingfa=" + xiaojiYingfa +
            ", shifaJine=" + shifaJine +
            ", xinziContent=" + xinziContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
