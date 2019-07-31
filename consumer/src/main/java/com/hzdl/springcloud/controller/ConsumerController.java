package com.hzdl.springcloud.controller;

import com.hzdl.springcloud.bean.Type;
import com.hzdl.springcloud.util.HzdlJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/shiwu")
    public String shiwu(@RequestParam("id")Integer id){
        return restTemplate.getForEntity("http://localhost:8010/findById?id={id}",String.class,id).getBody();
    }

    @RequestMapping("/shiwu2")
    public HzdlJSONResult shiwu2(){
        return restTemplate.getForObject("http://localhost:8010/find",HzdlJSONResult.class);
    }

    @PostMapping("/jia")
    public void jia(@RequestBody Type type){
        restTemplate.postForEntity("http://localhost:8010/save",type,null);
    }
}
