package com.sashabushyn.computershop.model.entity;

import com.sashabushyn.computershop.model.enams.OrderStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "order_doc")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @CreationTimestamp
    private LocalDateTime orderDateCreation;
    @UpdateTimestamp
    private LocalDateTime orderDateUpdate;
    private String userName;
    @ManyToOne
    @JoinColumn(name = "computer_id")
    private Computer computer;
    private Integer quantity;
    private BigDecimal sum;
    private Boolean delivery;
    private String deliveryAddress;
    private String comment;
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;
}
