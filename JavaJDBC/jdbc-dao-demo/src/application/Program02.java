package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;
import java.util.Scanner;

public class Program02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("TESTE 01 ----------------- FindiById");
        Department dep = departmentDao.findById(1);
        System.out.println(dep);

        System.out.println();
        System.out.println("TESTE 02 ----------------- FindAll ");
        List<Department> list = departmentDao.findAll();
        for (Department d : list) {
            System.out.println(d);
        }

        System.out.println();
        System.out.println("TESTE 03 ----------------- Insert  ");
        Department newDepartment = new Department(null, "musica");
        departmentDao.insert(newDepartment);
        System.out.println("Inserido! iNSERED! Não acredito naão acreduro nisso");

        System.out.println();
        System.out.println("TESTE 04 ----------------- Update  ");
        Department dep02 = departmentDao.findById(1);
        dep02.setName("Food");
        departmentDao.update(dep02);
        System.out.println("Update completed.");

        System.out.println();
        System.out.println("TESTE 05 ----------------- Delete  ");
        System.out.println("insira um número de id para deleção ?");
        int id = leia.nextInt();
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        leia.close();
    }
}
