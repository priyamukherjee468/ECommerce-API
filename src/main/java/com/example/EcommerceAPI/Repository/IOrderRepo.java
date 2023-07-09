package com.example.EcommerceAPI.Repository;


import com.example.EcommerceAPI.Model.Order;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepo extends CrudRepository<Order,Integer> {

}
