# Service commandes (fixture)

Order orchestration service.

## Integrations (topology)

- REST API `/api/v1/orders` called by **API Gateway**.
- Uses **Base clients** referential (`@FeignClient`).
- Charges via **Paiements** HTTP API.
- Produces Kafka topic `orders.created` consumed by **Paiements**.
- Publishes AMQP messages on exchange `billing.events` for **Paiements**.

## Data transiting on flows (Data Model fixture)

| Peer | Kind | Channel | data_category |
|------|------|---------|---------------|
| Base clients | API | Feign referential | `CUSTOMER_REFERENTIAL` |
| Paiements | API | /charge | `CHARGE_INSTRUCTION` |
| Paiements | KAFKA | orders.created | `ORDER_CREATED_EVENT` |
| Paiements | MQ | billing.events | `BILLING_INVOICE_REQUEST` |
| API Gateway | API (inbound) | /orders | `ORDER_PAYLOAD` |

Constants: `fixture.flow.TransitDataTypes`. DTOs: `OrderCreatedEvent`, `BillingInvoiceRequest`.
