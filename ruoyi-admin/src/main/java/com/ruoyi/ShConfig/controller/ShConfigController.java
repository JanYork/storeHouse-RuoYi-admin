package com.ruoyi.ShConfig.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.ShConfig.domain.ShConfig;
import com.ruoyi.ShConfig.service.IShConfigService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 配置Controller
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@RestController
@RequestMapping("/ShConfig/ShConfig")
public class ShConfigController extends BaseController
{
    @Autowired
    private IShConfigService shConfigService;

    /**
     * 查询配置列表
     */
    @PreAuthorize("@ss.hasPermi('ShConfig:ShConfig:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShConfig shConfig)
    {
        startPage();
        List<ShConfig> list = shConfigService.selectShConfigList(shConfig);
        return getDataTable(list);
    }

    /**
     * 导出配置列表
     */
    @PreAuthorize("@ss.hasPermi('ShConfig:ShConfig:export')")
    @Log(title = "配置", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShConfig shConfig)
    {
        List<ShConfig> list = shConfigService.selectShConfigList(shConfig);
        ExcelUtil<ShConfig> util = new ExcelUtil<ShConfig>(ShConfig.class);
        util.exportExcel(response, list, "配置数据");
    }

    /**
     * 获取配置详细信息
     */
    @PreAuthorize("@ss.hasPermi('ShConfig:ShConfig:query')")
    @GetMapping(value = "/{cid}")
    public AjaxResult getInfo(@PathVariable("cid") Integer cid)
    {
        return AjaxResult.success(shConfigService.selectShConfigByCid(cid));
    }

    /**
     * 新增配置
     */
    @PreAuthorize("@ss.hasPermi('ShConfig:ShConfig:add')")
    @Log(title = "配置", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShConfig shConfig)
    {
        return toAjax(shConfigService.insertShConfig(shConfig));
    }

    /**
     * 修改配置
     */
    @PreAuthorize("@ss.hasPermi('ShConfig:ShConfig:edit')")
    @Log(title = "配置", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShConfig shConfig)
    {
        return toAjax(shConfigService.updateShConfig(shConfig));
    }

    /**
     * 删除配置
     */
    @PreAuthorize("@ss.hasPermi('ShConfig:ShConfig:remove')")
    @Log(title = "配置", businessType = BusinessType.DELETE)
	@DeleteMapping("/{cids}")
    public AjaxResult remove(@PathVariable Integer[] cids)
    {
        return toAjax(shConfigService.deleteShConfigByCids(cids));
    }
}
