package com.epam.assignment.order;

import com.epam.assignment.order.client.OrderItemClient;
import com.epam.assignment.order.dto.Order;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

  @Autowired
  private OrderItemClient orderItemClient;

  @Autowired
  private OrderRepository repository;

  @GetMapping( value = "/order",
               produces = MediaType.APPLICATION_JSON_VALUE )
  @CrossOrigin
  @HystrixCommand( fallbackMethod = "getFallbackOrder" )
  public Order getOrder( @RequestParam String orderId ) {
    Order custOrder = repository.findById( Long.parseLong( orderId ) ).orElse( getFallbackOrder( orderId ) );
    custOrder.setItems(orderItemClient.getOrderItems( orderId ));
    return custOrder;
  }

  private Order getFallbackOrder( String orderId ) {
    //Return empty order if there is any issue
    return new Order();
  }
}
