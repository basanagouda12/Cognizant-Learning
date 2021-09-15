package com.cts.springcore.employeedetails;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cts/springcore/source/config.xml");
		ctx.getBean("emp");
		Employee emp = (Employee) ctx.getBean("emp");
		System.out.println("Employee ID: " + emp.getId());
		System.out.println("Employee Name: " + emp.getEmployeeName());
		System.out.println("Employee Salary: " + emp.getSalary());
		System.out.println("Employee Designation: " + emp.getDesignation());

	}

}
