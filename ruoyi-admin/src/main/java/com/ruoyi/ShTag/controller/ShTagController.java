package com.ruoyi.ShTag.controller;

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
import com.ruoyi.ShTag.domain.ShTag;
import com.ruoyi.ShTag.service.IShTagService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 标签Controller
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@RestController
@RequestMapping("/ShTag/ShTag")
public class ShTagController extends BaseController
{
    @Autowired
    private IShTagService shTagService;

    /**
     * 查询标签列表
     */
    @PreAuthorize("@ss.hasPermi('ShTag:ShTag:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShTag shTag)
    {
        startPage();
        List<ShTag> list = shTagService.selectShTagList(shTag);
        return getDataTable(list);
    }

    /**
     * 导出标签列表
     */
    @PreAuthorize("@ss.hasPermi('ShTag:ShTag:export')")
    @Log(title = "标签", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShTag shTag)
    {
        List<ShTag> list = shTagService.selectShTagList(shTag);
        ExcelUtil<ShTag> util = new ExcelUtil<ShTag>(ShTag.class);
        util.exportExcel(response, list, "标签数据");
    }

    /**
     * 获取标签详细信息
     */
    @PreAuthorize("@ss.hasPermi('ShTag:ShTag:query')")
    @GetMapping(value = "/{tagId}")
    public AjaxResult getInfo(@PathVariable("tagId") Integer tagId)
    {
        return AjaxResult.success(shTagService.selectShTagByTagId(tagId));
    }

    /**
     * 新增标签
     */
    @PreAuthorize("@ss.hasPermi('ShTag:ShTag:add')")
    @Log(title = "标签", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShTag shTag)
    {
        return toAjax(shTagService.insertShTag(shTag));
    }

    /**
     * 修改标签
     */
    @PreAuthorize("@ss.hasPermi('ShTag:ShTag:edit')")
    @Log(title = "标签", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShTag shTag)
    {
        return toAjax(shTagService.updateShTag(shTag));
    }

    /**
     * 删除标签
     */
    @PreAuthorize("@ss.hasPermi('ShTag:ShTag:remove')")
    @Log(title = "标签", businessType = BusinessType.DELETE)
	@DeleteMapping("/{tagIds}")
    public AjaxResult remove(@PathVariable Integer[] tagIds)
    {
        return toAjax(shTagService.deleteShTagByTagIds(tagIds));
    }
}
