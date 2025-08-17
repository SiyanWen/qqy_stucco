package org.example.microservices.OrderService.Service;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrdersByIdRepo byId;
    private final OrdersByUserRepo byUser;

    public java.util.UUID createOrder(java.util.UUID userId, String currency, java.math.BigDecimal total) {
        var orderId = java.util.UUID.randomUUID();
        var now = java.time.Instant.now();

        var obi = new OrderById();
        obi.setOrderId(orderId);
        obi.setUserId(userId);
        obi.setCreatedAt(now);
        obi.setStatus("CREATED");
        obi.setCurrency(currency);
        byId.save(obi);

        var key = new OrderByUserKey(userId, now, orderId);
        var obu = new OrderByUser();
        obu.setKey(key);
        obu.setStatus("CREATED");
        obu.setCurrency(currency);
        obu.setTotal(total);
        byUser.save(obu);

        return orderId;
    }
}

