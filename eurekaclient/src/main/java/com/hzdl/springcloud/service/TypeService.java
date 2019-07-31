package com.hzdl.springcloud.service;

import com.hzdl.springcloud.bean.Type;

import java.util.List;

public interface TypeService {
    List<Type> findAll();
    Type findById(Integer id);
    Integer insert(Type type);
    Integer del(Integer id);
}
