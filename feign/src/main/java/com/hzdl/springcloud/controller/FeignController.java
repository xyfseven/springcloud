package com.hzdl.springcloud.controller;

import com.hzdl.springcloud.feign.FeignProviderClient;
import com.hzdl.springcloud.util.HzdlJSONResult;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findall")
    public HzdlJSONResult findAll(){
        return  feignProviderClient.findall();
    }

    @GetMapping("/index")
    public String index(){
        return  feignProviderClient.index();
    }
}
