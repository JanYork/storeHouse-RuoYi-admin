package com.ruoyi.ShTopic.service;

import java.util.List;
import com.ruoyi.ShTopic.domain.ShTopic;

/**
 * 文章Service接口
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public interface IShTopicService 
{
    /**
     * 查询文章
     * 
     * @param topicId 文章主键
     * @return 文章
     */
    public ShTopic selectShTopicByTopicId(Integer topicId);

    /**
     * 查询文章列表
     * 
     * @param shTopic 文章
     * @return 文章集合
     */
    public List<ShTopic> selectShTopicList(ShTopic shTopic);

    /**
     * 新增文章
     * 
     * @param shTopic 文章
     * @return 结果
     */
    public int insertShTopic(ShTopic shTopic);

    /**
     * 修改文章
     * 
     * @param shTopic 文章
     * @return 结果
     */
    public int updateShTopic(ShTopic shTopic);

    /**
     * 批量删除文章
     * 
     * @param topicIds 需要删除的文章主键集合
     * @return 结果
     */
    public int deleteShTopicByTopicIds(Integer[] topicIds);

    /**
     * 删除文章信息
     * 
     * @param topicId 文章主键
     * @return 结果
     */
    public int deleteShTopicByTopicId(Integer topicId);
}
