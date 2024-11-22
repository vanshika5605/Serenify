package com.db.hackathon.user_tracker.adapters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@Service
public class PostgreSQLJDBCExample {

    @Autowired
    private DataSource dataSource;
    public void checkDatabaseConnection() throws SQLException {
        System.out.println("dataSource"+dataSource);
        System.out.println("dataSource.getConnection()"+dataSource.getConnection());
        try (Connection conn = dataSource.getConnection()) {
            if (conn != null) {
                System.out.println("Connected to the database!");
                // Perform database operations here
            } else {
                System.out.println("Failed to make connection!");
            }
        }
    }
}
