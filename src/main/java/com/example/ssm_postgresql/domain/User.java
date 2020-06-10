package com.example.ssm_postgresql.domain;

import java.io.Serializable;
import lombok.Data;

/**
 * @author 
 * null
 */
@Data
public class User implements Serializable {
    private String id;

    private String username;

    private String password;

    private String age;

    private static final long serialVersionUID = 1L;
}