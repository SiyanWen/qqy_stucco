package org.example.microservices.OrderService.Controller;

import lombok.RequiredArgsConstructor;
import org.example.microservices.OrderService.Service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;


@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService svc;

    @PostMapping
    public Map<String,Object> create(@RequestBody CreateOrderDto dto) {
        var id = svc.createOrder(dto.userId(), dto.currency(), dto.total());
        return Map.of("orderId", id.toString(), "status", "CREATED");
    }

    public record CreateOrderDto(java.util.UUID userId, String currency, java.math.BigDecimal total) {}
}
