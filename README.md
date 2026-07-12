# Service commandes (fixture)

Order orchestration service.

- REST API `/api/v1/orders` called by **API Gateway**.
- Uses **Base clients** referential (`@FeignClient`).
- Charges via **Paiements** HTTP API.
- Produces Kafka topic `orders.created` consumed by **Paiements**.
- Publishes AMQP messages on exchange `billing.events` for **Paiements**.
