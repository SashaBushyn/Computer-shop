package com.sashabushyn.computershop.controller.api;

import com.sashabushyn.computershop.controller.dto.OrderDto;
import com.sashabushyn.computershop.model.entity.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/trade")
public interface TradingApi {

    @PutMapping("/order")
    @ResponseStatus(HttpStatus.CREATED)
    Order createOrder(@RequestBody OrderDto orderDto);

    @PostMapping("/order")
    @ResponseStatus(HttpStatus.OK)
    Order updateOrder(@RequestBody OrderDto orderDto);

    @GetMapping("/order")
    @ResponseStatus(HttpStatus.OK)
    List<Order> getAllOrders();


}
