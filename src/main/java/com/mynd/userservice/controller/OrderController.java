package com.mynd.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mynd.userservice.model.Order;
import com.mynd.userservice.service.OrderServiceImpl;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @PostMapping("/book/{userId}")
    public ResponseEntity<Order> bookOrder(
            @PathVariable int userId,
            @RequestBody Order order) {

        return ResponseEntity.ok(orderService.bookOrder(userId, order));
    }
}