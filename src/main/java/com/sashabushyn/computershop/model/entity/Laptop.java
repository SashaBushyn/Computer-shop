package com.sashabushyn.computershop.model.entity;

import com.sashabushyn.computershop.model.enams.MatrixType;
import com.sashabushyn.computershop.model.entity.Accessories.Graphic;
import com.sashabushyn.computershop.model.entity.Accessories.Processor;
import com.sashabushyn.computershop.model.entity.Accessories.Ram;
import com.sashabushyn.computershop.model.entity.Accessories.Storage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Laptop extends Computer {
    private Double Diagonal;
    @Enumerated(EnumType.STRING)
    private MatrixType matrixType;
    @OneToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    @Builder(builderMethodName = "laptopBuilder")
    public Laptop(Long id, String name, Ram ram, Processor processor, Storage storage, Graphic graphic,
                  String description, BigDecimal price, Integer itemQuantity, Double diagonal, MatrixType matrixType, Brand brand) {
        super(id, name, ram, processor, storage, graphic, description, price, itemQuantity);
        Diagonal = diagonal;
        this.matrixType = matrixType;
        this.brand = brand;
    }

    public Laptop(String name, Ram ram, Processor processor, Storage storage, Graphic graphic, String description,
                  BigDecimal price, Integer itemQuantity, Double diagonal, MatrixType matrixType, Brand brand) {
        super(name, ram, processor, storage, graphic, description, price, itemQuantity);
        Diagonal = diagonal;
        this.matrixType = matrixType;
        this.brand = brand;
    }
}
