package com.sashabushyn.computershop.model.entity;

import com.sashabushyn.computershop.model.entity.Accessories.Graphic;
import com.sashabushyn.computershop.model.entity.Accessories.Processor;
import com.sashabushyn.computershop.model.entity.Accessories.Ram;
import com.sashabushyn.computershop.model.entity.Accessories.Storage;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Entity
@NoArgsConstructor
@Builder
public class Computer {
    private final static String SEQ_NAME = "category_seq";
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    private Long id;
    private String name;
    @OneToOne
    private Ram ram;
    @OneToOne
    private Processor processor;
    @OneToOne
    private Storage storage;
    @OneToOne
    private Graphic graphic;
    private String description;
    private BigDecimal price;
    private Integer itemQuantity;

    public Boolean decrementItemQuantity(int quantity) {
        if (itemQuantity - quantity >= 0) {
            itemQuantity -= quantity;
            return true;
        }
        return false;
    }

    public Computer(Long id, String name, Ram ram, Processor processor, Storage storage, Graphic graphic,
                    String description, BigDecimal price, Integer itemQuantity) {
        this.id = id;
        this.name = name;
        this.ram = ram;
        this.processor = processor;
        this.storage = storage;
        this.graphic = graphic;
        this.description = description;
        this.price = price;
        this.itemQuantity = itemQuantity;
    }

    public Computer(String name, Ram ram, Processor processor, Storage storage, Graphic graphic,
                    String description, BigDecimal price, Integer itemQuantity) {
        this.name = name;
        this.ram = ram;
        this.processor = processor;
        this.storage = storage;
        this.graphic = graphic;
        this.description = description;
        this.price = price;
        this.itemQuantity = itemQuantity;
    }

    public void incrementItemQuantity(int quantity) {
        itemQuantity += quantity;
    }

}
