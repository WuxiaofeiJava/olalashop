package com.goktech.olala.server.pojo.goods;

import java.util.Date;

public class Activit {
    private Integer activitId;

    private String slogan;

    private String activitImg;

    private String activitContent;

    private String linkUrl;

    private Integer sortOrder;

    private Date startTime;

    private Date endTime;

    private Integer isFinished;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    public Integer getActivitId() {
        return activitId;
    }

    public void setActivitId(Integer activitId) {
        this.activitId = activitId;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getActivitImg() {
        return activitImg;
    }

    public void setActivitImg(String activitImg) {
        this.activitImg = activitImg;
    }

    public String getActivitContent() {
        return activitContent;
    }

    public void setActivitContent(String activitContent) {
        this.activitContent = activitContent;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getIsFinished() {
        return isFinished;
    }

    public void setIsFinished(Integer isFinished) {
        this.isFinished = isFinished;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}