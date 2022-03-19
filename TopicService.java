package com.qqzone.pojo.pojo.service;

import com.qqzone.pojo.pojo.Topic;
import com.qqzone.pojo.pojo.UserBasic;

import java.util.List;

public interface TopicService {
    //查询特定用户的日志列表
    List<Topic> getTopicList(UserBasic userBasic) ;
}
