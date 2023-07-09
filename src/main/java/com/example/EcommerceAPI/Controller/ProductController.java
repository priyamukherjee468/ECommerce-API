package com.example.EcommerceAPI.Controller;

import com.example.EcommerceAPI.Model.Product;
import com.example.EcommerceAPI.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/add-product")
    public String addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return "product added successfully";
    }
    @GetMapping("/get-all-products")
    public Iterable<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @DeleteMapping("/delete-product")
    public String deleteProduct(@RequestParam Integer productId){
        productService.deleteProduct(productId);
        return "Product Deleted successfully";
    }
}
