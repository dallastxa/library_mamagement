package com.minicrof.mapper;


import com.minicrof.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

    @Select("select * from user where username=#{username} and password=#{password}")
    public User findByUsernamePwd(String username,String password);

    public User selectById(Integer id);
}
