package com.hassane.orderresourceserver;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class OrderController {
    
 
    @GetMapping("/orders")
    public List<Order> getOrders(){
        Order order1= new Order(1L, "product 1", "product user 1", 3, OrderStatus.NEW);
        Order order2= new Order(2L, "product 2", "product user 2", 1, OrderStatus.NEW);

       return Arrays.asList(order1,order2);
    }
}
