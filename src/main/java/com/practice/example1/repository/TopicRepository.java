package com.practice.example1.repository;
import java.util.List;
import com.practice.example1.entity.TopicEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends JpaRepository<TopicEntity,String> {

    //@Query("select t.topicId,t.topicName.t.topicResource,t.topicTaker from TopicEntity t")
    List<TopicEntity> findByTopicId(String topicId);
}
