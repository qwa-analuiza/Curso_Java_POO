package com.educandoweb.workshopjavafcjdbc.model.dao;
import com.educandoweb.workshopjavafcjdbc.model.entities.Department;
import com.educandoweb.workshopjavafcjdbc.model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void Update(Seller obj);
    void deletById(Integer id);
    Seller findById(Integer id);
    List<Seller> findByDepartment(Department department);
    List<Seller> findAll();
}
