package com.zcx.myblogs.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    public int addUser(@Param("username") String username,
                   @Param("password") String password);

}
