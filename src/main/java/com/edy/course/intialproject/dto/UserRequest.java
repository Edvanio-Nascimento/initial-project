package com.edy.course.intialproject.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserRequest(

        @NotBlank(message = "O campo nome não pode ser nulo")
        @Size(min = 5, max = 70, message = "O campo nome deve conter no mínimo 5 e máximo 70 caracteres")
        String name,

        @NotBlank(message = "O campo login não pode ser nulo")
        @Size(min = 5, max = 20, message = "O campo login deve conter no mínimo 5 e máximo 20 caracteres")
        String login,

        @NotBlank(message = "O campo senha não pode ser nulo")
        @Size(min = 5, max = 20, message = "O campo senha deve conter no mínimo 5 e máximo 20 caracteres")
        String password,

        @NotBlank(message = "O campo email não pode ser nulo")
        @Size(min = 5, max = 30, message = "O campo email deve conter no mínimo 5 e máximo 20 caracteres")
        @Email(message = "O campo email deve ser válido")
        String email
) {
}
