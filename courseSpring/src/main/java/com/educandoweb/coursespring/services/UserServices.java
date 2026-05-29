package com.educandoweb.coursespring.services;

import com.educandoweb.coursespring.entities.User;
import com.educandoweb.coursespring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServices {

    @Autowired // injeção de dependência
    private UserRepository repository;

    public List<User> findAll(){ // metodo que retorna todos os usuários do banco
        return repository.findAll();
    }

    public User findById(Long id){
      Optional<User> obj = repository.findById(id);
      return obj.get();
    }


}
