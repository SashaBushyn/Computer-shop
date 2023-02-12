package com.sashabushyn.computershop.service.impl;

import com.sashabushyn.computershop.controller.dto.OrderDto;
import com.sashabushyn.computershop.model.Exceptions.AccessoriesException;
import com.sashabushyn.computershop.model.Exceptions.DeviceException;
import com.sashabushyn.computershop.model.Exceptions.OrderException;
import com.sashabushyn.computershop.model.enams.OrderStatus;
import com.sashabushyn.computershop.model.entity.Computer;
import com.sashabushyn.computershop.model.entity.Order;
import com.sashabushyn.computershop.repository.ComputerRepo;
import com.sashabushyn.computershop.repository.OrderPero;
import com.sashabushyn.computershop.service.TradingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TradingServiceImpl implements TradingService {
    private final OrderPero orderPero;
    private final ComputerRepo computerRepo;

    @Override
    public Order createOrder(OrderDto orderDto) {
        Computer computer = computerRepo.findById(orderDto.getComputer_id())
                .orElseThrow(() -> new DeviceException("such computer doen`t exist"));

        if (OrderStatus.valueOf(orderDto.getOrderStatus()) == OrderStatus.CLOSED) {
            tradeComputer(computer, orderDto.getQuantity());
        }

        Order order = Order.builder()
                .orderStatus(OrderStatus.valueOf(orderDto.getOrderStatus()))
                .comment(orderDto.getComment())
                .computer(computer)
                .delivery(orderDto.getDelivery())
                .deliveryAddress(orderDto.getDeliveryAddress())
                .quantity(orderDto.getQuantity())
                .sum(orderDto.getSum())
                .userName(orderDto.getUserName())
                .build();
        return orderPero.save(order);
    }

    @Override
    public Order updateOrder(OrderDto orderDto) {
        Order order = orderPero.findById(orderDto.getId())
                .orElseThrow(() -> new OrderException("such order doesn`t exist"));

        // CHECKING ORDER STATUS IN DB
        if (OrderStatus.valueOf(orderDto.getOrderStatus()) == OrderStatus.CLOSED) {
            throw new OrderException("order is closed already!");
        }

        Computer computer = computerRepo.findById(orderDto.getComputer_id())
                .orElseThrow(() -> new DeviceException("such computer doen`t exist"));

        order.setOrderStatus(OrderStatus.valueOf(orderDto.getOrderStatus()));
        order.setDelivery(orderDto.getDelivery());
        order.setComment(orderDto.getComment());
        order.setQuantity(orderDto.getQuantity());
        order.setSum(orderDto.getSum());
        if (OrderStatus.valueOf(orderDto.getOrderStatus()) == OrderStatus.CLOSED) {
            tradeComputer(computer, orderDto.getQuantity());
        }
        return orderPero.save(order);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderPero.findAll();
    }

    private void tradeComputer(Computer computer, Integer quantity) {
        if (computer.decrementItemQuantity(quantity)) {
            computerRepo.save(computer);
        } else throw new AccessoriesException("Not enough items in stock!");
    }
}
