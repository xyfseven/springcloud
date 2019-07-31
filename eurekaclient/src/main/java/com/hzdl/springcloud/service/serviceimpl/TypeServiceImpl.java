package com.hzdl.springcloud.service.serviceimpl;

import com.hzdl.springcloud.bean.Type;
import com.hzdl.springcloud.mapper.TypeMapper;
import com.hzdl.springcloud.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    private TypeMapper typeMapper;
    @Override
    public List<Type> findAll() {
        return typeMapper.findAll();
    }

    @Override
    public Type findById(Integer id) {
        return typeMapper.findById(id);
    }

    @Override
    public Integer insert(Type type) {
        return typeMapper.insert(type);
    }

    @Override
    public Integer del(Integer id) {
        return null;
    }
}
