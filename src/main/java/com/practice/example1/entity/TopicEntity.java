package com.practice.example1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table
public class TopicEntity implements Serializable {


        @Id
        @Column
        String topicId ;

        @Column
        String topicName ;

        @Column
        String topicResource;

        @Column
        String topicTaker ;

      public  TopicEntity(){
            //default constructor
        }

        public String getId() {
            return topicId;
        }

        public void setId(String id) {
            this.topicId = id;
        }

        public String getTopicResource() {
            return topicResource;
        }

        public void setTopicResource(String topicResource) {
            this.topicResource = topicResource;
        }

        public String getTopicTaker() {
            return topicTaker;
        }

        public void setTopicTaker(String topicTaker) {
            this.topicTaker = topicTaker;
        }

        public String getTopicName() {
            return topicName;
        }

        public void setTopicName(String topicName) {
            this.topicName = topicName;
        }

        public TopicEntity(String topicName, String topicResource, String topicTaker) {

          //  this.topicId = id;
            this.topicName = topicName;
            this.topicResource = topicResource;
            this.topicTaker = topicTaker;
        }

        @Override
        public String toString() {
            return "TopicEntity{" +
                    "topic id = "+topicId+" \'"+
                    "topicName='" + topicName + '\'' +
                    ", topicResource='" + topicResource + '\'' +
                    ", topicTaker='" + topicTaker + '\'' +
                    '}';
        }
    }


