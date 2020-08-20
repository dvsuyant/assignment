package com.epam.assignment.order;

import com.epam.assignment.order.dto.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
