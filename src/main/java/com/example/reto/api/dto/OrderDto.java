package com.example.reto.api.dto;

import java.util.List;

public record OrderDto(
    String id,
    String status,
    List<OrderItemDto> items,
    String customerId,
    String createdAt
) {
}