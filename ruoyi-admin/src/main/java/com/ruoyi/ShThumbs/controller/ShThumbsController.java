package com.ruoyi.ShThumbs.controller;

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
import com.ruoyi.ShThumbs.domain.ShThumbs;
import com.ruoyi.ShThumbs.service.IShThumbsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 点赞Controller
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@RestController
@RequestMapping("/ShThumbs/ShThumbs")
public class ShThumbsController extends BaseController
{
    @Autowired
    private IShThumbsService shThumbsService;

    /**
     * 查询点赞列表
     */
    @PreAuthorize("@ss.hasPermi('ShThumbs:ShThumbs:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShThumbs shThumbs)
    {
        startPage();
        List<ShThumbs> list = shThumbsService.selectShThumbsList(shThumbs);
        return getDataTable(list);
    }

    /**
     * 导出点赞列表
     */
    @PreAuthorize("@ss.hasPermi('ShThumbs:ShThumbs:export')")
    @Log(title = "点赞", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShThumbs shThumbs)
    {
        List<ShThumbs> list = shThumbsService.selectShThumbsList(shThumbs);
        ExcelUtil<ShThumbs> util = new ExcelUtil<ShThumbs>(ShThumbs.class);
        util.exportExcel(response, list, "点赞数据");
    }

    /**
     * 获取点赞详细信息
     */
    @PreAuthorize("@ss.hasPermi('ShThumbs:ShThumbs:query')")
    @GetMapping(value = "/{thumbsId}")
    public AjaxResult getInfo(@PathVariable("thumbsId") Integer thumbsId)
    {
        return AjaxResult.success(shThumbsService.selectShThumbsByThumbsId(thumbsId));
    }

    /**
     * 新增点赞
     */
    @PreAuthorize("@ss.hasPermi('ShThumbs:ShThumbs:add')")
    @Log(title = "点赞", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShThumbs shThumbs)
    {
        return toAjax(shThumbsService.insertShThumbs(shThumbs));
    }

    /**
     * 修改点赞
     */
    @PreAuthorize("@ss.hasPermi('ShThumbs:ShThumbs:edit')")
    @Log(title = "点赞", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShThumbs shThumbs)
    {
        return toAjax(shThumbsService.updateShThumbs(shThumbs));
    }

    /**
     * 删除点赞
     */
    @PreAuthorize("@ss.hasPermi('ShThumbs:ShThumbs:remove')")
    @Log(title = "点赞", businessType = BusinessType.DELETE)
	@DeleteMapping("/{thumbsIds}")
    public AjaxResult remove(@PathVariable Integer[] thumbsIds)
    {
        return toAjax(shThumbsService.deleteShThumbsByThumbsIds(thumbsIds));
    }
}
