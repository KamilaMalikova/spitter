package com.example.dev.spitter.dao;

import com.example.dev.spitter.model.Spitter;
import org.springframework.jdbc.core.JdbcTemplate;

public interface SpitterDAO {

    void setJdbcTemplate(JdbcTemplate jdbcTemplate);

    void addSpitter(Spitter spitter);

    Spitter getSpitterById(long id);
}
