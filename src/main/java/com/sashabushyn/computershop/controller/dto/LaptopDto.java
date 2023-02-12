package com.sashabushyn.computershop.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sashabushyn.computershop.model.enams.MatrixType;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LaptopDto implements Serializable {

    private Long id;
    @NotNull
    private String name;
    @NotNull
    private Long ram_id;
    @NotNull
    private Long processor_id;
    @NotNull
    private Long storage_id;
    @NotNull
    private Long graphic_id;
    private String description;
    @NotNull
    private BigDecimal price;
    @NotNull
    private Double Diagonal;
    @NotNull
    private MatrixType matrixType;
    private Integer item_quantity;
    @NotNull
    private Long brand_id;

}
