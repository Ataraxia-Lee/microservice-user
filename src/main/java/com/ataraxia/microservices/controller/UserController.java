package com.ataraxia.microservices.controller;

import com.ataraxia.microservices.util.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilong
 */
@Api(tags = "首页模块")
@RestController
public class UserController {

    @ApiOperation(value = "向客人问好")
    @GetMapping("/index")
    public Result index() {
        SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<String> list = new ArrayList<>();
        list.add("1");
        return Result.success(null, list);
    }

}
