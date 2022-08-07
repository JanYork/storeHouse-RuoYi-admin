package com.ruoyi.ShCategory.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ShCategory.mapper.ShCategoryMapper;
import com.ruoyi.ShCategory.domain.ShCategory;
import com.ruoyi.ShCategory.service.IShCategoryService;

/**
 * 板块Service业务层处理
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@Service
public class ShCategoryServiceImpl implements IShCategoryService 
{
    @Autowired
    private ShCategoryMapper shCategoryMapper;

    /**
     * 查询板块
     * 
     * @param categoryId 板块主键
     * @return 板块
     */
    @Override
    public ShCategory selectShCategoryByCategoryId(Integer categoryId)
    {
        return shCategoryMapper.selectShCategoryByCategoryId(categoryId);
    }

    /**
     * 查询板块列表
     * 
     * @param shCategory 板块
     * @return 板块
     */
    @Override
    public List<ShCategory> selectShCategoryList(ShCategory shCategory)
    {
        return shCategoryMapper.selectShCategoryList(shCategory);
    }

    /**
     * 新增板块
     * 
     * @param shCategory 板块
     * @return 结果
     */
    @Override
    public int insertShCategory(ShCategory shCategory)
    {
        return shCategoryMapper.insertShCategory(shCategory);
    }

    /**
     * 修改板块
     * 
     * @param shCategory 板块
     * @return 结果
     */
    @Override
    public int updateShCategory(ShCategory shCategory)
    {
        return shCategoryMapper.updateShCategory(shCategory);
    }

    /**
     * 批量删除板块
     * 
     * @param categoryIds 需要删除的板块主键
     * @return 结果
     */
    @Override
    public int deleteShCategoryByCategoryIds(Integer[] categoryIds)
    {
        return shCategoryMapper.deleteShCategoryByCategoryIds(categoryIds);
    }

    /**
     * 删除板块信息
     * 
     * @param categoryId 板块主键
     * @return 结果
     */
    @Override
    public int deleteShCategoryByCategoryId(Integer categoryId)
    {
        return shCategoryMapper.deleteShCategoryByCategoryId(categoryId);
    }
}
