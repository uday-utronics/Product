package com.springBoot.product.models;

import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductList {

    private List<Product> productList;
}
