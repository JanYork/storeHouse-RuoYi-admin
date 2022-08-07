package com.ruoyi.ShNotification.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ShNotification.mapper.ShNotificationMapper;
import com.ruoyi.ShNotification.domain.ShNotification;
import com.ruoyi.ShNotification.service.IShNotificationService;

/**
 * 通知Service业务层处理
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@Service
public class ShNotificationServiceImpl implements IShNotificationService 
{
    @Autowired
    private ShNotificationMapper shNotificationMapper;

    /**
     * 查询通知
     * 
     * @param nid 通知主键
     * @return 通知
     */
    @Override
    public ShNotification selectShNotificationByNid(Integer nid)
    {
        return shNotificationMapper.selectShNotificationByNid(nid);
    }

    /**
     * 查询通知列表
     * 
     * @param shNotification 通知
     * @return 通知
     */
    @Override
    public List<ShNotification> selectShNotificationList(ShNotification shNotification)
    {
        return shNotificationMapper.selectShNotificationList(shNotification);
    }

    /**
     * 新增通知
     * 
     * @param shNotification 通知
     * @return 结果
     */
    @Override
    public int insertShNotification(ShNotification shNotification)
    {
        return shNotificationMapper.insertShNotification(shNotification);
    }

    /**
     * 修改通知
     * 
     * @param shNotification 通知
     * @return 结果
     */
    @Override
    public int updateShNotification(ShNotification shNotification)
    {
        return shNotificationMapper.updateShNotification(shNotification);
    }

    /**
     * 批量删除通知
     * 
     * @param nids 需要删除的通知主键
     * @return 结果
     */
    @Override
    public int deleteShNotificationByNids(Integer[] nids)
    {
        return shNotificationMapper.deleteShNotificationByNids(nids);
    }

    /**
     * 删除通知信息
     * 
     * @param nid 通知主键
     * @return 结果
     */
    @Override
    public int deleteShNotificationByNid(Integer nid)
    {
        return shNotificationMapper.deleteShNotificationByNid(nid);
    }
}
