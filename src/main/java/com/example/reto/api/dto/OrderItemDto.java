package com.example.reto.api.dto;

public record OrderItemDto(
    String productId,
    int quantity,
    double price
) {
}