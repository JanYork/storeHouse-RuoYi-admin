package com.ruoyi.ShNotification.service;

import java.util.List;
import com.ruoyi.ShNotification.domain.ShNotification;

/**
 * 通知Service接口
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public interface IShNotificationService 
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
     * 批量删除通知
     * 
     * @param nids 需要删除的通知主键集合
     * @return 结果
     */
    public int deleteShNotificationByNids(Integer[] nids);

    /**
     * 删除通知信息
     * 
     * @param nid 通知主键
     * @return 结果
     */
    public int deleteShNotificationByNid(Integer nid);
}
