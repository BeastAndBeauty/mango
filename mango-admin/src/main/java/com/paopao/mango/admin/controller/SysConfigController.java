package com.paopao.mango.admin.controller;

import com.paopao.mango.admin.model.SysConfig;
import com.paopao.mango.admin.service.SysConfigService;
import com.paopao.mango.core.http.HttpResult;
import com.paopao.mango.core.page.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Create by paopao on 2019-11-17 14:52
 */
@RestController
@RequestMapping("config")
public class SysConfigController {

    @Autowired
    private SysConfigService sysConfigService;

    @PostMapping(value = "/save")
    public HttpResult save(@RequestBody SysConfig record) {
        return HttpResult.ok(sysConfigService.save(record));
    }

    @PostMapping(value = "/delete")
    public HttpResult delete(@RequestBody List<SysConfig> records) {
        return HttpResult.ok(sysConfigService.delete(records));
    }

    @PostMapping(value = "/findPage")
    public HttpResult findPage(@RequestBody PageRequest pageRequest) {
        return HttpResult.ok(sysConfigService.findPage(pageRequest));
    }

    @GetMapping(value = "/findByLabel")
    public HttpResult findByLabel(@RequestParam String label) {
        return HttpResult.ok(sysConfigService.findByLabel(label));
    }
}
