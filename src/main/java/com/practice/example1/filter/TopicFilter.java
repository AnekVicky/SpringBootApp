package com.practice.example1.filter;

import com.practice.example1.entity.TopicEntity;
import com.practice.example1.repository.TopicRepository;
import com.practice.example1.service.TopicService;
import com.practice.example1.utilities.CommonServices;
import org.hibernate.validator.constraints.EAN;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Component
public class TopicFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        System.out.println("In do filter ");
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse ;
        System.out.println("request URI"+request.getRequestURI());
        System.out.println("user "+request.getRemoteUser());
        System.out.println("Auth Type"+request.getAuthType());

        ServletContext servletContext = request.getServletContext();
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        TopicService topicService = webApplicationContext.getBean(TopicService.class);

        String topicId = CommonServices.getTopicId();
        System.out.println("topicId is "+topicId);
        System.out.println("topic Service is "+topicService);
        List<TopicEntity> list = topicService.getByTopicId(topicId);
        System.out.println(list);
        for(TopicEntity e :list){
            System.out.println(e.toString());
        }

      if (list.isEmpty()){

                TopicEntity entity = new TopicEntity();
                entity.setId(topicId);
                entity.setTopicName("Spring Boot");
                entity.setTopicResource("Youtube");
                entity.setTopicTaker("Java Brains");


                topicService.save(entity);

        }else{

            System.out.println("topic already exists");
        }

        filterChain.doFilter(servletRequest,servletResponse);

    }
}
