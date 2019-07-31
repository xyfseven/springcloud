package com.hzdl.springcloud.mapper;

import com.hzdl.springcloud.bean.Type;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TypeMapper {
    @Select("select * from type")
    List<Type> findAll();

    @Select("select * from type where id = #{id}")
    Type findById(Integer id);
    @Insert("insert into type(name) values (#{name})")
    int insert(Type type);
}
