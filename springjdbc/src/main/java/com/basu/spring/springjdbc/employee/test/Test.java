package com.basu.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.basu.spring.springjdbc.employee.dao.EmployeeDao;
import com.basu.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/basu/spring/springjdbc/employee/test/config.xml");
		EmployeeDao dao=(EmployeeDao) context.getBean("employeeDao");
//		Employee employee = new Employee();
//		employee.setId(4);
//		employee.setFirstName("javed");
//		employee.setLastName("roma");
//		int result=dao.create(employee);
//		int result = dao.update(employee);
//		int result = dao.delete(1);
//		Employee result = dao.read(2);
		java.util.List<Employee> result =dao.read();
		System.out.println("Employee record are: "+result);
	}

}
