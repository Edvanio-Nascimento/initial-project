package com.edy.course.intialproject.dto;

import java.util.UUID;

public record UserResponse(

        UUID id,

        String name,

        String login,

        String email
) {
}
