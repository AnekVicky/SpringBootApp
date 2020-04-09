package com.practice.example1.controller;

import com.practice.example1.entity.TopicEntity;
import com.practice.example1.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    TopicService topicService ;

    @RequestMapping(value = "/topics",method = RequestMethod.GET)
    public List<TopicEntity> getAllTopics(){

        System.out.println("topicService"+topicService);



       return  topicService.getAllTopics();


    }
    @GetMapping("/topics/{topicId}")
    public List<TopicEntity> getByTopicId(@PathVariable("topicId") String topicId){

        return topicService.getByTopicId(topicId);
    }

    @PostMapping("/topicEntity")
    public void save(@RequestBody TopicEntity topicEntity){
        topicService.save(topicEntity);

    }

    @GetMapping("/topics/filter/")
    public String topicFilter(){
        return "Here is topic Filter called ";
    }


}
