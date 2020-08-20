package com.epam.assignment.order.dto;

import com.epam.assignment.orderitem.dto.OrderItem;
//import lombok.Data;
//import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.*;

//@Data
//@NoArgsConstructor
@Entity
@Table( name = "cust_order" )
public class Order {
  @Id
  @GeneratedValue( strategy = GenerationType.AUTO )
  private Long id;

  private String customerName;

  private String orderDate;

  private String shippingAddress;

  @Transient
  private List<OrderItem> items;

  private BigDecimal total;

  public Long getId() {
    return id;
  }

  public void setId( Long id ) {
    this.id = id;
  }

  public String getCustomerName() {
    return customerName;
  }

  public void setCustomerName( String customerName ) {
    this.customerName = customerName;
  }

  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate( String orderDate ) {
    this.orderDate = orderDate;
  }

  public String getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress( String shippingAddress ) {
    this.shippingAddress = shippingAddress;
  }

  public List<OrderItem> getItems() {
    return items;
  }

  public void setItems( List<OrderItem> items ) {
    this.items = items;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal( BigDecimal total ) {
    this.total = total;
  }
}
