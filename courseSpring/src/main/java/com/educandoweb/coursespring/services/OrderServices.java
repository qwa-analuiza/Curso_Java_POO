package com.educandoweb.coursespring.services;

import com.educandoweb.coursespring.entities.Order;
import com.educandoweb.coursespring.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServices {

    @Autowired // injeção de dependência
    private OrderRepository repository;

    public List<Order> findAll(){ // metodo que retorna todos os usuários do banco
        return repository.findAll();
    }

    public Order findById(Long id){
      Optional<Order> obj = repository.findById(id);
      return obj.get();
    }


}
