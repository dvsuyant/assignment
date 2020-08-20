package com.epam.assignment.orderitem;

import com.epam.assignment.orderitem.dto.OrderItem;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderItemRepository extends CrudRepository<OrderItem, OrderItem.OrderItemId> {
  List<OrderItem> findByOrderId( Long orderId);
}
