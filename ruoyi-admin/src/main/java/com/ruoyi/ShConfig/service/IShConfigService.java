package com.ruoyi.ShConfig.service;

import java.util.List;
import com.ruoyi.ShConfig.domain.ShConfig;

/**
 * 配置Service接口
 * 
 * @author JanYork
 * @date 2022-07-27
 */
public interface IShConfigService 
{
    /**
     * 查询配置
     * 
     * @param cid 配置主键
     * @return 配置
     */
    public ShConfig selectShConfigByCid(Integer cid);

    /**
     * 查询配置列表
     * 
     * @param shConfig 配置
     * @return 配置集合
     */
    public List<ShConfig> selectShConfigList(ShConfig shConfig);

    /**
     * 新增配置
     * 
     * @param shConfig 配置
     * @return 结果
     */
    public int insertShConfig(ShConfig shConfig);

    /**
     * 修改配置
     * 
     * @param shConfig 配置
     * @return 结果
     */
    public int updateShConfig(ShConfig shConfig);

    /**
     * 批量删除配置
     * 
     * @param cids 需要删除的配置主键集合
     * @return 结果
     */
    public int deleteShConfigByCids(Integer[] cids);

    /**
     * 删除配置信息
     * 
     * @param cid 配置主键
     * @return 结果
     */
    public int deleteShConfigByCid(Integer cid);
}
