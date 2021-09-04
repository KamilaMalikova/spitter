package com.example.dev.spitter.dao.imp;

import com.example.dev.spitter.dao.SpitterDAO;
import com.example.dev.spitter.model.Spitter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSpitterDAO implements SpitterDAO {
    private static final String SQL_INSERT_SPITTER =
            "insert into spitter (username, password, fullname) " +
            "values (:username, :password, :fullname)";;
    private static final String SQL_SELECT_SPITTER_BY_ID =
            "select id, username, password, fullname" +
            "from spitter where id = :id";

    private JdbcTemplate jdbcTemplate;

    @Override
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void addSpitter(Spitter spitter) {
        jdbcTemplate.update(SQL_INSERT_SPITTER,
                spitter.getUsername(),
                spitter.getPassword(),
                spitter.getFullName(),
                spitter.getEmail(),
                spitter.isUpdatedByEmail());
        spitter.setId(queryForIdentity());
    }

    @Override
    public Spitter getSpitterById(long id) {
        return jdbcTemplate.queryForObject(
                SQL_SELECT_SPITTER_BY_ID,
                (rs, i) -> {
                    Spitter spitter = new Spitter();
                    spitter.setId(rs.getInt(1));
                    spitter.setUsername(rs.getString(2));
                    spitter.setPassword(rs.getString(3));
                    spitter.setFullName(rs.getString(4));
                    return spitter;
                },
                id
        );
    }

    public int queryForIdentity() {
        //TODO()
        return 0;
    }


}
