package com.db.hackathon.user_tracker.adapters.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USERS")
public class UserInfo {
    @Id
    @Column(name = "USER_ID")
    private String userId;
    @Column(name = "NAME")
    private String name;
    @Column(name = "ROLE")
    private String role;
    @Column(name = "INFO")
    private String info;
}
