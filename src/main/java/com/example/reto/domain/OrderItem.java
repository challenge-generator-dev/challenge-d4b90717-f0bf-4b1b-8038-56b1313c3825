package com.example.reto.domain;

public class OrderItem {
    private final String productId;
    private final int quantity;
    private final double price;

    public OrderItem(String productId, int quantity, double price) {
        if (productId == null || productId.isBlank()) {
            throw new IllegalArgumentException("Product ID cannot be null or empty");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }

        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }
}