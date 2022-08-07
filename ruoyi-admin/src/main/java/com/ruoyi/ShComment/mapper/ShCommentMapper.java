package com.ruoyi.ShComment.mapper;

import java.util.List;
import com.ruoyi.ShComment.domain.ShComment;

/**
 * 评论Mapper接口
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public interface ShCommentMapper 
{
    /**
     * 查询评论
     * 
     * @param commentId 评论主键
     * @return 评论
     */
    public ShComment selectShCommentByCommentId(Integer commentId);

    /**
     * 查询评论列表
     * 
     * @param shComment 评论
     * @return 评论集合
     */
    public List<ShComment> selectShCommentList(ShComment shComment);

    /**
     * 新增评论
     * 
     * @param shComment 评论
     * @return 结果
     */
    public int insertShComment(ShComment shComment);

    /**
     * 修改评论
     * 
     * @param shComment 评论
     * @return 结果
     */
    public int updateShComment(ShComment shComment);

    /**
     * 删除评论
     * 
     * @param commentId 评论主键
     * @return 结果
     */
    public int deleteShCommentByCommentId(Integer commentId);

    /**
     * 批量删除评论
     * 
     * @param commentIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShCommentByCommentIds(Integer[] commentIds);
}
