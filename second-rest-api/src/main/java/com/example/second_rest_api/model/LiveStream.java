package com.example.second_rest_api.model;

import jakarta.validation.constraints.NotEmpty;

import java.time.LocalDateTime;

public record LiveStream(
        String id,
        @NotEmpty String title,
        String description,
        String url,
        LocalDateTime startDate,
        LocalDateTime endDate
) {
}
