package com.db.hackathon.user_tracker.adapters;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource getDataSource() {
        HikariConfig dataSource = new HikariConfig();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setJdbcUrl(String.format("jdbc:postgresql:///%s", "postgres"));
        dataSource.setUsername("postgres");
        dataSource.setPassword("Mind-Menders");
        dataSource.addDataSourceProperty("socketFactory", "com.google.cloud.sql.postgres.SocketFactory");
        dataSource.addDataSourceProperty("cloudSqlInstance", "hack-team-mind-menders:us-central1:postgres-database");
        dataSource.addDataSourceProperty("ipTypes", "PUBLIC,PRIVATE");
        dataSource.addDataSourceProperty("sslmode", "disable");
        return new HikariDataSource(dataSource);
    }
}