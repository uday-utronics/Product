package com.springBoot.product.service;

import com.springBoot.product.models.Product;
import com.springBoot.product.models.ProductList;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {


    public ProductList Sort(ProductList products){
        List<Product> sortedProducts = products.getProductList().stream()
                .sorted(Comparator.comparing(Product::getLaunchDate).reversed())
                .sorted(Comparator.comparing(Product::getProductId).reversed())
                .collect(Collectors.toList());

        ProductList productList = new ProductList(sortedProducts);

        return productList;
    }
}
