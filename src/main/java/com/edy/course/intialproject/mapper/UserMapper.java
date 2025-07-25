package com.edy.course.intialproject.mapper;

import com.edy.course.intialproject.dto.UserRequest;
import com.edy.course.intialproject.dto.UserResponse;
import com.edy.course.intialproject.entity.User;

public class UserMapper {

    public static User toEntity(UserRequest request) {
        var user = new User.Builder()
                .name(request.name())
                .login(request.login())
                .password(request.password())
                .email(request.email())
                .build();

        return user;
    }

    public static UserResponse toResponse(User entity) {
        return new UserResponse(
                entity.getId(),
                entity.getName(),
                entity.getLogin(),
                entity.getEmail()
        );
    }

}
