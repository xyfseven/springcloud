package com.hzdl.springcloud.feign;

import com.hzdl.springcloud.feign.impl.FeignError;
import com.hzdl.springcloud.util.HzdlJSONResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider",fallback = FeignError.class) //访问的是哪个微服务名字
@Repository
public interface FeignProviderClient {

    @GetMapping("/index")
    String index();
    @GetMapping("/find")
    HzdlJSONResult findall();
}
