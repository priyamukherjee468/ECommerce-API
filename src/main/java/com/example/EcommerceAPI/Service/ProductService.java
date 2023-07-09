package com.example.EcommerceAPI.Service;

import com.example.EcommerceAPI.Model.Product;
import com.example.EcommerceAPI.Repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public Product  addProduct(Product product) {
        return iProductRepo.save(product);
    }

       public Iterable<Product> getAllProducts() {
        return iProductRepo.findAll();
    }

    public void deleteProduct(Integer productId) {
         iProductRepo.deleteById(productId);
    }
}
