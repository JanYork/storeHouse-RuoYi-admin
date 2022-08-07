package com.ruoyi.Shuserinfo.controller;

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
import com.ruoyi.Shuserinfo.domain.Shuserinfo;
import com.ruoyi.Shuserinfo.service.IShuserinfoService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 用户Controller
 * 
 * @author JanYork
 * @date 2022-07-27
 */
@RestController
@RequestMapping("/Shuserinfo/Shuserinfo")
public class ShuserinfoController extends BaseController
{
    @Autowired
    private IShuserinfoService shuserinfoService;

    /**
     * 查询用户列表
     */
    @PreAuthorize("@ss.hasPermi('Shuserinfo:Shuserinfo:list')")
    @GetMapping("/list")
    public TableDataInfo list(Shuserinfo shuserinfo)
    {
        startPage();
        List<Shuserinfo> list = shuserinfoService.selectShuserinfoList(shuserinfo);
        return getDataTable(list);
    }

    /**
     * 导出用户列表
     */
    @PreAuthorize("@ss.hasPermi('Shuserinfo:Shuserinfo:export')")
    @Log(title = "用户", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, Shuserinfo shuserinfo)
    {
        List<Shuserinfo> list = shuserinfoService.selectShuserinfoList(shuserinfo);
        ExcelUtil<Shuserinfo> util = new ExcelUtil<Shuserinfo>(Shuserinfo.class);
        util.exportExcel(response, list, "用户数据");
    }

    /**
     * 获取用户详细信息
     */
    @PreAuthorize("@ss.hasPermi('Shuserinfo:Shuserinfo:query')")
    @GetMapping(value = "/{uid}")
    public AjaxResult getInfo(@PathVariable("uid") Integer uid)
    {
        return AjaxResult.success(shuserinfoService.selectShuserinfoByUid(uid));
    }

    /**
     * 新增用户
     */
    @PreAuthorize("@ss.hasPermi('Shuserinfo:Shuserinfo:add')")
    @Log(title = "用户", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody Shuserinfo shuserinfo)
    {
        return toAjax(shuserinfoService.insertShuserinfo(shuserinfo));
    }

    /**
     * 修改用户
     */
    @PreAuthorize("@ss.hasPermi('Shuserinfo:Shuserinfo:edit')")
    @Log(title = "用户", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody Shuserinfo shuserinfo)
    {
        return toAjax(shuserinfoService.updateShuserinfo(shuserinfo));
    }

    /**
     * 删除用户
     */
    @PreAuthorize("@ss.hasPermi('Shuserinfo:Shuserinfo:remove')")
    @Log(title = "用户", businessType = BusinessType.DELETE)
	@DeleteMapping("/{uids}")
    public AjaxResult remove(@PathVariable Integer[] uids)
    {
        return toAjax(shuserinfoService.deleteShuserinfoByUids(uids));
    }
}
