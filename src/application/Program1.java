package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program1 {

	public static void main(String[] args) {
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		List<Department> list = departmentDao.findAll();
		System.out.println(list);

		Department dep = departmentDao.findById(2);
		System.out.println(dep);

		Department newDepartment = new Department(null, "Tools");
		departmentDao.insert(newDepartment);
		System.out.println("Departamento inserido");

		departmentDao.deletById(3);
		System.out.println("Excluído com sucesso");

		dep = departmentDao.findById(1);
		dep.setName("JavaTest");
		departmentDao.update(dep);
		System.out.println("Departamento atualizado");

	}

}
