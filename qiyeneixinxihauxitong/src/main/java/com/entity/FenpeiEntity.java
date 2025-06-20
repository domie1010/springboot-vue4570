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
 * 任务分配
 *
 * @author 
 * @email
 */
@TableName("fenpei")
public class FenpeiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FenpeiEntity() {

	}

	public FenpeiEntity(T t) {
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
     * 任务
     */
    @ColumnInfo(comment="任务",type="int(11)")
    @TableField(value = "renwu_id")

    private Integer renwuId;


    /**
     * 用户
     */
    @ColumnInfo(comment="用户",type="int(11)")
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 分配时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="分配时间",type="timestamp")
    @TableField(value = "fenpei_time")

    private Date fenpeiTime;


    /**
     * 任务进度
     */
    @ColumnInfo(comment="任务进度",type="int(11)")
    @TableField(value = "fenpei_types")

    private Integer fenpeiTypes;


    /**
     * 任务分配介绍
     */
    @ColumnInfo(comment="任务分配介绍",type="longtext")
    @TableField(value = "fenpei_content")

    private String fenpeiContent;


    /**
     * 逻辑删除
     */
    @ColumnInfo(comment="逻辑删除",type="int(11)")
    @TableField(value = "fenpei_delete")

    private Integer fenpeiDelete;


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
	 * 获取：任务
	 */
    public Integer getRenwuId() {
        return renwuId;
    }
    /**
	 * 设置：任务
	 */

    public void setRenwuId(Integer renwuId) {
        this.renwuId = renwuId;
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
	 * 获取：分配时间
	 */
    public Date getFenpeiTime() {
        return fenpeiTime;
    }
    /**
	 * 设置：分配时间
	 */

    public void setFenpeiTime(Date fenpeiTime) {
        this.fenpeiTime = fenpeiTime;
    }
    /**
	 * 获取：任务进度
	 */
    public Integer getFenpeiTypes() {
        return fenpeiTypes;
    }
    /**
	 * 设置：任务进度
	 */

    public void setFenpeiTypes(Integer fenpeiTypes) {
        this.fenpeiTypes = fenpeiTypes;
    }
    /**
	 * 获取：任务分配介绍
	 */
    public String getFenpeiContent() {
        return fenpeiContent;
    }
    /**
	 * 设置：任务分配介绍
	 */

    public void setFenpeiContent(String fenpeiContent) {
        this.fenpeiContent = fenpeiContent;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getFenpeiDelete() {
        return fenpeiDelete;
    }
    /**
	 * 设置：逻辑删除
	 */

    public void setFenpeiDelete(Integer fenpeiDelete) {
        this.fenpeiDelete = fenpeiDelete;
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
        return "Fenpei{" +
            ", id=" + id +
            ", renwuId=" + renwuId +
            ", yonghuId=" + yonghuId +
            ", fenpeiTime=" + DateUtil.convertString(fenpeiTime,"yyyy-MM-dd") +
            ", fenpeiTypes=" + fenpeiTypes +
            ", fenpeiContent=" + fenpeiContent +
            ", fenpeiDelete=" + fenpeiDelete +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
