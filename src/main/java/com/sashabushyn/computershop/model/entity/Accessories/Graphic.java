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
public class Graphic extends Accessories {
    private Integer memory;

    public Graphic(Long id, String brand, String name, String description, BigDecimal price, Integer memory) {
        super(id, brand, name, description, price);
        this.memory = memory;
    }
    @Builder(builderMethodName = "graphicBuilder")
    public Graphic(String brand, String name, String description, BigDecimal price, Integer memory) {
        super(brand, name, description, price);
        this.memory = memory;
    }
}
