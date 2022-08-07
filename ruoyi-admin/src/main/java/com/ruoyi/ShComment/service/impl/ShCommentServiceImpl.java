package com.ruoyi.ShComment.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ShComment.mapper.ShCommentMapper;
import com.ruoyi.ShComment.domain.ShComment;
import com.ruoyi.ShComment.service.IShCommentService;

/**
 * 评论Service业务层处理
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@Service
public class ShCommentServiceImpl implements IShCommentService 
{
    @Autowired
    private ShCommentMapper shCommentMapper;

    /**
     * 查询评论
     * 
     * @param commentId 评论主键
     * @return 评论
     */
    @Override
    public ShComment selectShCommentByCommentId(Integer commentId)
    {
        return shCommentMapper.selectShCommentByCommentId(commentId);
    }

    /**
     * 查询评论列表
     * 
     * @param shComment 评论
     * @return 评论
     */
    @Override
    public List<ShComment> selectShCommentList(ShComment shComment)
    {
        return shCommentMapper.selectShCommentList(shComment);
    }

    /**
     * 新增评论
     * 
     * @param shComment 评论
     * @return 结果
     */
    @Override
    public int insertShComment(ShComment shComment)
    {
        return shCommentMapper.insertShComment(shComment);
    }

    /**
     * 修改评论
     * 
     * @param shComment 评论
     * @return 结果
     */
    @Override
    public int updateShComment(ShComment shComment)
    {
        return shCommentMapper.updateShComment(shComment);
    }

    /**
     * 批量删除评论
     * 
     * @param commentIds 需要删除的评论主键
     * @return 结果
     */
    @Override
    public int deleteShCommentByCommentIds(Integer[] commentIds)
    {
        return shCommentMapper.deleteShCommentByCommentIds(commentIds);
    }

    /**
     * 删除评论信息
     * 
     * @param commentId 评论主键
     * @return 结果
     */
    @Override
    public int deleteShCommentByCommentId(Integer commentId)
    {
        return shCommentMapper.deleteShCommentByCommentId(commentId);
    }
}
