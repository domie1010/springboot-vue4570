package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.FenpeiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 任务分配
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("fenpei")
public class FenpeiView extends FenpeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 任务进度的值
	*/
	@ColumnInfo(comment="任务进度的字典表值",type="varchar(200)")
	private String fenpeiValue;

	//级联表 任务
					 
		/**
		* 任务 的 部门主管
		*/
		@ColumnInfo(comment="部门主管",type="int(11)")
		private Integer renwuJingliId;
		/**
		* 任务名称
		*/

		@ColumnInfo(comment="任务名称",type="varchar(200)")
		private String renwuName;
		/**
		* 任务编号
		*/

		@ColumnInfo(comment="任务编号",type="varchar(200)")
		private String renwuUuidNumber;
		/**
		* 任务照片
		*/

		@ColumnInfo(comment="任务照片",type="varchar(200)")
		private String renwuPhoto;
		/**
		* 任务类型
		*/
		@ColumnInfo(comment="任务类型",type="int(11)")
		private Integer renwuTypes;
			/**
			* 任务类型的值
			*/
			@ColumnInfo(comment="任务类型的字典表值",type="varchar(200)")
			private String renwuValue;
		/**
		* 文件
		*/

		@ColumnInfo(comment="文件",type="varchar(200)")
		private String renwuFile;
		/**
		* 任务介绍
		*/

		@ColumnInfo(comment="任务介绍",type="longtext")
		private String renwuContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer renwuDelete;
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



	public FenpeiView() {

	}

	public FenpeiView(FenpeiEntity fenpeiEntity) {
		try {
			BeanUtils.copyProperties(this, fenpeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 任务进度的值
	*/
	public String getFenpeiValue() {
		return fenpeiValue;
	}
	/**
	* 设置： 任务进度的值
	*/
	public void setFenpeiValue(String fenpeiValue) {
		this.fenpeiValue = fenpeiValue;
	}


	//级联表的get和set 任务
		/**
		* 获取：任务 的 部门主管
		*/
		public Integer getRenwuJingliId() {
			return renwuJingliId;
		}
		/**
		* 设置：任务 的 部门主管
		*/
		public void setRenwuJingliId(Integer renwuJingliId) {
			this.renwuJingliId = renwuJingliId;
		}

		/**
		* 获取： 任务名称
		*/
		public String getRenwuName() {
			return renwuName;
		}
		/**
		* 设置： 任务名称
		*/
		public void setRenwuName(String renwuName) {
			this.renwuName = renwuName;
		}

		/**
		* 获取： 任务编号
		*/
		public String getRenwuUuidNumber() {
			return renwuUuidNumber;
		}
		/**
		* 设置： 任务编号
		*/
		public void setRenwuUuidNumber(String renwuUuidNumber) {
			this.renwuUuidNumber = renwuUuidNumber;
		}

		/**
		* 获取： 任务照片
		*/
		public String getRenwuPhoto() {
			return renwuPhoto;
		}
		/**
		* 设置： 任务照片
		*/
		public void setRenwuPhoto(String renwuPhoto) {
			this.renwuPhoto = renwuPhoto;
		}
		/**
		* 获取： 任务类型
		*/
		public Integer getRenwuTypes() {
			return renwuTypes;
		}
		/**
		* 设置： 任务类型
		*/
		public void setRenwuTypes(Integer renwuTypes) {
			this.renwuTypes = renwuTypes;
		}


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

		/**
		* 获取： 文件
		*/
		public String getRenwuFile() {
			return renwuFile;
		}
		/**
		* 设置： 文件
		*/
		public void setRenwuFile(String renwuFile) {
			this.renwuFile = renwuFile;
		}

		/**
		* 获取： 任务介绍
		*/
		public String getRenwuContent() {
			return renwuContent;
		}
		/**
		* 设置： 任务介绍
		*/
		public void setRenwuContent(String renwuContent) {
			this.renwuContent = renwuContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getRenwuDelete() {
			return renwuDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setRenwuDelete(Integer renwuDelete) {
			this.renwuDelete = renwuDelete;
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


	@Override
	public String toString() {
		return "FenpeiView{" +
			", fenpeiValue=" + fenpeiValue +
			", renwuName=" + renwuName +
			", renwuUuidNumber=" + renwuUuidNumber +
			", renwuPhoto=" + renwuPhoto +
			", renwuFile=" + renwuFile +
			", renwuContent=" + renwuContent +
			", renwuDelete=" + renwuDelete +
			", yonghuUuidNumber=" + yonghuUuidNumber +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
