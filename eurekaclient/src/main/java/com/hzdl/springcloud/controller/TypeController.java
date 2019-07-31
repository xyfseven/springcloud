package com.hzdl.springcloud.controller;

import com.hzdl.springcloud.bean.Type;
import com.hzdl.springcloud.service.TypeService;
import com.hzdl.springcloud.util.HzdlJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TypeController {
    @Autowired
    private TypeService typeService;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/find")
    public HzdlJSONResult find(){
        List<Type> all = typeService.findAll();
        return new HzdlJSONResult(all);
    }

    @RequestMapping("/findById")
    public HzdlJSONResult find(@RequestParam("id")Integer id){
        Type all = typeService.findById(id);
        return new HzdlJSONResult(all);
    }

    @RequestMapping("/findById2/{id}")
    public HzdlJSONResult find2(@PathVariable("id")Integer id){
        Type all = typeService.findById(id);
        return new HzdlJSONResult(all);
    }

    @RequestMapping("/save")
    public void hi(@RequestBody Type type){
        typeService.insert(type);
    }

    @GetMapping("/index")
    public String index(){
        return "当前端口"+this.port;
    }

}
