package fixture.flow;

/**
 * Data categories produced or consumed by Service commandes integrations.
 * grep: data_category ORDER_CREATED_EVENT BILLING_INVOICE_REQUEST
 */
public final class TransitDataTypes {

  public static final String REST_ORDER_API = "ORDER_PAYLOAD";
  public static final String FEIGN_CUSTOMERS = "CUSTOMER_REFERENTIAL";
  public static final String HTTP_CHARGE = "CHARGE_INSTRUCTION";
  public static final String KAFKA_ORDERS_CREATED = "ORDER_CREATED_EVENT";
  public static final String MQ_BILLING = "BILLING_INVOICE_REQUEST";

  public static final String KAFKA_PAYLOAD_FORMAT = "AVRO";
  public static final String MQ_PAYLOAD_FORMAT = "JSON";

  private TransitDataTypes() {}
}
