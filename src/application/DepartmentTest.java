package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class DepartmentTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("==== Test 1: department findById ===");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);

		System.out.println();
		
		System.out.println("==== Test 3: department findAll ===");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}

		System.out.println();
		
		System.out.println("==== Test 4: department insert ===");
		Department newDepartment = new Department(7, "Events");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId() + ", Name: " + newDepartment.getName());

		System.out.println();
		
		System.out.println("==== Test 5: seller update ===");
		dep = departmentDao.findById(6);
		dep.setName("Sports");
		departmentDao.update(dep);
		System.out.println("Update executed!");

		System.out.println();
		
		System.out.println("==== Test 6: department deleteById ===");
		System.out.println("Enter id for delete test");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Deleted!");
		
		sc.close();
		

	}

}
