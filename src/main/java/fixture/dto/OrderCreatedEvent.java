package fixture.dto;

/**
 * Avro/Kafka envelope published on topic orders.created toward Paiements.
 * data_category: ORDER_CREATED_EVENT
 */
public record OrderCreatedEvent(String orderId, String amount, String currency) {}
