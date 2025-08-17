package org.example.microservices.OrderService.Entity;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("orders_by_user")
public class OrderByUser {
    @PrimaryKey
    private OrderByUserKey key;
    private String status;
    private java.math.BigDecimal total;
    private String currency;
    // getters/setters/ctors...
}
