package com.springBoot.product.resource;


import com.springBoot.product.models.ProductList;
import com.springBoot.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/sortProducts")
    public ProductList SortProducts(@RequestBody ProductList products){
        return productService.Sort(products);
    }
}
