package com.springBoot.product.models;

import lombok.*;

import java.time.LocalDate;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Product {
    private String productId;
    private String productName;
    private String unitOfMeasure;
    private LocalDate launchDate;
}
