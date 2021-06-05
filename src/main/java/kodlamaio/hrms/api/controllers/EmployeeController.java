package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployeeService;
import kodlamaio.hrms.core.utilities.results.DataResult;

import kodlamaio.hrms.entities.concretes.Employee;

@RequestMapping("api/employees")
@RestController
public class EmployeeController {

	private EmployeeService employeeService;
	
	
	@Autowired
	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<Employee>> gettAll() {
		
		
		return this.employeeService.getAll();
		
	}

	
}
