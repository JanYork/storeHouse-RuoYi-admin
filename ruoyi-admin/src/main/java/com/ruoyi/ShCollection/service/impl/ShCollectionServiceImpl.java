package com.ruoyi.ShCollection.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ShCollection.mapper.ShCollectionMapper;
import com.ruoyi.ShCollection.domain.ShCollection;
import com.ruoyi.ShCollection.service.IShCollectionService;

/**
 * 收藏Service业务层处理
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@Service
public class ShCollectionServiceImpl implements IShCollectionService 
{
    @Autowired
    private ShCollectionMapper shCollectionMapper;

    /**
     * 查询收藏
     * 
     * @param collectionId 收藏主键
     * @return 收藏
     */
    @Override
    public ShCollection selectShCollectionByCollectionId(Integer collectionId)
    {
        return shCollectionMapper.selectShCollectionByCollectionId(collectionId);
    }

    /**
     * 查询收藏列表
     * 
     * @param shCollection 收藏
     * @return 收藏
     */
    @Override
    public List<ShCollection> selectShCollectionList(ShCollection shCollection)
    {
        return shCollectionMapper.selectShCollectionList(shCollection);
    }

    /**
     * 新增收藏
     * 
     * @param shCollection 收藏
     * @return 结果
     */
    @Override
    public int insertShCollection(ShCollection shCollection)
    {
        return shCollectionMapper.insertShCollection(shCollection);
    }

    /**
     * 修改收藏
     * 
     * @param shCollection 收藏
     * @return 结果
     */
    @Override
    public int updateShCollection(ShCollection shCollection)
    {
        return shCollectionMapper.updateShCollection(shCollection);
    }

    /**
     * 批量删除收藏
     * 
     * @param collectionIds 需要删除的收藏主键
     * @return 结果
     */
    @Override
    public int deleteShCollectionByCollectionIds(Integer[] collectionIds)
    {
        return shCollectionMapper.deleteShCollectionByCollectionIds(collectionIds);
    }

    /**
     * 删除收藏信息
     * 
     * @param collectionId 收藏主键
     * @return 结果
     */
    @Override
    public int deleteShCollectionByCollectionId(Integer collectionId)
    {
        return shCollectionMapper.deleteShCollectionByCollectionId(collectionId);
    }
}
