package model.dao;
import model.entities.Department;
import model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller obj);
    void Update(Seller obj);
    void deletById(Integer id);
    Seller findById(Integer id);
    List<Seller> findBtDepartment(Department department);
    List<Seller> findAll();
}
