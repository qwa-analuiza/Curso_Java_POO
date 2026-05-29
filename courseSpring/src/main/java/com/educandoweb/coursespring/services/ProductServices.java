package com.educandoweb.coursespring.services;

import com.educandoweb.coursespring.entities.Product;
import com.educandoweb.coursespring.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServices {

    @Autowired // injeção de dependência
    private ProductRepository repository;

    public List<Product> findAll(){ // metodo que retorna todos os usuários do banco
        return repository.findAll();
    }

    public Product findById(Long id){
      Optional<Product> obj = repository.findById(id);
      return obj.get();
    }


}
