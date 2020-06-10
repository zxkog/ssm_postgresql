package com.example.ssm_postgresql;

import com.example.ssm_postgresql.dao.UserMapper;
import com.example.ssm_postgresql.domain.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ssm_postgresql.dao")
public class SsmPostgresqlApplication {
    

    public static void main(String[] args) {
        SpringApplication.run(SsmPostgresqlApplication.class, args);
    }
}
