package com.ruoyi.ShNotification.controller;

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
import com.ruoyi.ShNotification.domain.ShNotification;
import com.ruoyi.ShNotification.service.IShNotificationService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 通知Controller
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@RestController
@RequestMapping("/ShNotification/ShNotification")
public class ShNotificationController extends BaseController
{
    @Autowired
    private IShNotificationService shNotificationService;

    /**
     * 查询通知列表
     */
    @PreAuthorize("@ss.hasPermi('ShNotification:ShNotification:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShNotification shNotification)
    {
        startPage();
        List<ShNotification> list = shNotificationService.selectShNotificationList(shNotification);
        return getDataTable(list);
    }

    /**
     * 导出通知列表
     */
    @PreAuthorize("@ss.hasPermi('ShNotification:ShNotification:export')")
    @Log(title = "通知", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShNotification shNotification)
    {
        List<ShNotification> list = shNotificationService.selectShNotificationList(shNotification);
        ExcelUtil<ShNotification> util = new ExcelUtil<ShNotification>(ShNotification.class);
        util.exportExcel(response, list, "通知数据");
    }

    /**
     * 获取通知详细信息
     */
    @PreAuthorize("@ss.hasPermi('ShNotification:ShNotification:query')")
    @GetMapping(value = "/{nid}")
    public AjaxResult getInfo(@PathVariable("nid") Integer nid)
    {
        return AjaxResult.success(shNotificationService.selectShNotificationByNid(nid));
    }

    /**
     * 新增通知
     */
    @PreAuthorize("@ss.hasPermi('ShNotification:ShNotification:add')")
    @Log(title = "通知", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShNotification shNotification)
    {
        return toAjax(shNotificationService.insertShNotification(shNotification));
    }

    /**
     * 修改通知
     */
    @PreAuthorize("@ss.hasPermi('ShNotification:ShNotification:edit')")
    @Log(title = "通知", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShNotification shNotification)
    {
        return toAjax(shNotificationService.updateShNotification(shNotification));
    }

    /**
     * 删除通知
     */
    @PreAuthorize("@ss.hasPermi('ShNotification:ShNotification:remove')")
    @Log(title = "通知", businessType = BusinessType.DELETE)
	@DeleteMapping("/{nids}")
    public AjaxResult remove(@PathVariable Integer[] nids)
    {
        return toAjax(shNotificationService.deleteShNotificationByNids(nids));
    }
}
