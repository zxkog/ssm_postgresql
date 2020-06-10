package com.example.ssm_postgresql.dao;

import com.example.ssm_postgresql.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    int insert(User record);
}