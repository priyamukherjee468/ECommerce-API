package com.example.EcommerceAPI.Service;

import com.example.EcommerceAPI.Model.Order;
import com.example.EcommerceAPI.Repository.IOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public Order placeOrder(Order order) {
        return iOrderRepo.save(order);
    }

    public Order getOrder(Integer orderId) {
        return iOrderRepo.findById(orderId).get();
    }
}
