package com.lf.community.entity;



import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.Date;


@Data

@Component
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;
    private String email;
    private int type;
    private int status;
    private String activationCode;
    private String headerUrl;
    private Date   createTime;



}
