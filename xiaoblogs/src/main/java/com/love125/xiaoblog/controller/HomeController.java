package com.love125.xiaoblog.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 类的说明
 * @author 覃日晓
 * @since 2018-12-11 17:11
 */
@Slf4j
@Controller
@RequestMapping("/")
public class HomeController extends BaseController {

    @RequestMapping("/")
    public String index() {
        Integer i = null;
        i = 333;

        return "home/index";
    }
}
