package com.ruoyi.ShComment.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 评论对象 comment
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public class ShComment extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 评论 id */
    private Integer commentId;

    /** 评论内容 */
    @Excel(name = "评论内容")
    private String content;

    /** 评论者 id */
    @Excel(name = "评论者 id")
    private Integer commentUid;

    /** 评论所属话题 id */
    @Excel(name = "评论所属话题 id")
    private Integer commentTopicId;

    /** 评论时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "评论时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date commentTime;

    /** 网络地址 */
    @Excel(name = "网络地址")
    private String commentIp;

    /** 持用设备 */
    @Excel(name = "持用设备")
    private String commentEquipment;

    public void setCommentId(Integer commentId) 
    {
        this.commentId = commentId;
    }

    public Integer getCommentId() 
    {
        return commentId;
    }
    public void setContent(String content) 
    {
        this.content = content;
    }

    public String getContent() 
    {
        return content;
    }
    public void setCommentUid(Integer commentUid) 
    {
        this.commentUid = commentUid;
    }

    public Integer getCommentUid() 
    {
        return commentUid;
    }
    public void setCommentTopicId(Integer commentTopicId) 
    {
        this.commentTopicId = commentTopicId;
    }

    public Integer getCommentTopicId() 
    {
        return commentTopicId;
    }
    public void setCommentTime(Date commentTime) 
    {
        this.commentTime = commentTime;
    }

    public Date getCommentTime() 
    {
        return commentTime;
    }
    public void setCommentIp(String commentIp) 
    {
        this.commentIp = commentIp;
    }

    public String getCommentIp() 
    {
        return commentIp;
    }
    public void setCommentEquipment(String commentEquipment) 
    {
        this.commentEquipment = commentEquipment;
    }

    public String getCommentEquipment() 
    {
        return commentEquipment;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("commentId", getCommentId())
            .append("content", getContent())
            .append("commentUid", getCommentUid())
            .append("commentTopicId", getCommentTopicId())
            .append("commentTime", getCommentTime())
            .append("commentIp", getCommentIp())
            .append("commentEquipment", getCommentEquipment())
            .toString();
    }
}
