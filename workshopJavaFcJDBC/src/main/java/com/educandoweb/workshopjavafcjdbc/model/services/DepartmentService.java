package com.educandoweb.workshopjavafcjdbc.model.services;

import com.educandoweb.workshopjavafcjdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    public List<Department> findAll(){
        List<Department>list = new ArrayList<>();
        list.add(new Department(1,"books"));
        list.add(new Department(2,"Computers"));
        list.add(new Department(3,"electronics"));
        return list;
    }
}
