package com.mynd.userservice.model;

import jakarta.validation.constraints.NotBlank;

public record UserRequest(
        @NotBlank String name,
        @NotBlank String phone,
        @NotBlank String email
) {}