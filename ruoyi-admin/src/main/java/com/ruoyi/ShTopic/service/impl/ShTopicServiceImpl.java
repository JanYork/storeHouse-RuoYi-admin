package com.ruoyi.ShTopic.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ShTopic.mapper.ShTopicMapper;
import com.ruoyi.ShTopic.domain.ShTopic;
import com.ruoyi.ShTopic.service.IShTopicService;

/**
 * 文章Service业务层处理
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@Service
public class ShTopicServiceImpl implements IShTopicService 
{
    @Autowired
    private ShTopicMapper shTopicMapper;

    /**
     * 查询文章
     * 
     * @param topicId 文章主键
     * @return 文章
     */
    @Override
    public ShTopic selectShTopicByTopicId(Integer topicId)
    {
        return shTopicMapper.selectShTopicByTopicId(topicId);
    }

    /**
     * 查询文章列表
     * 
     * @param shTopic 文章
     * @return 文章
     */
    @Override
    public List<ShTopic> selectShTopicList(ShTopic shTopic)
    {
        return shTopicMapper.selectShTopicList(shTopic);
    }

    /**
     * 新增文章
     * 
     * @param shTopic 文章
     * @return 结果
     */
    @Override
    public int insertShTopic(ShTopic shTopic)
    {
        return shTopicMapper.insertShTopic(shTopic);
    }

    /**
     * 修改文章
     * 
     * @param shTopic 文章
     * @return 结果
     */
    @Override
    public int updateShTopic(ShTopic shTopic)
    {
        return shTopicMapper.updateShTopic(shTopic);
    }

    /**
     * 批量删除文章
     * 
     * @param topicIds 需要删除的文章主键
     * @return 结果
     */
    @Override
    public int deleteShTopicByTopicIds(Integer[] topicIds)
    {
        return shTopicMapper.deleteShTopicByTopicIds(topicIds);
    }

    /**
     * 删除文章信息
     * 
     * @param topicId 文章主键
     * @return 结果
     */
    @Override
    public int deleteShTopicByTopicId(Integer topicId)
    {
        return shTopicMapper.deleteShTopicByTopicId(topicId);
    }
}
