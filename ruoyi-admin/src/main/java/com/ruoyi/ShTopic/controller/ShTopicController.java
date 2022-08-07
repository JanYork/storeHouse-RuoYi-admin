package com.ruoyi.ShTopic.controller;

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
import com.ruoyi.ShTopic.domain.ShTopic;
import com.ruoyi.ShTopic.service.IShTopicService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 文章Controller
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@RestController
@RequestMapping("/ShTopic/ShTopic")
public class ShTopicController extends BaseController
{
    @Autowired
    private IShTopicService shTopicService;

    /**
     * 查询文章列表
     */
    @PreAuthorize("@ss.hasPermi('ShTopic:ShTopic:list')")
    @GetMapping("/list")
    public TableDataInfo list(ShTopic shTopic)
    {
        startPage();
        List<ShTopic> list = shTopicService.selectShTopicList(shTopic);
        return getDataTable(list);
    }

    /**
     * 导出文章列表
     */
    @PreAuthorize("@ss.hasPermi('ShTopic:ShTopic:export')")
    @Log(title = "文章", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ShTopic shTopic)
    {
        List<ShTopic> list = shTopicService.selectShTopicList(shTopic);
        ExcelUtil<ShTopic> util = new ExcelUtil<ShTopic>(ShTopic.class);
        util.exportExcel(response, list, "文章数据");
    }

    /**
     * 获取文章详细信息
     */
    @PreAuthorize("@ss.hasPermi('ShTopic:ShTopic:query')")
    @GetMapping(value = "/{topicId}")
    public AjaxResult getInfo(@PathVariable("topicId") Integer topicId)
    {
        return AjaxResult.success(shTopicService.selectShTopicByTopicId(topicId));
    }

    /**
     * 新增文章
     */
    @PreAuthorize("@ss.hasPermi('ShTopic:ShTopic:add')")
    @Log(title = "文章", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ShTopic shTopic)
    {
        return toAjax(shTopicService.insertShTopic(shTopic));
    }

    /**
     * 修改文章
     */
    @PreAuthorize("@ss.hasPermi('ShTopic:ShTopic:edit')")
    @Log(title = "文章", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ShTopic shTopic)
    {
        return toAjax(shTopicService.updateShTopic(shTopic));
    }

    /**
     * 删除文章
     */
    @PreAuthorize("@ss.hasPermi('ShTopic:ShTopic:remove')")
    @Log(title = "文章", businessType = BusinessType.DELETE)
	@DeleteMapping("/{topicIds}")
    public AjaxResult remove(@PathVariable Integer[] topicIds)
    {
        return toAjax(shTopicService.deleteShTopicByTopicIds(topicIds));
    }
}
