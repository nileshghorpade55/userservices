package com.mynd.userservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mynd.userservice.model.Order;
import com.mynd.userservice.model.User;
import com.mynd.userservice.repository.OrderRepository;
import com.mynd.userservice.repository.UserServiceRepository;

import jakarta.transaction.Transactional;

@Service
public class OrderServiceImpl {

    @Autowired
    private UserServiceRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Transactional
    public Order bookOrder(int userId, Order order) {

        User user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        order.setUser(user);

        return orderRepository.save(order);
    }
}