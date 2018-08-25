package com.example.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.mappers.EmployeeMapper;
import com.example.vo.Employee;

@Controller
@MapperScan("com.example.mappers")
public class MainCntlr {
	
	@Autowired
	EmployeeMapper employeeMapper;

	@RequestMapping("/")
	private String index() {
		System.out.println("index called");
		return "index";
	}
	
	@RequestMapping("/login")
	private String login() {
		System.out.println("login called");
		return "login";
	}
	
	@RequestMapping("/doLogin")
	@ResponseBody
	private String doLogin(@RequestBody Map<String, String> map) {
		System.out.println(map);
		List<Employee> list = employeeMapper.getAllEmployee();
		System.out.println(list);
		return "success";
	}
}
