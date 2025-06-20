package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.QingjiaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 员工请假
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("qingjia")
public class QingjiaView extends QingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 请假类型的值
	*/
	@ColumnInfo(comment="请假类型的字典表值",type="varchar(200)")
	private String qingjiaValue;
	/**
	* 申请状态的值
	*/
	@ColumnInfo(comment="申请状态的字典表值",type="varchar(200)")
	private String qingjiaYesnoValue;

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
	//级联表 用户
		/**
		* 用户编号
		*/

		@ColumnInfo(comment="用户编号",type="varchar(200)")
		private String yonghuUuidNumber;
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 用户邮箱
		*/

		@ColumnInfo(comment="用户邮箱",type="varchar(200)")
		private String yonghuEmail;

	//重复字段
			/**
			* 重复字段 的types
			*/
			@ColumnInfo(comment="重复字段 的types",type="Integer")
			private Integer sexTypes;
				@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
				private String sexValue;


	public QingjiaView() {

	}

	public QingjiaView(QingjiaEntity qingjiaEntity) {
		try {
			BeanUtils.copyProperties(this, qingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 请假类型的值
	*/
	public String getQingjiaValue() {
		return qingjiaValue;
	}
	/**
	* 设置： 请假类型的值
	*/
	public void setQingjiaValue(String qingjiaValue) {
		this.qingjiaValue = qingjiaValue;
	}
	//当前表的
	/**
	* 获取： 申请状态的值
	*/
	public String getQingjiaYesnoValue() {
		return qingjiaYesnoValue;
	}
	/**
	* 设置： 申请状态的值
	*/
	public void setQingjiaYesnoValue(String qingjiaYesnoValue) {
		this.qingjiaYesnoValue = qingjiaYesnoValue;
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
	//级联表的get和set 用户

		/**
		* 获取： 用户编号
		*/
		public String getYonghuUuidNumber() {
			return yonghuUuidNumber;
		}
		/**
		* 设置： 用户编号
		*/
		public void setYonghuUuidNumber(String yonghuUuidNumber) {
			this.yonghuUuidNumber = yonghuUuidNumber;
		}

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 用户邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 用户邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}

	//重复字段
			/**
			* 获取： 重复字段 的types
			*/
			public Integer getSexTypes() {
			return sexTypes;
			}
			/**
			* 设置： 重复字段 的types
			*/
			public void setSexTypes(Integer sexTypes) {
			this.sexTypes = sexTypes;
			}
				public String getSexValue() {
				return sexValue;
				}
				public void setSexValue(String sexValue) {
				this.sexValue = sexValue;
				}

	@Override
	public String toString() {
		return "QingjiaView{" +
			", qingjiaValue=" + qingjiaValue +
			", qingjiaYesnoValue=" + qingjiaYesnoValue +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			", jingliUuidNumber=" + jingliUuidNumber +
			", jingliName=" + jingliName +
			", jingliPhone=" + jingliPhone +
			", jingliIdNumber=" + jingliIdNumber +
			", jingliPhoto=" + jingliPhoto +
			", jingliEmail=" + jingliEmail +
			"} " + super.toString();
	}
}
