package com.qqzone.pojo.pojo.service.impl;

import com.qqzone.pojo.pojo.Topic;
import com.qqzone.pojo.pojo.UserBasic;
import com.qqzone.pojo.pojo.pojo.TopicDAO;
import com.qqzone.pojo.pojo.service.TopicService;

import java.util.List;

public class TopicServiceImpl implements TopicService {

    private TopicDAO topicDAO = null ;

    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return topicDAO.getTopicList(userBasic);
    }
}
