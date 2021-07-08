package com.ataraxia.microservices.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lilong
 */
@RestController
public class UserController {

    @GetMapping("/index")
    public List<String> index() {
        SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        List<String> list = new ArrayList<>();
        list.add("1");
        return list;
    }

}
