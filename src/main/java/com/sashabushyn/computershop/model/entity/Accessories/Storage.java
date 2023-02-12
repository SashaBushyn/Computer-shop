package com.sashabushyn.computershop.model.entity.Accessories;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Storage extends Accessories {
    private Integer capacity;

    public Storage(Long id, String brand, String name, String description, BigDecimal price, Integer capacity) {
        super(id, brand, name, description, price);
        this.capacity = capacity;
    }
    @Builder(builderMethodName = "storageBuilder")
    public Storage(String brand, String name, String description, BigDecimal price, Integer capacity) {
        super(brand, name, description, price);
        this.capacity = capacity;
    }
}
