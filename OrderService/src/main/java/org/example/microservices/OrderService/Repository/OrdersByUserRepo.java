package org.example.microservices.OrderService.Repository;

public interface OrdersByUserRepo
        extends org.springframework.data.cassandra.repository.CassandraRepository<OrderByUser, OrderByUserKey> {

    List<OrderByUser> findByKeyUserId(java.util.UUID userId); // auto-sorted by clustering
}
