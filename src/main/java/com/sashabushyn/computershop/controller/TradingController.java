package com.sashabushyn.computershop.controller;

import com.sashabushyn.computershop.controller.api.TradingApi;
import com.sashabushyn.computershop.controller.dto.OrderDto;
import com.sashabushyn.computershop.model.entity.Order;
import com.sashabushyn.computershop.service.TradingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TradingController implements TradingApi {
    private final TradingService tradingService;
    @Override
    public Order createOrder(OrderDto orderDto) {
        return tradingService.createOrder(orderDto);
    }

    @Override
    public Order updateOrder(OrderDto orderDto) {
        return tradingService.updateOrder(orderDto);
    }

    @Override
    public List<Order> getAllOrders() {
        return tradingService.getAllOrders();
    }
}
