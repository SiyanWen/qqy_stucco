
# Sync APIs (sample shapes)

## Identity & User (REST)

-   `POST /users` register
    
-   `POST /auth/login` → JWT
    
-   `GET /users/{id}` (profile)
    
-   `GET /users/{id}/addresses` | `POST /users/{id}/addresses`
    

## Catalog (REST)

-   `GET /items?query=&category=&page=`
    
-   `GET /items/{sku}`
    
-   Admin: `POST /items`, `PATCH /items/{sku}`
    
-   For cross-service lookups: `GET /internal/items/{sku}` (non-public)
    

## Inventory (REST)

-   `GET /availability?sku=SKU-1&qty=2` → `{isAvailable, backorderDate}`
    
-   `POST /reservations` → `{reservationId}` (idempotency-key header)
    
-   `DELETE /reservations/{id}` release
    

## Pricing (REST)

-   `POST /price/quote` body: `{lines:[{sku, qty}], userId, coupon}` → totals, discounts, tax
    

## Cart (REST)

-   `GET /carts/{userId}`
    
-   `PUT /carts/{userId}/items/{sku}` add/update qty
    
-   `DELETE /carts/{userId}/items/{sku}`
    

## Checkout/Order Orchestrator (REST)

-   `POST /checkout` body: `{userId, cartVersion, shippingAddressId, paymentMethodRef, idempotencyKey}` → returns `{orderId, clientSecret?}`
    

## Order (REST)

-   `GET /orders/{orderId}`
    
-   `GET /users/{userId}/orders?from=&to=&status=`
    

