package com.sashabushyn.computershop.model.entity.Accessories;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
public abstract class Accessories {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String brand;
    private String name;
    private String description;
    private BigDecimal price;

    public Accessories(String brand, String name, String description, BigDecimal price) {
        this.brand = brand;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public Accessories(Long id, String brand, String name, String description, BigDecimal price) {
        this.id = id;
        this.brand = brand;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
