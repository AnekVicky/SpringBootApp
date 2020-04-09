package com.practice.example1.utilities;

import org.springframework.stereotype.Component;

@Component
public class CommonServices  {

    private static String topicId ;

    public CommonServices(String topicId){
        this.topicId = topicId ;
    }
    public CommonServices(){

    }
    public static String getTopicId() {
        return topicId;
    }
}
