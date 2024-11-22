package com.db.hackathon.user_tracker.adapters.repositories;

import com.db.hackathon.user_tracker.adapters.models.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, String> {

    public UserInfo findByUserId(String userId);

    public List<UserInfo> findByUserIdIn(List<String> userIds);
}
