package com.sashabushyn.computershop.controller.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDto {
    private Long id;
    @NotNull
    private String userName;
    @NotNull
    private Long computer_id;
    @NotNull
    private Integer quantity;

    private BigDecimal sum;
    private Boolean delivery;
    private String deliveryAddress;
    private String comment;
    //@NotNull
    private String orderStatus;
}
