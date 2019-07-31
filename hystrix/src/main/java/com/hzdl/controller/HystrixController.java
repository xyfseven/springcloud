package com.hzdl.controller;

import com.hzdl.fetign.FeignProviderClient;
import com.hzdl.util.HzdlJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HystrixController {

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
