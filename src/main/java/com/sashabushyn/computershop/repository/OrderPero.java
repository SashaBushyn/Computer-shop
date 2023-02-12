package com.sashabushyn.computershop.repository;

import com.sashabushyn.computershop.model.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderPero extends JpaRepository<Order, Long> {

}
