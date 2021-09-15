package com.basu.spring.springjdbc.employee.dao.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.basu.spring.springjdbc.employee.dao.EmployeeDao;
import com.basu.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.basu.spring.springjdbc.employee.dto.Employee;

@Component("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into Employee values(?,?,?)";

		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
		return result;
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		String sql = "update Employee set firstname=?,lastname=?,id=?";
		int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());

		return result;
	}

	@Override
	public int delete(int id) {
		String sql = "delete from employee where id=?";
		int result = jdbcTemplate.update(sql, id);

		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public Employee read(int id) {
		String sql = "select * from Employee where id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee=jdbcTemplate.queryForObject(sql, rowMapper,id);
		return employee;
	}

	@Override
	public List<Employee> read() {
		String sql = "select * from Employee";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();

		List<Employee> result = jdbcTemplate.query(sql, rowMapper);
		return result;
	}

}
