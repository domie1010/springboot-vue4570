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
 * 任务
 *
 * @author 
 * @email
 */
@TableName("renwu")
public class RenwuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public RenwuEntity() {

	}

	public RenwuEntity(T t) {
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
     * 部门主管
     */
    @ColumnInfo(comment="部门主管",type="int(11)")
    @TableField(value = "jingli_id")

    private Integer jingliId;


    /**
     * 任务名称
     */
    @ColumnInfo(comment="任务名称",type="varchar(200)")
    @TableField(value = "renwu_name")

    private String renwuName;


    /**
     * 任务编号
     */
    @ColumnInfo(comment="任务编号",type="varchar(200)")
    @TableField(value = "renwu_uuid_number")

    private String renwuUuidNumber;


    /**
     * 任务照片
     */
    @ColumnInfo(comment="任务照片",type="varchar(200)")
    @TableField(value = "renwu_photo")

    private String renwuPhoto;


    /**
     * 任务类型
     */
    @ColumnInfo(comment="任务类型",type="int(11)")
    @TableField(value = "renwu_types")

    private Integer renwuTypes;


    /**
     * 文件
     */
    @ColumnInfo(comment="文件",type="varchar(200)")
    @TableField(value = "renwu_file")

    private String renwuFile;


    /**
     * 任务介绍
     */
    @ColumnInfo(comment="任务介绍",type="longtext")
    @TableField(value = "renwu_content")

    private String renwuContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "renwu_delete")

    private Integer renwuDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="录入时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
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
	 * 获取：部门主管
	 */
    public Integer getJingliId() {
        return jingliId;
    }
    /**
	 * 设置：部门主管
	 */

    public void setJingliId(Integer jingliId) {
        this.jingliId = jingliId;
    }
    /**
	 * 获取：任务名称
	 */
    public String getRenwuName() {
        return renwuName;
    }
    /**
	 * 设置：任务名称
	 */

    public void setRenwuName(String renwuName) {
        this.renwuName = renwuName;
    }
    /**
	 * 获取：任务编号
	 */
    public String getRenwuUuidNumber() {
        return renwuUuidNumber;
    }
    /**
	 * 设置：任务编号
	 */

    public void setRenwuUuidNumber(String renwuUuidNumber) {
        this.renwuUuidNumber = renwuUuidNumber;
    }
    /**
	 * 获取：任务照片
	 */
    public String getRenwuPhoto() {
        return renwuPhoto;
    }
    /**
	 * 设置：任务照片
	 */

    public void setRenwuPhoto(String renwuPhoto) {
        this.renwuPhoto = renwuPhoto;
    }
    /**
	 * 获取：任务类型
	 */
    public Integer getRenwuTypes() {
        return renwuTypes;
    }
    /**
	 * 设置：任务类型
	 */

    public void setRenwuTypes(Integer renwuTypes) {
        this.renwuTypes = renwuTypes;
    }
    /**
	 * 获取：文件
	 */
    public String getRenwuFile() {
        return renwuFile;
    }
    /**
	 * 设置：文件
	 */

    public void setRenwuFile(String renwuFile) {
        this.renwuFile = renwuFile;
    }
    /**
	 * 获取：任务介绍
	 */
    public String getRenwuContent() {
        return renwuContent;
    }
    /**
	 * 设置：任务介绍
	 */

    public void setRenwuContent(String renwuContent) {
        this.renwuContent = renwuContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getRenwuDelete() {
        return renwuDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setRenwuDelete(Integer renwuDelete) {
        this.renwuDelete = renwuDelete;
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
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Renwu{" +
            ", id=" + id +
            ", jingliId=" + jingliId +
            ", renwuName=" + renwuName +
            ", renwuUuidNumber=" + renwuUuidNumber +
            ", renwuPhoto=" + renwuPhoto +
            ", renwuTypes=" + renwuTypes +
            ", renwuFile=" + renwuFile +
            ", renwuContent=" + renwuContent +
            ", renwuDelete=" + renwuDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
