package com.example.controller;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	private static final Logger logger = LoggerFactory.getLogger(MainCntlr.class);
	
	@Autowired
	EmployeeMapper employeeMapper;
	
	@RequestMapping("/")
	private String index() {
		logger.info("indexed called");
		return "index";
	}
	
	@RequestMapping("/login")
	private String login() {
		logger.info("login called");
		return "login";
	}
	
	@RequestMapping("/doLogin")
	@ResponseBody
	private String doLogin(@RequestBody Map<String, String> map) {
		logger.info("cred "+map);
		List<Employee> list = employeeMapper.getAllEmployee();
		logger.info("list "+list);
		return "success";
	}
}
