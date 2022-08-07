package com.ruoyi.ShTag.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 标签对象 tag
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public class ShTag extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 标签 id */
    private Integer tagId;

    /** 标签名称 */
    @Excel(name = "标签名称")
    private String tagName;

    /** 话题标签数 */
    @Excel(name = "话题标签数")
    private Integer topicCount;

    /** 标签所属板块 id */
    @Excel(name = "标签所属板块 id")
    private Integer tagCategoryId;

    public void setTagId(Integer tagId) 
    {
        this.tagId = tagId;
    }

    public Integer getTagId() 
    {
        return tagId;
    }
    public void setTagName(String tagName) 
    {
        this.tagName = tagName;
    }

    public String getTagName() 
    {
        return tagName;
    }
    public void setTopicCount(Integer topicCount) 
    {
        this.topicCount = topicCount;
    }

    public Integer getTopicCount() 
    {
        return topicCount;
    }
    public void setTagCategoryId(Integer tagCategoryId) 
    {
        this.tagCategoryId = tagCategoryId;
    }

    public Integer getTagCategoryId() 
    {
        return tagCategoryId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("tagId", getTagId())
            .append("tagName", getTagName())
            .append("topicCount", getTopicCount())
            .append("tagCategoryId", getTagCategoryId())
            .toString();
    }
}
