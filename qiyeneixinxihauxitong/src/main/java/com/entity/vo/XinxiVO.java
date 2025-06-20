package com.entity.vo;

import com.entity.XinxiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 基本信息
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xinxi")
public class XinxiVO implements Serializable {
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
     * 基本信息名称
     */

    @TableField(value = "xinxi_name")
    private String xinxiName;


    /**
     * 基本信息编号
     */

    @TableField(value = "xinxi_uuid_number")
    private String xinxiUuidNumber;


    /**
     * 毕业院校
     */

    @TableField(value = "xinxi_yuanxiao")
    private String xinxiYuanxiao;


    /**
     * 专业
     */

    @TableField(value = "xinxi_zhuanye")
    private String xinxiZhuanye;


    /**
     * 最终学位
     */

    @TableField(value = "xinxi_xuewei")
    private String xinxiXuewei;


    /**
     * 家庭住址
     */

    @TableField(value = "xinxi_address")
    private String xinxiAddress;


    /**
     * 车牌号
     */

    @TableField(value = "xinxi_chepai")
    private String xinxiChepai;


    /**
     * 办公地点
     */

    @TableField(value = "xinxi_didian")
    private String xinxiDidian;


    /**
     * 健康状况
     */

    @TableField(value = "xinxi_types")
    private Integer xinxiTypes;


    /**
     * 入职时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "xinxi_time")
    private Date xinxiTime;


    /**
     * 基本信息介绍
     */

    @TableField(value = "xinxi_content")
    private String xinxiContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "xinxi_delete")
    private Integer xinxiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间  show3 listShow
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
	 * 设置：基本信息名称
	 */
    public String getXinxiName() {
        return xinxiName;
    }


    /**
	 * 获取：基本信息名称
	 */

    public void setXinxiName(String xinxiName) {
        this.xinxiName = xinxiName;
    }
    /**
	 * 设置：基本信息编号
	 */
    public String getXinxiUuidNumber() {
        return xinxiUuidNumber;
    }


    /**
	 * 获取：基本信息编号
	 */

    public void setXinxiUuidNumber(String xinxiUuidNumber) {
        this.xinxiUuidNumber = xinxiUuidNumber;
    }
    /**
	 * 设置：毕业院校
	 */
    public String getXinxiYuanxiao() {
        return xinxiYuanxiao;
    }


    /**
	 * 获取：毕业院校
	 */

    public void setXinxiYuanxiao(String xinxiYuanxiao) {
        this.xinxiYuanxiao = xinxiYuanxiao;
    }
    /**
	 * 设置：专业
	 */
    public String getXinxiZhuanye() {
        return xinxiZhuanye;
    }


    /**
	 * 获取：专业
	 */

    public void setXinxiZhuanye(String xinxiZhuanye) {
        this.xinxiZhuanye = xinxiZhuanye;
    }
    /**
	 * 设置：最终学位
	 */
    public String getXinxiXuewei() {
        return xinxiXuewei;
    }


    /**
	 * 获取：最终学位
	 */

    public void setXinxiXuewei(String xinxiXuewei) {
        this.xinxiXuewei = xinxiXuewei;
    }
    /**
	 * 设置：家庭住址
	 */
    public String getXinxiAddress() {
        return xinxiAddress;
    }


    /**
	 * 获取：家庭住址
	 */

    public void setXinxiAddress(String xinxiAddress) {
        this.xinxiAddress = xinxiAddress;
    }
    /**
	 * 设置：车牌号
	 */
    public String getXinxiChepai() {
        return xinxiChepai;
    }


    /**
	 * 获取：车牌号
	 */

    public void setXinxiChepai(String xinxiChepai) {
        this.xinxiChepai = xinxiChepai;
    }
    /**
	 * 设置：办公地点
	 */
    public String getXinxiDidian() {
        return xinxiDidian;
    }


    /**
	 * 获取：办公地点
	 */

    public void setXinxiDidian(String xinxiDidian) {
        this.xinxiDidian = xinxiDidian;
    }
    /**
	 * 设置：健康状况
	 */
    public Integer getXinxiTypes() {
        return xinxiTypes;
    }


    /**
	 * 获取：健康状况
	 */

    public void setXinxiTypes(Integer xinxiTypes) {
        this.xinxiTypes = xinxiTypes;
    }
    /**
	 * 设置：入职时间
	 */
    public Date getXinxiTime() {
        return xinxiTime;
    }


    /**
	 * 获取：入职时间
	 */

    public void setXinxiTime(Date xinxiTime) {
        this.xinxiTime = xinxiTime;
    }
    /**
	 * 设置：基本信息介绍
	 */
    public String getXinxiContent() {
        return xinxiContent;
    }


    /**
	 * 获取：基本信息介绍
	 */

    public void setXinxiContent(String xinxiContent) {
        this.xinxiContent = xinxiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getXinxiDelete() {
        return xinxiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setXinxiDelete(Integer xinxiDelete) {
        this.xinxiDelete = xinxiDelete;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
