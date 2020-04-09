/*
 package  com.practice.example1.configurer;

 import org.springframework.beans.factory.annotation.Qualifier;
 import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
 import org.springframework.boot.context.properties.ConfigurationProperties;
 import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.context.annotation.Primary;
 import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 import org.springframework.orm.jpa.JpaTransactionManager;
 import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
 import org.springframework.transaction.PlatformTransactionManager;
 import org.springframework.transaction.annotation.EnableTransactionManagement;

 import javax.persistence.EntityManagerFactory;
 import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement

public class ConfigureWeatherDB {

    @Primary
    @Bean(name="weatherDSProps")
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "weatherDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource weatherDataSource(@Qualifier("weatherDSProps") DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder().build();
    }

    @Primary
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    entityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("weatherDataSource") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("com.practice.example1.repository")
                .persistenceUnit("weather")
                .build();
    }

    @Primary
    @Bean(name = "transactionManager")
    @ConfigurationProperties("spring.jpa")
    public PlatformTransactionManager transactionManager(
            @Qualifier("entityManagerFactory") EntityManagerFactory
                    entityManagerFactory
    ) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}
*/

 package  com.practice.example1.configurer;

 import org.springframework.beans.factory.annotation.Qualifier;
 import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
 import org.springframework.boot.context.properties.ConfigurationProperties;
 import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.context.annotation.Primary;
 import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
 import org.springframework.orm.jpa.JpaTransactionManager;
 import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
 import org.springframework.transaction.PlatformTransactionManager;
 import org.springframework.transaction.annotation.EnableTransactionManagement;

 import javax.persistence.EntityManagerFactory;
 import javax.sql.DataSource;

@Configuration
@EnableTransactionManagement

public class ConfigureWeatherDB {

    @Primary
    @Bean(name="weatherDSProps")
    @ConfigurationProperties("spring.datasource")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "weatherDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource weatherDataSource(@Qualifier("weatherDSProps") DataSourceProperties properties) {
        return properties.initializeDataSourceBuilder().build();
    }

    @Primary
    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean
    entityManagerFactory(
            EntityManagerFactoryBuilder builder,
            @Qualifier("weatherDataSource") DataSource dataSource
    ) {
        return builder
                .dataSource(dataSource)
                .packages("com.practice.example1.entity") //your Model/Entity
                .persistenceUnit("weather")
                .build();
    }

    @Primary
    @Bean(name = "transactionManager")
    @ConfigurationProperties("spring.jpa")
    public PlatformTransactionManager transactionManager(
            @Qualifier("entityManagerFactory") EntityManagerFactory
                    entityManagerFactory
    ) {
        return new JpaTransactionManager(entityManagerFactory);
    }
}


