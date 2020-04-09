package com.practice.example1.configurer;

import com.practice.example1.entity.TopicEntity;
import com.practice.example1.filter.TopicFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfiguration {


    @Bean
    public FilterRegistrationBean<TopicFilter> registrationBean(){

    FilterRegistrationBean<TopicFilter> registrationBean = new FilterRegistrationBean<>();
    registrationBean.setFilter(new TopicFilter());
    registrationBean.addUrlPatterns("/topics/filter/*");
    return  registrationBean;


}

}

