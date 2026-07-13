package com.educandoweb.coursespring.repositories;

import com.educandoweb.coursespring.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}