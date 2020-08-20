package com.epam.assignment.order.client;

import com.epam.assignment.orderitem.dto.DeleteOrderItemRequest;
import com.epam.assignment.orderitem.dto.OrderItem;
import com.epam.assignment.orderitem.dto.UpdateOrderItemRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient( "order-item-service" )
public interface OrderItemClient {
  @GetMapping( "/orderitems" )
  List<OrderItem> getOrderItems( @RequestParam("orderId") String orderId );

  @PostMapping( value = "/orderitem",
                consumes = "application/json" )
  OrderItem updateOrderItem( @RequestBody UpdateOrderItemRequest request );

  @DeleteMapping( "/orderitem" )
  boolean deleteOrderItem( @RequestBody DeleteOrderItemRequest request );
}
