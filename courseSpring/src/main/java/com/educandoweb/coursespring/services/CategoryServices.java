package com.educandoweb.coursespring.services;

import com.educandoweb.coursespring.entities.Category;
import com.educandoweb.coursespring.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServices {

    @Autowired // injeção de dependência
    private CategoryRepository repository;

    public List<Category> findAll(){ // metodo que retorna todos os usuários do banco
        return repository.findAll();
    }

    public Category findById(Long id){
      Optional<Category> obj = repository.findById(id);
      return obj.get();
    }


}
