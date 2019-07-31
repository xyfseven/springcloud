package com.hzdl.fetign.impl;

import com.hzdl.fetign.FeignProviderClient;
import com.hzdl.util.HzdlJSONResult;
import org.springframework.stereotype.Component;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public String index() {
        return "当前服务器维护中";
    }

    @Override
    public HzdlJSONResult findall() {
        return new HzdlJSONResult("当前服务器维护中");
    }
}
