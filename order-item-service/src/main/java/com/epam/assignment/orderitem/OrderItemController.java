package com.epam.assignment.orderitem;

import com.epam.assignment.orderitem.dto.DeleteOrderItemRequest;
import com.epam.assignment.orderitem.dto.OrderItem;
import com.epam.assignment.orderitem.dto.UpdateOrderItemRequest;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderItemController {

  @Autowired
  private OrderItemRepository repository;

  @GetMapping( value = "/orderitems",
               produces = MediaType.APPLICATION_JSON_VALUE )
  @HystrixCommand( fallbackMethod = "getFallbackOrderItems" )
  List<OrderItem> getOrderItems( String orderId ) {
    return repository.findByOrderId( Long.parseLong( orderId ) );
  }

  private List<OrderItem> getFallbackOrderItems( String orderId ) {
    //Return empty order item list if there is any issue
    return new ArrayList<>();
  }

  @PostMapping( value = "/orderitem",
                consumes = "application/json" )
  OrderItem updateOrderItem( @RequestBody UpdateOrderItemRequest request ) {
    return null;
  }

  @DeleteMapping( "/orderitem" )
  boolean deleteOrderItem( @RequestBody DeleteOrderItemRequest request ) {
    return true;
  }
}
