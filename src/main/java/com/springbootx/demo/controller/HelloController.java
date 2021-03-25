package com.springbootx.demo.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    @CrossOrigin
    public JSONObject hello(@RequestBody JSONObject param) {
        System.out.println(JSONObject.toJSONString(param));
        return param;
    }

    @RequestMapping("/ng-billing-ext/services/task/IotExportTaskAdd")
    @ResponseBody
    @CrossOrigin
    public JSONObject test(@RequestBody JSONObject param) {
        System.out.println(JSONObject.toJSONString(param));
        return param;
    }

    public static void main(String[] args) {
        String s = "1";
        String s1 = "";
        String key = String.format("%s-%s", s, s1);
        System.out.println(key);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }


}
