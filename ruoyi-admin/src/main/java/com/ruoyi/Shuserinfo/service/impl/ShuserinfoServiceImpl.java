package com.ruoyi.Shuserinfo.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.Shuserinfo.mapper.ShuserinfoMapper;
import com.ruoyi.Shuserinfo.domain.Shuserinfo;
import com.ruoyi.Shuserinfo.service.IShuserinfoService;

/**
 * 用户Service业务层处理
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@Service
public class ShuserinfoServiceImpl implements IShuserinfoService 
{
    @Autowired
    private ShuserinfoMapper shuserinfoMapper;

    /**
     * 查询用户
     * 
     * @param uid 用户主键
     * @return 用户
     */
    @Override
    public Shuserinfo selectShuserinfoByUid(Integer uid)
    {
        return shuserinfoMapper.selectShuserinfoByUid(uid);
    }

    /**
     * 查询用户列表
     * 
     * @param shuserinfo 用户
     * @return 用户
     */
    @Override
    public List<Shuserinfo> selectShuserinfoList(Shuserinfo shuserinfo)
    {
        return shuserinfoMapper.selectShuserinfoList(shuserinfo);
    }

    /**
     * 新增用户
     * 
     * @param shuserinfo 用户
     * @return 结果
     */
    @Override
    public int insertShuserinfo(Shuserinfo shuserinfo)
    {
        shuserinfo.setCreateTime(DateUtils.getNowDate());
        return shuserinfoMapper.insertShuserinfo(shuserinfo);
    }

    /**
     * 修改用户
     * 
     * @param shuserinfo 用户
     * @return 结果
     */
    @Override
    public int updateShuserinfo(Shuserinfo shuserinfo)
    {
        return shuserinfoMapper.updateShuserinfo(shuserinfo);
    }

    /**
     * 批量删除用户
     * 
     * @param uids 需要删除的用户主键
     * @return 结果
     */
    @Override
    public int deleteShuserinfoByUids(Integer[] uids)
    {
        return shuserinfoMapper.deleteShuserinfoByUids(uids);
    }

    /**
     * 删除用户信息
     * 
     * @param uid 用户主键
     * @return 结果
     */
    @Override
    public int deleteShuserinfoByUid(Integer uid)
    {
        return shuserinfoMapper.deleteShuserinfoByUid(uid);
    }
}
