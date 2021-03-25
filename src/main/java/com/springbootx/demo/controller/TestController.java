package com.springbootx.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping("/hello")
    @ResponseBody
    @CrossOrigin
    public JSONObject hello(@RequestBody JSONObject param) {
        System.out.println(JSONObject.toJSONString(param));
        return param;
    }
}
