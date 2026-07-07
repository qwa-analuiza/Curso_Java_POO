package com.educandoweb.workshopjavafcjdbc.model.services;

import com.educandoweb.workshopjavafcjdbc.model.dao.DaoFactory;
import com.educandoweb.workshopjavafcjdbc.model.dao.DepartmentDao;
import com.educandoweb.workshopjavafcjdbc.model.entities.Department;

import java.util.ArrayList;
import java.util.List;

public class DepartmentService {

    private DepartmentDao dao = DaoFactory.createDepartmentDao();

    public List<Department> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Department obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.update(obj);
        }
    }
}
