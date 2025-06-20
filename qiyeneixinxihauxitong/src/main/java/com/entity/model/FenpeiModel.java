package com.entity.model;

import com.entity.FenpeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 任务分配
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class FenpeiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 任务
     */
    private Integer renwuId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 分配时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date fenpeiTime;


    /**
     * 任务进度
     */
    private Integer fenpeiTypes;


    /**
     * 任务分配介绍
     */
    private String fenpeiContent;


    /**
     * 逻辑删除
     */
    private Integer fenpeiDelete;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间  show3 listShow
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
	 * 获取：创建时间  show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
