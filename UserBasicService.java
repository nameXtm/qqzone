package com.qqzone.pojo.pojo.service;

import com.qqzone.pojo.pojo.UserBasic;

import java.util.List;

public interface UserBasicService {
    UserBasic login(String loginId , String pwd );
    List<UserBasic> getFriendList(UserBasic userBasic);
}
