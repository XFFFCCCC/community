package com.lf.community.service;

import com.lf.community.dao.DiscussPostMapper;
import com.lf.community.entity.DiscussPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DiscussPostService {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    public List<DiscussPost> findDiscussPosts(int userId,int offset,int limit){
        List<DiscussPost> list=new ArrayList<>();
        List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(userId, offset, limit);
        if(discussPosts!=null){
            for (DiscussPost discussPost : discussPosts) {
                list.add(discussPost);
            }
        }
        return list;
    }

     public int findDiscussPostRows(int userId){
        return discussPostMapper.selectDiscussPostRows(userId);
     }


}
