| Service                         | Core Responsibilities                                                | DB                                             |
| ------------------------------- | -------------------------------------------------------------------- | ---------------------------------------------- |
| **API Gateway / Edge**          | Single entry, auth, routing, rate limiting, request/response mapping | n/a                                            |
| **Identity & User**             | Accounts, auth (JWT/OIDC), profiles, addresses, preferences          | PostgreSQL/MySQL                               |
| **Catalog, Inventory**                     | Item master, rich metadata, categories, images. Stock by warehouse, reservations, availability checks                       | MongoDB  (or Cassandra if very high scale)                                      |
| **Order, Pricing, Cart, Checkout/Order Orchestrator**                       | Order records, status timeline, user order history                   | Cassandra                                      |
