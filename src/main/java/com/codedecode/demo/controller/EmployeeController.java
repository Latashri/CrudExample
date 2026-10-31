package com.codedecode.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.demo.entity.Employee;
import com.codedecode.demo.repository.EmployeeCrudRepo;
import com.codedecode.demo.service.EmployeeServiceInterface;

import java.util.List;


@RestController
@RequestMapping("/code")
public class EmployeeController{
	
	//@Autowired
	//EmployeeCrudRepo repo;
	
	@Autowired
	private EmployeeServiceInterface empserviceinterface;
	
	//@GetMapping
	//public List<Employee> getAllEmployee(){
	//	System.out.println("list of employee");
		//return repo.findAll();
	//}
	
	@PostMapping("/save")
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
		Employee savedEmpployee =  empserviceinterface.addEmployee(employee);
		return new ResponseEntity<Employee>(savedEmpployee,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Employee>> getallemployee(){
		List<Employee> getall =  empserviceinterface.getallemployee();
		return new ResponseEntity<List<Employee>>(getall,HttpStatus.OK);
	}
	
	@GetMapping("/emp/{empid}")
	public ResponseEntity<Employee> getempid(@PathVariable("empid") Long empID){
	 Employee getretrived =	 empserviceinterface.getempid(empID);
	 return new ResponseEntity<Employee>(getretrived,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete1/{empid}")
	public ResponseEntity<Void> deletebyId(@PathVariable("empid") Long empID){
		empserviceinterface.deletebyId(empID);
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	
}
