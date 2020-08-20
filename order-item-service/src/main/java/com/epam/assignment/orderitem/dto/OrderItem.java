package com.epam.assignment.orderitem.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//@Data
//@NoArgsConstructor
@Entity
@Table( name = "cust_order_item" )
@IdClass( OrderItem.OrderItemId.class)
public class OrderItem implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonIgnore
  @Id
  private Long orderId;
  @Id
  private String productCode;
  private String productName;
  private int quantity;

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode( String productCode ) {
    this.productCode = productCode;
  }

  public String getProductName() {
    return productName;
  }

  public void setProductName( String productName ) {
    this.productName = productName;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity( int quantity ) {
    this.quantity = quantity;
  }

  public static class OrderItemId implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long orderId;
    private String productCode;

    public OrderItemId(){}

    public OrderItemId(Long orderId, String productCode){
      this.orderId = orderId;
      this.productCode = productCode;
    }


    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      OrderItemId orderItemId = (OrderItemId) o;
      return orderId.equals(orderItemId.orderId) &&
          productCode.equals(orderItemId.productCode);
    }

    @Override
    public int hashCode() {
      return Objects.hash(orderId, productCode);
    }
  }
}
