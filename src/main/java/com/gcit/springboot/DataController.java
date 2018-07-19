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


    @RequestMapping("/data")
    public String index() {
        String sql = "SELECT AUTHORNAME FROM TBL_AUTHOR where AUTHORID = ?";
        String name = (String)jdbcTemplate.queryForObject(sql,new Object[] { 1 }, String.class);
        return name;
    }
}
