package com.lf.community.entity;

import lombok.Data;

import java.util.Date;

@Data
public class DiscussPost {
    private int id;
    private int userId;  //这个访问量应该比较多，是否可以考虑直接在数据库中写入用户名
    private String title;
    private String content;
    private int type;
    private int status;
    private Date  createTime;
    private int commetCount;
    private double score;







}
