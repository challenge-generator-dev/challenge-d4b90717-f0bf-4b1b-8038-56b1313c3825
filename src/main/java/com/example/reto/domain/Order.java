// TODO(reto): archivo stubbeado; implementa los cuerpos.
package com.example.reto.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Order {
    private final String id;
    private String status;
    private final List<OrderItem> items;
    private final String customerId;
    private final LocalDateTime createdAt;

    public Order(String id, String status, List<OrderItem> items, String customerId, LocalDateTime createdAt) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Order ID cannot be null or empty");
        }
        if (status == null || status.isBlank()) {
            throw new IllegalArgumentException("Order status cannot be null or empty");
        }
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Order must contain at least one item");
        }
        if (customerId == null || customerId.isBlank()) {
            throw new IllegalArgumentException("Customer ID cannot be null or empty");
        }
        if (createdAt == null) {
            throw new IllegalArgumentException("Creation date cannot be null");
        }

        this.id = id;
        this.status = status;
        this.items = List.copyOf(items);
        this.customerId = customerId;
        this.createdAt = createdAt;
    }

    public static Order createNewOrder(List<OrderItem> items, String customerId) {
      throw new UnsupportedOperationException("TODO(reto): createNewOrder");
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
      throw new UnsupportedOperationException("TODO(reto): setStatus");
    }

    public List<OrderItem> getItems() {
      throw new UnsupportedOperationException("TODO(reto): getItems");
    }

    public String getCustomerId() {
        return customerId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public double calculateTotal() {
      throw new UnsupportedOperationException("TODO(reto): calculateTotal");
    }
}