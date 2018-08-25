package com.example.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.vo.Employee;

public interface EmployeeMapper {
	@Select("SELECT * FROM employee")
	public List<Employee> getAllEmployee();
}
