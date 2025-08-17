package org.example.microservices.OrderService.Entity;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;

@PrimaryKeyClass
public class OrderByUserKey {
    @PrimaryKeyColumn(name = "user_id", type = PrimaryKeyType.PARTITIONED)
    private java.util.UUID userId;

    @PrimaryKeyColumn(name = "created_at", type = PrimaryKeyType.CLUSTERED, ordinal = 0)
    private java.time.Instant createdAt;

    @PrimaryKeyColumn(name = "order_id", type = PrimaryKeyType.CLUSTERED, ordinal = 1)
    private java.util.UUID orderId;
    // getters/setters/ctors...
}
