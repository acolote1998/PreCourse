package com.example.second_rest_api.model;

import java.time.LocalDateTime;

public record LiveStream(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate) {
}
