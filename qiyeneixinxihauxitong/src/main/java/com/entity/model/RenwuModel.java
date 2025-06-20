package com.entity.model;

import com.entity.RenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 任务
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class RenwuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 部门主管
     */
    private Integer jingliId;


    /**
     * 任务名称
     */
    private String renwuName;


    /**
     * 任务编号
     */
    private String renwuUuidNumber;


    /**
     * 任务照片
     */
    private String renwuPhoto;


    /**
     * 任务类型
     */
    private Integer renwuTypes;


    /**
     * 文件
     */
    private String renwuFile;


    /**
     * 任务介绍
     */
    private String renwuContent;


    /**
     * 逻辑删除
     */
    private Integer renwuDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
