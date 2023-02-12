package com.sashabushyn.computershop.model.entity.Accessories;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ram extends Accessories {
    private Integer size;

    public Ram(Long id, String brand, String name, String description, BigDecimal price, Integer size) {
        super(id, brand, name, description, price);
        this.size = size;
    }
    @Builder(builderMethodName = "RamBuilder")
    public Ram(String brand, String name, String description, BigDecimal price, Integer size) {
        super(brand, name, description, price);
        this.size = size;
    }
}
