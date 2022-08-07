package com.ruoyi.ShCategory.service;

import java.util.List;
import com.ruoyi.ShCategory.domain.ShCategory;

/**
 * 板块Service接口
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public interface IShCategoryService 
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
     * 批量删除板块
     * 
     * @param categoryIds 需要删除的板块主键集合
     * @return 结果
     */
    public int deleteShCategoryByCategoryIds(Integer[] categoryIds);

    /**
     * 删除板块信息
     * 
     * @param categoryId 板块主键
     * @return 结果
     */
    public int deleteShCategoryByCategoryId(Integer categoryId);
}
