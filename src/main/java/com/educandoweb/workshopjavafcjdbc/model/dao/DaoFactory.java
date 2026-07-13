 package com.educandoweb.workshopjavafcjdbc.model.dao;

import com.educandoweb.workshopjavafcjdbc.db.DB;
import com.educandoweb.workshopjavafcjdbc.model.dao.impl.DepartmentDaoJDBC;
import com.educandoweb.workshopjavafcjdbc.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }

    public static  DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
