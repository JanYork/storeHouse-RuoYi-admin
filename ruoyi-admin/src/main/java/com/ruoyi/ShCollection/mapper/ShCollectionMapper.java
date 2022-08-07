package com.ruoyi.ShCollection.mapper;

import java.util.List;
import com.ruoyi.ShCollection.domain.ShCollection;

/**
 * 收藏Mapper接口
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public interface ShCollectionMapper 
{
    /**
     * 查询收藏
     * 
     * @param collectionId 收藏主键
     * @return 收藏
     */
    public ShCollection selectShCollectionByCollectionId(Integer collectionId);

    /**
     * 查询收藏列表
     * 
     * @param shCollection 收藏
     * @return 收藏集合
     */
    public List<ShCollection> selectShCollectionList(ShCollection shCollection);

    /**
     * 新增收藏
     * 
     * @param shCollection 收藏
     * @return 结果
     */
    public int insertShCollection(ShCollection shCollection);

    /**
     * 修改收藏
     * 
     * @param shCollection 收藏
     * @return 结果
     */
    public int updateShCollection(ShCollection shCollection);

    /**
     * 删除收藏
     * 
     * @param collectionId 收藏主键
     * @return 结果
     */
    public int deleteShCollectionByCollectionId(Integer collectionId);

    /**
     * 批量删除收藏
     * 
     * @param collectionIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShCollectionByCollectionIds(Integer[] collectionIds);
}
