package com.educandoweb.coursespring.repositories;

import com.educandoweb.coursespring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
