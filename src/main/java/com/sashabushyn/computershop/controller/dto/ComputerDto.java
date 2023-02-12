package com.sashabushyn.computershop.controller.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ComputerDto {
    private Long id;
    private String name;
    private Long ram_id;
    private Long processor_id;
    private Long storage_id;
    private Long graphic_id;
    private String description;
    private BigDecimal price;
    private Integer item_quantity;

}
