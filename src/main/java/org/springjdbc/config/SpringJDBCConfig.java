package org.springjdbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springjdbc.dao.StudentDaoImpl;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "org.springjdbc.dao")
public class SpringJDBCConfig {
    @Bean(name = "ds")
    public DataSource getDataSource(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
        ds.setUsername("root");
        ds.setPassword("Suman@543");
        return ds;
    }
    @Bean(name = "jdbcTemplete")
    public JdbcTemplate getTemplate(){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(getDataSource());
        return jdbcTemplate;
    }
//    @Bean(name = "studentDao")
//    public StudentDaoImpl studentDao(){
//        StudentDaoImpl studentDao= new StudentDaoImpl();
//        studentDao.setJdbcTemplate(getTemplate());
//        return studentDao;
//    }
}
