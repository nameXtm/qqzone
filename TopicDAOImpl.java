package com.qqzone.pojo.pojo.pojo.impl;

import com.myssm.basedao.BaseDAO;
import com.qqzone.pojo.pojo.Topic;
import com.qqzone.pojo.pojo.UserBasic;
import com.qqzone.pojo.pojo.pojo.TopicDAO;

import java.util.List;

public class TopicDAOImpl extends BaseDAO<Topic> implements TopicDAO {
    @Override
    public List<Topic> getTopicList(UserBasic userBasic) {
        return super.executeQuery("select * from t_topic where author = ? " , userBasic.getId());
    }

    @Override
    public void addTopic(Topic topic) {

    }

    @Override
    public void delTopic(Topic topic) {

    }

    @Override
    public Topic getTopic(Integer id) {
        return null;
    }
}
