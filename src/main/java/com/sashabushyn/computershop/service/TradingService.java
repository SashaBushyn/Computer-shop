package com.sashabushyn.computershop.service;

import com.sashabushyn.computershop.controller.dto.OrderDto;
import com.sashabushyn.computershop.model.entity.Order;

import java.util.List;

public interface TradingService {

    Order createOrder(OrderDto orderDto);

    Order updateOrder(OrderDto orderDto);

    List<Order> getAllOrders();

}
