package com.entity.vo;

import com.entity.FenpeiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 任务分配
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("fenpei")
public class FenpeiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 任务
     */

    @TableField(value = "renwu_id")
    private Integer renwuId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 分配时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "fenpei_time")
    private Date fenpeiTime;


    /**
     * 任务进度
     */

    @TableField(value = "fenpei_types")
    private Integer fenpeiTypes;


    /**
     * 任务分配介绍
     */

    @TableField(value = "fenpei_content")
    private String fenpeiContent;


    /**
     * 逻辑删除
     */

    @TableField(value = "fenpei_delete")
    private Integer fenpeiDelete;


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
	 * 设置：任务
	 */
    public Integer getRenwuId() {
        return renwuId;
    }


    /**
	 * 获取：任务
	 */

    public void setRenwuId(Integer renwuId) {
        this.renwuId = renwuId;
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
	 * 设置：分配时间
	 */
    public Date getFenpeiTime() {
        return fenpeiTime;
    }


    /**
	 * 获取：分配时间
	 */

    public void setFenpeiTime(Date fenpeiTime) {
        this.fenpeiTime = fenpeiTime;
    }
    /**
	 * 设置：任务进度
	 */
    public Integer getFenpeiTypes() {
        return fenpeiTypes;
    }


    /**
	 * 获取：任务进度
	 */

    public void setFenpeiTypes(Integer fenpeiTypes) {
        this.fenpeiTypes = fenpeiTypes;
    }
    /**
	 * 设置：任务分配介绍
	 */
    public String getFenpeiContent() {
        return fenpeiContent;
    }


    /**
	 * 获取：任务分配介绍
	 */

    public void setFenpeiContent(String fenpeiContent) {
        this.fenpeiContent = fenpeiContent;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getFenpeiDelete() {
        return fenpeiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setFenpeiDelete(Integer fenpeiDelete) {
        this.fenpeiDelete = fenpeiDelete;
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
