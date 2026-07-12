package fixture;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Producer toward Paiements (Kafka/MQ); consumer of Base clients and caller of Paiements API. */
@RestController
@RequestMapping("/api/v1/orders")
public class IntegrationHints {

  // @FeignClient(name = "base-clients") → Base clients
  // @FeignClient(name = "paiements") → Paiements
  // KafkaTemplate.send("orders.created", ...) → consumed by Paiements
  // RabbitTemplate.convertAndSend("billing.events", ...) → Paiements
}
