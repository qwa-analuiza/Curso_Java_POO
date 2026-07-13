package com.educandoweb.workshopjavafcjdbc.model.services;

import com.educandoweb.workshopjavafcjdbc.model.dao.DaoFactory;
import com.educandoweb.workshopjavafcjdbc.model.dao.DepartmentDao;
import com.educandoweb.workshopjavafcjdbc.model.dao.SellerDao;
import com.educandoweb.workshopjavafcjdbc.model.entities.Department;
import com.educandoweb.workshopjavafcjdbc.model.entities.Seller;

import java.util.List;

public class SellerService {

    private SellerDao dao = DaoFactory.createSellerDao();

    public List<Seller> findAll() {
        return dao.findAll();
    }

    public void saveOrUpdate(Seller obj) {
        if (obj.getId() == null) {
            dao.insert(obj);
        } else {
            dao.Update(obj);
        }
    }

    public void remove(Seller obj){
        dao.deletById(obj.getId());
    }
}
