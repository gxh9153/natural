package com.gxh.natural.modules.ums.controller;

import com.gxh.natural.common.api.CommonResult;
import com.gxh.natural.modules.ums.model.UmsAdmin;
import com.gxh.natural.modules.ums.service.UmsAdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 后台用户模块
 * @author: gxh
 * @create: 2021-09-14-23-28
 **/
@RestController
@Api(tags = "UmsAdminController",description = "后台用户模块")
@RequestMapping("/admin")
public class UmsAdminController {

    @Autowired
    private UmsAdminService umsAdminService;

    @GetMapping("/list")
    @ApiOperation(value = "获取全部后台名称")
    public CommonResult<List<UmsAdmin>> getList(){
        List<UmsAdmin> list = umsAdminService.getList();
        return CommonResult.success(list);
    }
}
