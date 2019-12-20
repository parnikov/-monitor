package com.parnikov.checker.config;

import com.parnikov.checker.dao.UserDao;
import com.parnikov.checker.dao.UserDaoImpl;
import com.parnikov.checker.service.UserService;
import com.parnikov.checker.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {"com.parnikov.checker.service", "com.parnikov.checker.dao"} )
public class SpringConfig {

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/checker?serverTimezone=UTC&useSll=false");
        dataSource.setUsername("root");
        dataSource.setPassword("12345");
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        return dataSource;
    }

}
