package com.ruoyi.ShCategory.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 板块对象 category
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public class ShCategory extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 板块 id */
    private Integer categoryId;

    /** 板块标题 */
    @Excel(name = "板块标题")
    private String categoryTitle;

    /** 板块话题数 */
    @Excel(name = "板块话题数")
    private Integer topicCount;

    /** 板块评论数 */
    @Excel(name = "板块评论数")
    private Integer commentCount;

    /** 板块描述内容 */
    @Excel(name = "板块描述内容")
    private String description;

    /** 板块图标 */
    @Excel(name = "板块图标")
    private String categoryLogo;

    public void setCategoryId(Integer categoryId) 
    {
        this.categoryId = categoryId;
    }

    public Integer getCategoryId() 
    {
        return categoryId;
    }
    public void setCategoryTitle(String categoryTitle) 
    {
        this.categoryTitle = categoryTitle;
    }

    public String getCategoryTitle() 
    {
        return categoryTitle;
    }
    public void setTopicCount(Integer topicCount) 
    {
        this.topicCount = topicCount;
    }

    public Integer getTopicCount() 
    {
        return topicCount;
    }
    public void setCommentCount(Integer commentCount) 
    {
        this.commentCount = commentCount;
    }

    public Integer getCommentCount() 
    {
        return commentCount;
    }
    public void setDescription(String description) 
    {
        this.description = description;
    }

    public String getDescription() 
    {
        return description;
    }
    public void setCategoryLogo(String categoryLogo) 
    {
        this.categoryLogo = categoryLogo;
    }

    public String getCategoryLogo() 
    {
        return categoryLogo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("categoryId", getCategoryId())
            .append("categoryTitle", getCategoryTitle())
            .append("topicCount", getTopicCount())
            .append("commentCount", getCommentCount())
            .append("description", getDescription())
            .append("categoryLogo", getCategoryLogo())
            .toString();
    }
}
