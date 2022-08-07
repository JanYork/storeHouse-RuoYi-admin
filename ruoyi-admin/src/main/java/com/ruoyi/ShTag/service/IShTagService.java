package com.ruoyi.ShTag.service;

import java.util.List;
import com.ruoyi.ShTag.domain.ShTag;

/**
 * 标签Service接口
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public interface IShTagService 
{
    /**
     * 查询标签
     * 
     * @param tagId 标签主键
     * @return 标签
     */
    public ShTag selectShTagByTagId(Integer tagId);

    /**
     * 查询标签列表
     * 
     * @param shTag 标签
     * @return 标签集合
     */
    public List<ShTag> selectShTagList(ShTag shTag);

    /**
     * 新增标签
     * 
     * @param shTag 标签
     * @return 结果
     */
    public int insertShTag(ShTag shTag);

    /**
     * 修改标签
     * 
     * @param shTag 标签
     * @return 结果
     */
    public int updateShTag(ShTag shTag);

    /**
     * 批量删除标签
     * 
     * @param tagIds 需要删除的标签主键集合
     * @return 结果
     */
    public int deleteShTagByTagIds(Integer[] tagIds);

    /**
     * 删除标签信息
     * 
     * @param tagId 标签主键
     * @return 结果
     */
    public int deleteShTagByTagId(Integer tagId);
}
