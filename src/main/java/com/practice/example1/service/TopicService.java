package com.practice.example1.service;

import com.practice.example1.entity.TopicEntity;
import com.practice.example1.repository.TopicRepository;
import com.practice.example1.utilities.CommonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {
/*
    @Autowired
    DataSource dataSource;*/

    @Autowired
    TopicRepository topicRepository ;

    public List<TopicEntity> getAllTopics(){

       List<TopicEntity> lists = new ArrayList<>();

        System.out.println("topicRepo"+topicRepository);
        //System.out.println("datasource"+dataSource.toString());

       // topicRepository.findById("OOP")

        topicRepository.findAll().forEach(lists::add);

       // System.out.println(topicRepository.findById("OOP"));
        return lists;

    }
    public String save(TopicEntity topicEntity){
        topicRepository.save(topicEntity);
        return "Data is saved";
    }


    public List<TopicEntity> getByTopicId(String topicId) {

        CommonServices services = new CommonServices(topicId);
        System.out.println("Topicc Repo :: "+topicRepository);
        return topicRepository.findByTopicId(topicId);
    }
}
