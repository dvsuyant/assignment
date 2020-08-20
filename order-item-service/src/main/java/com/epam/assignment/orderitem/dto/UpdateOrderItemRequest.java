package com.epam.assignment.orderitem.dto;

public class UpdateOrderItemRequest {
  private String orderId;

  private String productCode;

  private int quantity;

  public String getOrderId() {
    return orderId;
  }

  public String getProductCode() {
    return productCode;
  }

  public int getQuantity() {
    return quantity;
  }
}
