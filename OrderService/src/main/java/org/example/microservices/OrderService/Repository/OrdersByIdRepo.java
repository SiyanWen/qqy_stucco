package org.example.microservices.OrderService.Repository;

public interface OrdersByIdRepo
        extends org.springframework.data.cassandra.repository.CassandraRepository<OrderById, java.util.UUID> {}