package com.czj.service;

import java.util.List;

import com.czj.bean.Employee;

public interface EmployeeService {

	public List<Employee> findAllEmployee();
	
	public void saveEmployee(Employee employee);
	
	public boolean checkSameEmployee(String empName);
	
	public Employee getEmployee(Integer id);
	
	public void updateEmployee(Employee employee);
	
	public void deleteEmployee(Integer empId);
	
	public void deleteBatch(List<Integer> ids);
}
