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
 * 基本信息
 *
 * @author 
 * @email
 */
@TableName("xinxi")
public class XinxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinxiEntity() {

	}

	public XinxiEntity(T t) {
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
     * 基本信息名称
     */
    @ColumnInfo(comment="基本信息名称",type="varchar(200)")
    @TableField(value = "xinxi_name")

    private String xinxiName;


    /**
     * 基本信息编号
     */
    @ColumnInfo(comment="基本信息编号",type="varchar(200)")
    @TableField(value = "xinxi_uuid_number")

    private String xinxiUuidNumber;


    /**
     * 毕业院校
     */
    @ColumnInfo(comment="毕业院校",type="varchar(200)")
    @TableField(value = "xinxi_yuanxiao")

    private String xinxiYuanxiao;


    /**
     * 专业
     */
    @ColumnInfo(comment="专业",type="varchar(200)")
    @TableField(value = "xinxi_zhuanye")

    private String xinxiZhuanye;


    /**
     * 最终学位
     */
    @ColumnInfo(comment="最终学位",type="varchar(200)")
    @TableField(value = "xinxi_xuewei")

    private String xinxiXuewei;


    /**
     * 家庭住址
     */
    @ColumnInfo(comment="家庭住址",type="varchar(200)")
    @TableField(value = "xinxi_address")

    private String xinxiAddress;


    /**
     * 车牌号
     */
    @ColumnInfo(comment="车牌号",type="varchar(200)")
    @TableField(value = "xinxi_chepai")

    private String xinxiChepai;


    /**
     * 办公地点
     */
    @ColumnInfo(comment="办公地点",type="varchar(200)")
    @TableField(value = "xinxi_didian")

    private String xinxiDidian;


    /**
     * 健康状况
     */
    @ColumnInfo(comment="健康状况",type="int(11)")
    @TableField(value = "xinxi_types")

    private Integer xinxiTypes;


    /**
     * 入职时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @ColumnInfo(comment="入职时间",type="date")
    @TableField(value = "xinxi_time")

    private Date xinxiTime;


    /**
     * 基本信息介绍
     */
    @ColumnInfo(comment="基本信息介绍",type="longtext")
    @TableField(value = "xinxi_content")

    private String xinxiContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "xinxi_delete")

    private Integer xinxiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间   listShow
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
	 * 获取：基本信息名称
	 */
    public String getXinxiName() {
        return xinxiName;
    }
    /**
	 * 设置：基本信息名称
	 */

    public void setXinxiName(String xinxiName) {
        this.xinxiName = xinxiName;
    }
    /**
	 * 获取：基本信息编号
	 */
    public String getXinxiUuidNumber() {
        return xinxiUuidNumber;
    }
    /**
	 * 设置：基本信息编号
	 */

    public void setXinxiUuidNumber(String xinxiUuidNumber) {
        this.xinxiUuidNumber = xinxiUuidNumber;
    }
    /**
	 * 获取：毕业院校
	 */
    public String getXinxiYuanxiao() {
        return xinxiYuanxiao;
    }
    /**
	 * 设置：毕业院校
	 */

    public void setXinxiYuanxiao(String xinxiYuanxiao) {
        this.xinxiYuanxiao = xinxiYuanxiao;
    }
    /**
	 * 获取：专业
	 */
    public String getXinxiZhuanye() {
        return xinxiZhuanye;
    }
    /**
	 * 设置：专业
	 */

    public void setXinxiZhuanye(String xinxiZhuanye) {
        this.xinxiZhuanye = xinxiZhuanye;
    }
    /**
	 * 获取：最终学位
	 */
    public String getXinxiXuewei() {
        return xinxiXuewei;
    }
    /**
	 * 设置：最终学位
	 */

    public void setXinxiXuewei(String xinxiXuewei) {
        this.xinxiXuewei = xinxiXuewei;
    }
    /**
	 * 获取：家庭住址
	 */
    public String getXinxiAddress() {
        return xinxiAddress;
    }
    /**
	 * 设置：家庭住址
	 */

    public void setXinxiAddress(String xinxiAddress) {
        this.xinxiAddress = xinxiAddress;
    }
    /**
	 * 获取：车牌号
	 */
    public String getXinxiChepai() {
        return xinxiChepai;
    }
    /**
	 * 设置：车牌号
	 */

    public void setXinxiChepai(String xinxiChepai) {
        this.xinxiChepai = xinxiChepai;
    }
    /**
	 * 获取：办公地点
	 */
    public String getXinxiDidian() {
        return xinxiDidian;
    }
    /**
	 * 设置：办公地点
	 */

    public void setXinxiDidian(String xinxiDidian) {
        this.xinxiDidian = xinxiDidian;
    }
    /**
	 * 获取：健康状况
	 */
    public Integer getXinxiTypes() {
        return xinxiTypes;
    }
    /**
	 * 设置：健康状况
	 */

    public void setXinxiTypes(Integer xinxiTypes) {
        this.xinxiTypes = xinxiTypes;
    }
    /**
	 * 获取：入职时间
	 */
    public Date getXinxiTime() {
        return xinxiTime;
    }
    /**
	 * 设置：入职时间
	 */

    public void setXinxiTime(Date xinxiTime) {
        this.xinxiTime = xinxiTime;
    }
    /**
	 * 获取：基本信息介绍
	 */
    public String getXinxiContent() {
        return xinxiContent;
    }
    /**
	 * 设置：基本信息介绍
	 */

    public void setXinxiContent(String xinxiContent) {
        this.xinxiContent = xinxiContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getXinxiDelete() {
        return xinxiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setXinxiDelete(Integer xinxiDelete) {
        this.xinxiDelete = xinxiDelete;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 设置：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间   listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间   listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xinxi{" +
            ", id=" + id +
            ", yonghuId=" + yonghuId +
            ", xinxiName=" + xinxiName +
            ", xinxiUuidNumber=" + xinxiUuidNumber +
            ", xinxiYuanxiao=" + xinxiYuanxiao +
            ", xinxiZhuanye=" + xinxiZhuanye +
            ", xinxiXuewei=" + xinxiXuewei +
            ", xinxiAddress=" + xinxiAddress +
            ", xinxiChepai=" + xinxiChepai +
            ", xinxiDidian=" + xinxiDidian +
            ", xinxiTypes=" + xinxiTypes +
            ", xinxiTime=" + DateUtil.convertString(xinxiTime,"yyyy-MM-dd") +
            ", xinxiContent=" + xinxiContent +
            ", xinxiDelete=" + xinxiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
