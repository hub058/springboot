package com.bdqn.dao;

import com.bdqn.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/2/25.
 */
public interface UserMapper {

    @Select("select * from dev_user")
    public List<User> getAll();

    @Insert("insert into dev_user(devCode,devName) values(#{devCode},#{devName}) ")
    public void insertUser(User user);

}
