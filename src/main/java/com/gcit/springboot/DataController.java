package com.gcit.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableWebSecurity
@RestController
@Repository("mysql")
public class DataController {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @RequestMapping("/")
    public String index() {
        String sql = "SELECT name FROM Employee where id = ?";
        String name = (String)jdbcTemplate.queryForObject(sql,new Object[] { 1 }, String.class);
        return name;
    }
}
