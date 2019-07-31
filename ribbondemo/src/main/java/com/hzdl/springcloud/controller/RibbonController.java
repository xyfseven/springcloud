package com.hzdl.springcloud.controller;

import com.hzdl.springcloud.util.HzdlJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findall")
    public HzdlJSONResult findall(){
        return restTemplate.getForObject("http://provider/find",HzdlJSONResult.class);
    }

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/index",String.class);
    }
}
