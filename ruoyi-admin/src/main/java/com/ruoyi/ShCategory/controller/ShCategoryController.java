package com.ruoyi.ShCategory.controller;

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
import com.ruoyi.ShCategory.domain.ShCategory;
import com.ruoyi.ShCategory.service.IShCategoryService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 板块Controller
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@RestController
@RequestMapping("/ShCategory/ShCategory")
public class ShCategoryController extends BaseController
{
    @Autowired
    private IShCategoryService shCategoryService;

    /**
     * 查询板块列表
     */
    @PreAuthorize("@ss.hasPermi('ShCategory:ShCategory:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShCategory shCategory)
    {
        startPage();
        List<ShCategory> list = shCategoryService.selectShCategoryList(shCategory);
        return getDataTable(list);
    }

    /**
     * 导出板块列表
     */
    @PreAuthorize("@ss.hasPermi('ShCategory:ShCategory:export')")
    @Log(title = "板块", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShCategory shCategory)
    {
        List<ShCategory> list = shCategoryService.selectShCategoryList(shCategory);
        ExcelUtil<ShCategory> util = new ExcelUtil<ShCategory>(ShCategory.class);
        util.exportExcel(response, list, "板块数据");
    }

    /**
     * 获取板块详细信息
     */
    @PreAuthorize("@ss.hasPermi('ShCategory:ShCategory:query')")
    @GetMapping(value = "/{categoryId}")
    public AjaxResult getInfo(@PathVariable("categoryId") Integer categoryId)
    {
        return AjaxResult.success(shCategoryService.selectShCategoryByCategoryId(categoryId));
    }

    /**
     * 新增板块
     */
    @PreAuthorize("@ss.hasPermi('ShCategory:ShCategory:add')")
    @Log(title = "板块", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShCategory shCategory)
    {
        return toAjax(shCategoryService.insertShCategory(shCategory));
    }

    /**
     * 修改板块
     */
    @PreAuthorize("@ss.hasPermi('ShCategory:ShCategory:edit')")
    @Log(title = "板块", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShCategory shCategory)
    {
        return toAjax(shCategoryService.updateShCategory(shCategory));
    }

    /**
     * 删除板块
     */
    @PreAuthorize("@ss.hasPermi('ShCategory:ShCategory:remove')")
    @Log(title = "板块", businessType = BusinessType.DELETE)
	@DeleteMapping("/{categoryIds}")
    public AjaxResult remove(@PathVariable Integer[] categoryIds)
    {
        return toAjax(shCategoryService.deleteShCategoryByCategoryIds(categoryIds));
    }
}
