package org.example.microservices.OrderService.Entity;

import org.springframework.data.cassandra.core.mapping.Table;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import java.util.UUID;
import java.time.Instant;

@Table("orders_by_id")
public class OrderById {
    @PrimaryKey private UUID orderId;
    private UUID userId;
    private Instant createdAt;
    private String status;
    private String currency;
    // you can map 'items' later or store them as JSON/text if you prefer

    // Constructors
    public OrderById() {}

    public OrderById(UUID orderId, UUID userId, Instant createdAt, String status, String currency) {
        this.orderId = orderId;
        this.userId = userId;
        this.createdAt = createdAt;
        this.status = status;
        this.currency = currency;
    }

    // Getters and Setters
    public UUID getOrderId() {
        return orderId;
    }

    public void setOrderId(UUID orderId) {
        this.orderId = orderId;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
