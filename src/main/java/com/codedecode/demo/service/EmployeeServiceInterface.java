package com.codedecode.demo.service;

import com.codedecode.demo.entity.Employee;
import java.util.List;

public interface EmployeeServiceInterface {
	
	//public void addEmployee();

	public Employee addEmployee(Employee employee);

	public List<Employee> getallemployee();

	public Employee getempid(Long empID);

	public void deletebyId(Long empID);

	

}
