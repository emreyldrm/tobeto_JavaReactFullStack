package com.tobeto.intro;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductsController {
    private List<Product> products = new ArrayList<>();

    @GetMapping
    public List<Product> getAll(){
        return products;
    }

    @PostMapping
    public String add(@RequestBody Product product) {
        products.add(product);
        return "Eklendi";
    }
}
