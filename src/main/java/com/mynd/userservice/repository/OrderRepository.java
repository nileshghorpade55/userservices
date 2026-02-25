package com.mynd.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mynd.userservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
