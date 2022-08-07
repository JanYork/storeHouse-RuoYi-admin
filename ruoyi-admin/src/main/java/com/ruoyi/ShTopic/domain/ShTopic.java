package com.ruoyi.ShTopic.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 文章对象 topic
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public class ShTopic extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 话题 id */
    private Integer topicId;

    /** 话题标题 */
    @Excel(name = "话题标题")
    private String title;

    /** 话题内容 */
    @Excel(name = "话题内容")
    private String topicContent;

    /** 评论总数 */
    @Excel(name = "评论总数")
    private Integer commentCount;

    /** 发帖时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "发帖时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date topicTime;

    /** 创建者 id */
    @Excel(name = "创建者 id")
    private Integer topicUid;

    /** 所属板块 id */
    @Excel(name = "所属板块 id")
    private Integer topicCategoryId;

    /** 所属标签 id */
    @Excel(name = "所属标签 id")
    private Integer topicTagId;

    /** 浏览量 */
    @Excel(name = "浏览量")
    private Integer browseCount;

    /** 点赞数目 */
    @Excel(name = "点赞数目")
    private Integer thumbsUp;

    public void setTopicId(Integer topicId) 
    {
        this.topicId = topicId;
    }

    public Integer getTopicId() 
    {
        return topicId;
    }
    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getTitle() 
    {
        return title;
    }
    public void setTopicContent(String topicContent) 
    {
        this.topicContent = topicContent;
    }

    public String getTopicContent() 
    {
        return topicContent;
    }
    public void setCommentCount(Integer commentCount) 
    {
        this.commentCount = commentCount;
    }

    public Integer getCommentCount() 
    {
        return commentCount;
    }
    public void setTopicTime(Date topicTime) 
    {
        this.topicTime = topicTime;
    }

    public Date getTopicTime() 
    {
        return topicTime;
    }
    public void setTopicUid(Integer topicUid) 
    {
        this.topicUid = topicUid;
    }

    public Integer getTopicUid() 
    {
        return topicUid;
    }
    public void setTopicCategoryId(Integer topicCategoryId) 
    {
        this.topicCategoryId = topicCategoryId;
    }

    public Integer getTopicCategoryId() 
    {
        return topicCategoryId;
    }
    public void setTopicTagId(Integer topicTagId) 
    {
        this.topicTagId = topicTagId;
    }

    public Integer getTopicTagId() 
    {
        return topicTagId;
    }
    public void setBrowseCount(Integer browseCount) 
    {
        this.browseCount = browseCount;
    }

    public Integer getBrowseCount() 
    {
        return browseCount;
    }
    public void setThumbsUp(Integer thumbsUp) 
    {
        this.thumbsUp = thumbsUp;
    }

    public Integer getThumbsUp() 
    {
        return thumbsUp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("topicId", getTopicId())
            .append("title", getTitle())
            .append("topicContent", getTopicContent())
            .append("commentCount", getCommentCount())
            .append("topicTime", getTopicTime())
            .append("topicUid", getTopicUid())
            .append("topicCategoryId", getTopicCategoryId())
            .append("topicTagId", getTopicTagId())
            .append("browseCount", getBrowseCount())
            .append("thumbsUp", getThumbsUp())
            .toString();
    }
}
