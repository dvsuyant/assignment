package com.epam.assignment.orderitem.dto;

public class DeleteOrderItemRequest {
  private String orderId;

  private String productCode;

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId( String orderId ) {
    this.orderId = orderId;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode( String productCode ) {
    this.productCode = productCode;
  }
}
