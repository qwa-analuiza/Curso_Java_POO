package model.dao;

import model.entities.Department;

import java.util.List;

public interface DepartmentDao {

    void insert(Department obj);
    void deleteById(Integer id);
    void update(Department obj);
    Department findById(Integer id);
    List<Department> findAll();
}