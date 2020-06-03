package com.tanknavy.sb.thymeleaf.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tanknavy.sb.thymeleaf.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	// load data
	private  List<Employee> employees;
	
	@PostConstruct
	private void loadData() {
		Employee emp1 = new Employee(1,"alex","cheng","alex@gmail.com");
		Employee emp2 = new Employee(2,"bob","cheng","bob@gmail.com");
		Employee emp3 = new Employee(3,"carl","cheng","carl@gmail.com");
		Employee emp4 = new Employee(4,"david","cheng","david@gmail.com");
		Employee emp5 = new Employee(5,"edward","zhang","edward@gmail.com");
		
		employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
	}
	
	
	// add mapping for "/list"
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		theModel.addAttribute("employees", employees);
		return "list-employees";
	}
	
}
