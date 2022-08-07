package com.ruoyi.ShNotification.mapper;

import java.util.List;
import com.ruoyi.ShNotification.domain.ShNotification;

/**
 * 通知Mapper接口
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public interface ShNotificationMapper 
{
    /**
     * 查询通知
     * 
     * @param nid 通知主键
     * @return 通知
     */
    public ShNotification selectShNotificationByNid(Integer nid);

    /**
     * 查询通知列表
     * 
     * @param shNotification 通知
     * @return 通知集合
     */
    public List<ShNotification> selectShNotificationList(ShNotification shNotification);

    /**
     * 新增通知
     * 
     * @param shNotification 通知
     * @return 结果
     */
    public int insertShNotification(ShNotification shNotification);

    /**
     * 修改通知
     * 
     * @param shNotification 通知
     * @return 结果
     */
    public int updateShNotification(ShNotification shNotification);

    /**
     * 删除通知
     * 
     * @param nid 通知主键
     * @return 结果
     */
    public int deleteShNotificationByNid(Integer nid);

    /**
     * 批量删除通知
     * 
     * @param nids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteShNotificationByNids(Integer[] nids);
}
