package com.example.EcommerceAPI.Controller;

import com.example.EcommerceAPI.Model.Order;
import com.example.EcommerceAPI.Service.OrderService;
import com.example.EcommerceAPI.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("place-order")
    public Order placeOrder(@RequestBody Order order ){
        return orderService.placeOrder(order);

    }
    @GetMapping("/get-order")
    public Order getOrder(@RequestParam Integer orderId){
        return orderService.getOrder(orderId);
    }
}
