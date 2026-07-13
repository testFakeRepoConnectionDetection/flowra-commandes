package fixture.dto;

/**
 * AMQP message on exchange billing.events / routing-key invoice.request.
 * data_category: BILLING_INVOICE_REQUEST
 */
public record BillingInvoiceRequest(String orderId, String invoiceId, double total) {}
