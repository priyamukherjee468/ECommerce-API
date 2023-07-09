package com.example.EcommerceAPI.Repository;


import com.example.EcommerceAPI.Model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepo extends CrudRepository<Product,Integer> {
}
