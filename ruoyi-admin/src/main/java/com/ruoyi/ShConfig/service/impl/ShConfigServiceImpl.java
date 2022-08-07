package com.ruoyi.ShConfig.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.ShConfig.mapper.ShConfigMapper;
import com.ruoyi.ShConfig.domain.ShConfig;
import com.ruoyi.ShConfig.service.IShConfigService;

/**
 * 配置Service业务层处理
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@Service
public class ShConfigServiceImpl implements IShConfigService 
{
    @Autowired
    private ShConfigMapper shConfigMapper;

    /**
     * 查询配置
     * 
     * @param cid 配置主键
     * @return 配置
     */
    @Override
    public ShConfig selectShConfigByCid(Integer cid)
    {
        return shConfigMapper.selectShConfigByCid(cid);
    }

    /**
     * 查询配置列表
     * 
     * @param shConfig 配置
     * @return 配置
     */
    @Override
    public List<ShConfig> selectShConfigList(ShConfig shConfig)
    {
        return shConfigMapper.selectShConfigList(shConfig);
    }

    /**
     * 新增配置
     * 
     * @param shConfig 配置
     * @return 结果
     */
    @Override
    public int insertShConfig(ShConfig shConfig)
    {
        return shConfigMapper.insertShConfig(shConfig);
    }

    /**
     * 修改配置
     * 
     * @param shConfig 配置
     * @return 结果
     */
    @Override
    public int updateShConfig(ShConfig shConfig)
    {
        return shConfigMapper.updateShConfig(shConfig);
    }

    /**
     * 批量删除配置
     * 
     * @param cids 需要删除的配置主键
     * @return 结果
     */
    @Override
    public int deleteShConfigByCids(Integer[] cids)
    {
        return shConfigMapper.deleteShConfigByCids(cids);
    }

    /**
     * 删除配置信息
     * 
     * @param cid 配置主键
     * @return 结果
     */
    @Override
    public int deleteShConfigByCid(Integer cid)
    {
        return shConfigMapper.deleteShConfigByCid(cid);
    }
}
