package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Producer toward Paiements (Kafka/MQ); consumer of Base clients and caller of Paiements API.
 *
 * <p>data_category per flow — see fixture.flow.TransitDataTypes:
 * CUSTOMER_REFERENTIAL, CHARGE_INSTRUCTION, ORDER_CREATED_EVENT, BILLING_INVOICE_REQUEST.
 */
@RestController
@RequestMapping("/api/v1/orders")
public class IntegrationHints {

  // @FeignClient(name = "base-clients") → data_category CUSTOMER_REFERENTIAL
  // HTTP paiements/charge → data_category CHARGE_INSTRUCTION
  // KafkaTemplate.send("orders.created", OrderCreatedEvent) → ORDER_CREATED_EVENT
  // RabbitTemplate billing.events → BILLING_INVOICE_REQUEST
}
