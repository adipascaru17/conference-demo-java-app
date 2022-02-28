package com.pluralsight.conference.demo.config;


import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

@Configurable
public class PersistenceConfiguration {

    @Bean
    public DataSource dataSource(){
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.url("jdbc:mysql://localhost/conference_demo");
        return builder.build();

    }
}
