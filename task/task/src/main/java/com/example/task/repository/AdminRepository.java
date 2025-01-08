package com.example.task.repository;

import com.example.task.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<User,Long> {
    User findByEmail(String email);
}
