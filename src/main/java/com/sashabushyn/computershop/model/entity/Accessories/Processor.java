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
public class Processor extends Accessories {
    private Integer frequency;

    public Processor(Long id, String brand, String name, String description, BigDecimal price, Integer frequency) {
        super(id, brand, name, description, price);
        this.frequency = frequency;
    }
    @Builder(builderMethodName =  "ProcessorBuilder")
    public Processor(String brand, String name, String description, BigDecimal price, Integer frequency) {
        super(brand, name, description, price);
        this.frequency = frequency;
    }
}
