package com.codedecode.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedecode.demo.entity.Employee;
import com.codedecode.demo.repository.EmployeeCrudRepo;

@Service
public class EmployeeSevice implements EmployeeServiceInterface{

	@Autowired
	private EmployeeCrudRepo crudrepo;

	@Override
	public Employee addEmployee(Employee employee) {
		Employee savedemploye = crudrepo.save(employee);
		return savedemploye;
	}

	@Override
	public List<Employee> getallemployee(){
		return crudrepo.findAll();
	}

	@Override
	public Employee getempid(Long empID) {
		return crudrepo.findById(empID).get();
	}

	@Override
	public void deletebyId(Long empID) {
		crudrepo.deleteById(empID);
		
	}

}
