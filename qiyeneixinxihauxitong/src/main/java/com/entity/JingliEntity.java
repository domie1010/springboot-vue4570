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
 * 部门经理
 *
 * @author 
 * @email
 */
@TableName("jingli")
public class JingliEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JingliEntity() {

	}

	public JingliEntity(T t) {
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
     * 账户
     */
    @ColumnInfo(comment="账户",type="varchar(200)")
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @ColumnInfo(comment="密码",type="varchar(200)")
    @TableField(value = "password")

    private String password;


    /**
     * 部门经理编号
     */
    @ColumnInfo(comment="部门经理编号",type="varchar(200)")
    @TableField(value = "jingli_uuid_number")

    private String jingliUuidNumber;


    /**
     * 部门经理姓名
     */
    @ColumnInfo(comment="部门经理姓名",type="varchar(200)")
    @TableField(value = "jingli_name")

    private String jingliName;


    /**
     * 部门经理手机号
     */
    @ColumnInfo(comment="部门经理手机号",type="varchar(200)")
    @TableField(value = "jingli_phone")

    private String jingliPhone;


    /**
     * 部门经理身份证号
     */
    @ColumnInfo(comment="部门经理身份证号",type="varchar(200)")
    @TableField(value = "jingli_id_number")

    private String jingliIdNumber;


    /**
     * 部门经理头像
     */
    @ColumnInfo(comment="部门经理头像",type="varchar(200)")
    @TableField(value = "jingli_photo")

    private String jingliPhoto;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 部门经理邮箱
     */
    @ColumnInfo(comment="部门经理邮箱",type="varchar(200)")
    @TableField(value = "jingli_email")

    private String jingliEmail;


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
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 设置：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 设置：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：部门经理编号
	 */
    public String getJingliUuidNumber() {
        return jingliUuidNumber;
    }
    /**
	 * 设置：部门经理编号
	 */

    public void setJingliUuidNumber(String jingliUuidNumber) {
        this.jingliUuidNumber = jingliUuidNumber;
    }
    /**
	 * 获取：部门经理姓名
	 */
    public String getJingliName() {
        return jingliName;
    }
    /**
	 * 设置：部门经理姓名
	 */

    public void setJingliName(String jingliName) {
        this.jingliName = jingliName;
    }
    /**
	 * 获取：部门经理手机号
	 */
    public String getJingliPhone() {
        return jingliPhone;
    }
    /**
	 * 设置：部门经理手机号
	 */

    public void setJingliPhone(String jingliPhone) {
        this.jingliPhone = jingliPhone;
    }
    /**
	 * 获取：部门经理身份证号
	 */
    public String getJingliIdNumber() {
        return jingliIdNumber;
    }
    /**
	 * 设置：部门经理身份证号
	 */

    public void setJingliIdNumber(String jingliIdNumber) {
        this.jingliIdNumber = jingliIdNumber;
    }
    /**
	 * 获取：部门经理头像
	 */
    public String getJingliPhoto() {
        return jingliPhoto;
    }
    /**
	 * 设置：部门经理头像
	 */

    public void setJingliPhoto(String jingliPhoto) {
        this.jingliPhoto = jingliPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：部门经理邮箱
	 */
    public String getJingliEmail() {
        return jingliEmail;
    }
    /**
	 * 设置：部门经理邮箱
	 */

    public void setJingliEmail(String jingliEmail) {
        this.jingliEmail = jingliEmail;
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
        return "Jingli{" +
            ", id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", jingliUuidNumber=" + jingliUuidNumber +
            ", jingliName=" + jingliName +
            ", jingliPhone=" + jingliPhone +
            ", jingliIdNumber=" + jingliIdNumber +
            ", jingliPhoto=" + jingliPhoto +
            ", sexTypes=" + sexTypes +
            ", jingliEmail=" + jingliEmail +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}
