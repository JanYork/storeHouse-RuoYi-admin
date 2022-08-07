package com.ruoyi.ShThumbs.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 点赞对象 thumbs
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public class ShThumbs extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标签 id */
    private Integer thumbsId;

    /** 点赞者 id */
    @Excel(name = "点赞者 id")
    private Integer thumbsUid;

    /** 点赞话题 id */
    @Excel(name = "点赞话题 id")
    private Integer thumbsTopicId;

    public void setThumbsId(Integer thumbsId) 
    {
        this.thumbsId = thumbsId;
    }

    public Integer getThumbsId() 
    {
        return thumbsId;
    }
    public void setThumbsUid(Integer thumbsUid) 
    {
        this.thumbsUid = thumbsUid;
    }

    public Integer getThumbsUid() 
    {
        return thumbsUid;
    }
    public void setThumbsTopicId(Integer thumbsTopicId) 
    {
        this.thumbsTopicId = thumbsTopicId;
    }

    public Integer getThumbsTopicId() 
    {
        return thumbsTopicId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("thumbsId", getThumbsId())
            .append("thumbsUid", getThumbsUid())
            .append("thumbsTopicId", getThumbsTopicId())
            .toString();
    }
}
