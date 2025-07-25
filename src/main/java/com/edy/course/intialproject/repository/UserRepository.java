package com.edy.course.intialproject.repository;

import com.edy.course.intialproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
}
