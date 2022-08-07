package com.ruoyi.ShCollection.controller;

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
import com.ruoyi.ShCollection.domain.ShCollection;
import com.ruoyi.ShCollection.service.IShCollectionService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 收藏Controller
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@RestController
@RequestMapping("/ShCollection/ShCollection")
public class ShCollectionController extends BaseController
{
    @Autowired
    private IShCollectionService shCollectionService;

    /**
     * 查询收藏列表
     */
    @PreAuthorize("@ss.hasPermi('ShCollection:ShCollection:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShCollection shCollection)
    {
        startPage();
        List<ShCollection> list = shCollectionService.selectShCollectionList(shCollection);
        return getDataTable(list);
    }

    /**
     * 导出收藏列表
     */
    @PreAuthorize("@ss.hasPermi('ShCollection:ShCollection:export')")
    @Log(title = "收藏", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShCollection shCollection)
    {
        List<ShCollection> list = shCollectionService.selectShCollectionList(shCollection);
        ExcelUtil<ShCollection> util = new ExcelUtil<ShCollection>(ShCollection.class);
        util.exportExcel(response, list, "收藏数据");
    }

    /**
     * 获取收藏详细信息
     */
    @PreAuthorize("@ss.hasPermi('ShCollection:ShCollection:query')")
    @GetMapping(value = "/{collectionId}")
    public AjaxResult getInfo(@PathVariable("collectionId") Integer collectionId)
    {
        return AjaxResult.success(shCollectionService.selectShCollectionByCollectionId(collectionId));
    }

    /**
     * 新增收藏
     */
    @PreAuthorize("@ss.hasPermi('ShCollection:ShCollection:add')")
    @Log(title = "收藏", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShCollection shCollection)
    {
        return toAjax(shCollectionService.insertShCollection(shCollection));
    }

    /**
     * 修改收藏
     */
    @PreAuthorize("@ss.hasPermi('ShCollection:ShCollection:edit')")
    @Log(title = "收藏", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShCollection shCollection)
    {
        return toAjax(shCollectionService.updateShCollection(shCollection));
    }

    /**
     * 删除收藏
     */
    @PreAuthorize("@ss.hasPermi('ShCollection:ShCollection:remove')")
    @Log(title = "收藏", businessType = BusinessType.DELETE)
	@DeleteMapping("/{collectionIds}")
    public AjaxResult remove(@PathVariable Integer[] collectionIds)
    {
        return toAjax(shCollectionService.deleteShCollectionByCollectionIds(collectionIds));
    }
}
