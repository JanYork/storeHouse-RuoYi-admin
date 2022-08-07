package com.ruoyi.Shuserinfo.mapper;

import java.util.List;
import com.ruoyi.Shuserinfo.domain.Shuserinfo;

/**
 * 用户Mapper接口
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public interface ShuserinfoMapper 
{
    /**
     * 查询用户
     * 
     * @param uid 用户主键
     * @return 用户
     */
    public Shuserinfo selectShuserinfoByUid(Integer uid);

    /**
     * 查询用户列表
     * 
     * @param shuserinfo 用户
     * @return 用户集合
     */
    public List<Shuserinfo> selectShuserinfoList(Shuserinfo shuserinfo);

    /**
     * 新增用户
     * 
     * @param shuserinfo 用户
     * @return 结果
     */
    public int insertShuserinfo(Shuserinfo shuserinfo);

    /**
     * 修改用户
     * 
     * @param shuserinfo 用户
     * @return 结果
     */
    public int updateShuserinfo(Shuserinfo shuserinfo);

    /**
     * 删除用户
     * 
     * @param uid 用户主键
     * @return 结果
     */
    public int deleteShuserinfoByUid(Integer uid);

    /**
     * 批量删除用户
     * 
     * @param uids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShuserinfoByUids(Integer[] uids);
}
