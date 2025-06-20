package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.RenwuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 任务
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("renwu")
public class RenwuView extends RenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 任务类型的值
	*/
	@ColumnInfo(comment="任务类型的字典表值",type="varchar(200)")
	private String renwuValue;

	//级联表 部门经理
		/**
		* 部门经理编号
		*/

		@ColumnInfo(comment="部门经理编号",type="varchar(200)")
		private String jingliUuidNumber;
		/**
		* 部门经理姓名
		*/

		@ColumnInfo(comment="部门经理姓名",type="varchar(200)")
		private String jingliName;
		/**
		* 部门经理手机号
		*/

		@ColumnInfo(comment="部门经理手机号",type="varchar(200)")
		private String jingliPhone;
		/**
		* 部门经理身份证号
		*/

		@ColumnInfo(comment="部门经理身份证号",type="varchar(200)")
		private String jingliIdNumber;
		/**
		* 部门经理头像
		*/

		@ColumnInfo(comment="部门经理头像",type="varchar(200)")
		private String jingliPhoto;
		/**
		* 部门经理邮箱
		*/

		@ColumnInfo(comment="部门经理邮箱",type="varchar(200)")
		private String jingliEmail;



	public RenwuView() {

	}

	public RenwuView(RenwuEntity renwuEntity) {
		try {
			BeanUtils.copyProperties(this, renwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 任务类型的值
	*/
	public String getRenwuValue() {
		return renwuValue;
	}
	/**
	* 设置： 任务类型的值
	*/
	public void setRenwuValue(String renwuValue) {
		this.renwuValue = renwuValue;
	}


	//级联表的get和set 部门经理

		/**
		* 获取： 部门经理编号
		*/
		public String getJingliUuidNumber() {
			return jingliUuidNumber;
		}
		/**
		* 设置： 部门经理编号
		*/
		public void setJingliUuidNumber(String jingliUuidNumber) {
			this.jingliUuidNumber = jingliUuidNumber;
		}

		/**
		* 获取： 部门经理姓名
		*/
		public String getJingliName() {
			return jingliName;
		}
		/**
		* 设置： 部门经理姓名
		*/
		public void setJingliName(String jingliName) {
			this.jingliName = jingliName;
		}

		/**
		* 获取： 部门经理手机号
		*/
		public String getJingliPhone() {
			return jingliPhone;
		}
		/**
		* 设置： 部门经理手机号
		*/
		public void setJingliPhone(String jingliPhone) {
			this.jingliPhone = jingliPhone;
		}

		/**
		* 获取： 部门经理身份证号
		*/
		public String getJingliIdNumber() {
			return jingliIdNumber;
		}
		/**
		* 设置： 部门经理身份证号
		*/
		public void setJingliIdNumber(String jingliIdNumber) {
			this.jingliIdNumber = jingliIdNumber;
		}

		/**
		* 获取： 部门经理头像
		*/
		public String getJingliPhoto() {
			return jingliPhoto;
		}
		/**
		* 设置： 部门经理头像
		*/
		public void setJingliPhoto(String jingliPhoto) {
			this.jingliPhoto = jingliPhoto;
		}

		/**
		* 获取： 部门经理邮箱
		*/
		public String getJingliEmail() {
			return jingliEmail;
		}
		/**
		* 设置： 部门经理邮箱
		*/
		public void setJingliEmail(String jingliEmail) {
			this.jingliEmail = jingliEmail;
		}


	@Override
	public String toString() {
		return "RenwuView{" +
			", renwuValue=" + renwuValue +
			", jingliUuidNumber=" + jingliUuidNumber +
			", jingliName=" + jingliName +
			", jingliPhone=" + jingliPhone +
			", jingliIdNumber=" + jingliIdNumber +
			", jingliPhoto=" + jingliPhoto +
			", jingliEmail=" + jingliEmail +
			"} " + super.toString();
	}
}
