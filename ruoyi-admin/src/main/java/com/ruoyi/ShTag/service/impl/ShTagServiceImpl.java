package com.ruoyi.ShTag.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ShTag.mapper.ShTagMapper;
import com.ruoyi.ShTag.domain.ShTag;
import com.ruoyi.ShTag.service.IShTagService;

/**
 * 标签Service业务层处理
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@Service
public class ShTagServiceImpl implements IShTagService 
{
    @Autowired
    private ShTagMapper shTagMapper;

    /**
     * 查询标签
     * 
     * @param tagId 标签主键
     * @return 标签
     */
    @Override
    public ShTag selectShTagByTagId(Integer tagId)
    {
        return shTagMapper.selectShTagByTagId(tagId);
    }

    /**
     * 查询标签列表
     * 
     * @param shTag 标签
     * @return 标签
     */
    @Override
    public List<ShTag> selectShTagList(ShTag shTag)
    {
        return shTagMapper.selectShTagList(shTag);
    }

    /**
     * 新增标签
     * 
     * @param shTag 标签
     * @return 结果
     */
    @Override
    public int insertShTag(ShTag shTag)
    {
        return shTagMapper.insertShTag(shTag);
    }

    /**
     * 修改标签
     * 
     * @param shTag 标签
     * @return 结果
     */
    @Override
    public int updateShTag(ShTag shTag)
    {
        return shTagMapper.updateShTag(shTag);
    }

    /**
     * 批量删除标签
     * 
     * @param tagIds 需要删除的标签主键
     * @return 结果
     */
    @Override
    public int deleteShTagByTagIds(Integer[] tagIds)
    {
        return shTagMapper.deleteShTagByTagIds(tagIds);
    }

    /**
     * 删除标签信息
     * 
     * @param tagId 标签主键
     * @return 结果
     */
    @Override
    public int deleteShTagByTagId(Integer tagId)
    {
        return shTagMapper.deleteShTagByTagId(tagId);
    }
}
