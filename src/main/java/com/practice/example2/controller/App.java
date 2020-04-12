package com.practice.example1;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.sql.DataSource;
import javax.xml.crypto.Data;


@SpringBootApplication
@EnableSwagger2
@EntityScan("com.practice.example1.entity")
@EnableJpaRepositories(
        entityManagerFactoryRef = "entityManagerFactory",
        basePackages = { "com.practice.example1.repository" }
)
public class App {

    public static void main(String... args){

        SpringApplication.run(App.class,args);
        System.out.println("Here is the Spring Boot App");


    }


}
