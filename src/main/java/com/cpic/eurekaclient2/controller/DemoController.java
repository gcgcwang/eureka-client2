package com.cpic.eurekaclient2.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Desc:
 * @Author: wangguochao-001
 * @Date：2020/6/10
 */
@RestController
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);


    @RequestMapping(value = "/demo")
    public String index(@RequestParam("name") String demo_name){
        return "Hello world cleint2|I'm "+demo_name;
    }

}
