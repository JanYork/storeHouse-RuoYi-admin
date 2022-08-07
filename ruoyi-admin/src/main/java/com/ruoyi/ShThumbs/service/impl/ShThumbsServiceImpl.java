package com.ruoyi.ShThumbs.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ShThumbs.mapper.ShThumbsMapper;
import com.ruoyi.ShThumbs.domain.ShThumbs;
import com.ruoyi.ShThumbs.service.IShThumbsService;

/**
 * 点赞Service业务层处理
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@Service
public class ShThumbsServiceImpl implements IShThumbsService 
{
    @Autowired
    private ShThumbsMapper shThumbsMapper;

    /**
     * 查询点赞
     * 
     * @param thumbsId 点赞主键
     * @return 点赞
     */
    @Override
    public ShThumbs selectShThumbsByThumbsId(Integer thumbsId)
    {
        return shThumbsMapper.selectShThumbsByThumbsId(thumbsId);
    }

    /**
     * 查询点赞列表
     * 
     * @param shThumbs 点赞
     * @return 点赞
     */
    @Override
    public List<ShThumbs> selectShThumbsList(ShThumbs shThumbs)
    {
        return shThumbsMapper.selectShThumbsList(shThumbs);
    }

    /**
     * 新增点赞
     * 
     * @param shThumbs 点赞
     * @return 结果
     */
    @Override
    public int insertShThumbs(ShThumbs shThumbs)
    {
        return shThumbsMapper.insertShThumbs(shThumbs);
    }

    /**
     * 修改点赞
     * 
     * @param shThumbs 点赞
     * @return 结果
     */
    @Override
    public int updateShThumbs(ShThumbs shThumbs)
    {
        return shThumbsMapper.updateShThumbs(shThumbs);
    }

    /**
     * 批量删除点赞
     * 
     * @param thumbsIds 需要删除的点赞主键
     * @return 结果
     */
    @Override
    public int deleteShThumbsByThumbsIds(Integer[] thumbsIds)
    {
        return shThumbsMapper.deleteShThumbsByThumbsIds(thumbsIds);
    }

    /**
     * 删除点赞信息
     * 
     * @param thumbsId 点赞主键
     * @return 结果
     */
    @Override
    public int deleteShThumbsByThumbsId(Integer thumbsId)
    {
        return shThumbsMapper.deleteShThumbsByThumbsId(thumbsId);
    }
}
