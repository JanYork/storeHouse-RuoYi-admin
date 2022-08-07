package com.ruoyi.ShCollection.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 收藏对象 collection
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public class ShCollection extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 收藏表 id */
    private Integer collectionId;

    /** 收藏者 id */
    @Excel(name = "收藏者 id")
    private Integer collectionUid;

    /** 收藏的贴子 id */
    @Excel(name = "收藏的贴子 id")
    private Integer collectionTopicId;

    public void setCollectionId(Integer collectionId) 
    {
        this.collectionId = collectionId;
    }

    public Integer getCollectionId() 
    {
        return collectionId;
    }
    public void setCollectionUid(Integer collectionUid) 
    {
        this.collectionUid = collectionUid;
    }

    public Integer getCollectionUid() 
    {
        return collectionUid;
    }
    public void setCollectionTopicId(Integer collectionTopicId) 
    {
        this.collectionTopicId = collectionTopicId;
    }

    public Integer getCollectionTopicId() 
    {
        return collectionTopicId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("collectionId", getCollectionId())
            .append("collectionUid", getCollectionUid())
            .append("collectionTopicId", getCollectionTopicId())
            .toString();
    }
}
