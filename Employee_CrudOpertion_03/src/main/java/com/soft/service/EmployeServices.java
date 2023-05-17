package com.soft.service;

import java.util.List;

import com.soft.entity.Employee;

public interface EmployeServices {
	
	
	public Employee savEmployeeDetails(Employee emp);
	public List<Employee> getAllempServices();
	public Employee findempByIdServices(int empId);
	public void deleteEmpByIdServices(int id);
	
	 public Employee UpdateEmpServices(int id,Employee emp);
	 
	 public Employee FindEmpNameSerivice(String empName);
	 
	 public List<Employee> findempNameUsingListServices(String empName);
	 
	 public List<Employee> findempsalaryUsingList(int empSalary);
	 
	 public int findempMAXSalaryServices();
	 
	 public int findempMINSalaryServices();
	 
	 public int findempCountServices();
	 
	 public int findempSecondMAXSalaryServices();
//	                          OR
//	 public List<Employee> findempSecondMAXSalaryLISTServices();
	 
	 public List<Employee> findSalaryGreatherThanServices();
	 
//	 public void DeleteByNameService(String empName);
	 
	 public List<Employee> Display_5_EmployeelastServices();
	 
	 

}
