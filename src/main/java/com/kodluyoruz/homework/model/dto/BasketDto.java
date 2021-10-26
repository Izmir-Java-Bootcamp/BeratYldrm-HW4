package com.kodluyoruz.homework.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BasketDto {
    private Integer id;
    private Integer quantity;
    private Integer userId;
    private Integer productId;
}
