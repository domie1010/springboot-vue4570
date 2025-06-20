package com.entity.model;

import com.entity.QingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 员工请假
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QingjiaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 部门主管
     */
    private Integer jingliId;


    /**
     * 请假缘由
     */
    private String qingjiaText;


    /**
     * 请假类型
     */
    private Integer qingjiaTypes;


    /**
     * 申请时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 请假时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date qingjiaTime;


    /**
     * 请假天数
     */
    private Integer qingjiaNumber;


    /**
     * 申请状态
     */
    private Integer qingjiaYesnoTypes;


    /**
     * 处理意见
     */
    private String qingjiaYesnoText;


    /**
     * 审核时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date qingjiaShenheTime;


    /**
     * 创建时间 show3 listShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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
	 * 获取：请假缘由
	 */
    public String getQingjiaText() {
        return qingjiaText;
    }


    /**
	 * 设置：请假缘由
	 */
    public void setQingjiaText(String qingjiaText) {
        this.qingjiaText = qingjiaText;
    }
    /**
	 * 获取：请假类型
	 */
    public Integer getQingjiaTypes() {
        return qingjiaTypes;
    }


    /**
	 * 设置：请假类型
	 */
    public void setQingjiaTypes(Integer qingjiaTypes) {
        this.qingjiaTypes = qingjiaTypes;
    }
    /**
	 * 获取：申请时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：申请时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：请假时间
	 */
    public Date getQingjiaTime() {
        return qingjiaTime;
    }


    /**
	 * 设置：请假时间
	 */
    public void setQingjiaTime(Date qingjiaTime) {
        this.qingjiaTime = qingjiaTime;
    }
    /**
	 * 获取：请假天数
	 */
    public Integer getQingjiaNumber() {
        return qingjiaNumber;
    }


    /**
	 * 设置：请假天数
	 */
    public void setQingjiaNumber(Integer qingjiaNumber) {
        this.qingjiaNumber = qingjiaNumber;
    }
    /**
	 * 获取：申请状态
	 */
    public Integer getQingjiaYesnoTypes() {
        return qingjiaYesnoTypes;
    }


    /**
	 * 设置：申请状态
	 */
    public void setQingjiaYesnoTypes(Integer qingjiaYesnoTypes) {
        this.qingjiaYesnoTypes = qingjiaYesnoTypes;
    }
    /**
	 * 获取：处理意见
	 */
    public String getQingjiaYesnoText() {
        return qingjiaYesnoText;
    }


    /**
	 * 设置：处理意见
	 */
    public void setQingjiaYesnoText(String qingjiaYesnoText) {
        this.qingjiaYesnoText = qingjiaYesnoText;
    }
    /**
	 * 获取：审核时间
	 */
    public Date getQingjiaShenheTime() {
        return qingjiaShenheTime;
    }


    /**
	 * 设置：审核时间
	 */
    public void setQingjiaShenheTime(Date qingjiaShenheTime) {
        this.qingjiaShenheTime = qingjiaShenheTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
