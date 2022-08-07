package com.ruoyi.ShComment.controller;

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
import com.ruoyi.ShComment.domain.ShComment;
import com.ruoyi.ShComment.service.IShCommentService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 评论Controller
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@RestController
@RequestMapping("/ShComment/ShComment")
public class ShCommentController extends BaseController
{
    @Autowired
    private IShCommentService shCommentService;

    /**
     * 查询评论列表
     */
    @PreAuthorize("@ss.hasPermi('ShComment:ShComment:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShComment shComment)
    {
        startPage();
        List<ShComment> list = shCommentService.selectShCommentList(shComment);
        return getDataTable(list);
    }

    /**
     * 导出评论列表
     */
    @PreAuthorize("@ss.hasPermi('ShComment:ShComment:export')")
    @Log(title = "评论", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShComment shComment)
    {
        List<ShComment> list = shCommentService.selectShCommentList(shComment);
        ExcelUtil<ShComment> util = new ExcelUtil<ShComment>(ShComment.class);
        util.exportExcel(response, list, "评论数据");
    }

    /**
     * 获取评论详细信息
     */
    @PreAuthorize("@ss.hasPermi('ShComment:ShComment:query')")
    @GetMapping(value = "/{commentId}")
    public AjaxResult getInfo(@PathVariable("commentId") Integer commentId)
    {
        return AjaxResult.success(shCommentService.selectShCommentByCommentId(commentId));
    }

    /**
     * 新增评论
     */
    @PreAuthorize("@ss.hasPermi('ShComment:ShComment:add')")
    @Log(title = "评论", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShComment shComment)
    {
        return toAjax(shCommentService.insertShComment(shComment));
    }

    /**
     * 修改评论
     */
    @PreAuthorize("@ss.hasPermi('ShComment:ShComment:edit')")
    @Log(title = "评论", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShComment shComment)
    {
        return toAjax(shCommentService.updateShComment(shComment));
    }

    /**
     * 删除评论
     */
    @PreAuthorize("@ss.hasPermi('ShComment:ShComment:remove')")
    @Log(title = "评论", businessType = BusinessType.DELETE)
	@DeleteMapping("/{commentIds}")
    public AjaxResult remove(@PathVariable Integer[] commentIds)
    {
        return toAjax(shCommentService.deleteShCommentByCommentIds(commentIds));
    }
}
