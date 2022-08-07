package com.ruoyi.ShCategory.mapper;

import java.util.List;
import com.ruoyi.ShCategory.domain.ShCategory;

/**
 * 板块Mapper接口
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public interface ShCategoryMapper 
{
    /**
     * 查询板块
     * 
     * @param categoryId 板块主键
     * @return 板块
     */
    public ShCategory selectShCategoryByCategoryId(Integer categoryId);

    /**
     * 查询板块列表
     * 
     * @param shCategory 板块
     * @return 板块集合
     */
    public List<ShCategory> selectShCategoryList(ShCategory shCategory);

    /**
     * 新增板块
     * 
     * @param shCategory 板块
     * @return 结果
     */
    public int insertShCategory(ShCategory shCategory);

    /**
     * 修改板块
     * 
     * @param shCategory 板块
     * @return 结果
     */
    public int updateShCategory(ShCategory shCategory);

    /**
     * 删除板块
     * 
     * @param categoryId 板块主键
     * @return 结果
     */
    public int deleteShCategoryByCategoryId(Integer categoryId);

    /**
     * 批量删除板块
     * 
     * @param categoryIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShCategoryByCategoryIds(Integer[] categoryIds);
}
