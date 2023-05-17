package com.soft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.soft.entity.Employee;
import com.soft.exception.EmployeeNotDelete;
import com.soft.exception.EmployeeNotFoundException;
import com.soft.service.EmployeServices;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeServices employeServices;
	
	@PostMapping("/saveEmp")
	public Employee saveEmployee(@RequestBody Employee emp) {
		
		Employee saveEmp = employeServices.savEmployeeDetails(emp);
		
		return saveEmp;
	}
	
	@GetMapping("/getAllemp")
	public List<Employee> getAllemp(){
		
		List<Employee> emplist = employeServices.getAllempServices();
		return emplist;
	}
	
	@GetMapping("/findEmpById")
	public Employee getEmployById(@RequestParam int id) {
		
		Employee emp = employeServices.findempByIdServices(id);
		if(emp != null) {
			return emp;
		}else {
			throw new EmployeeNotFoundException("Employee Not Found Exception this ID");
		}
		
//		return emp;
	}
//	============================================================================================================
	@GetMapping("/findEmpByIdPathVariable/{id}")
	public Employee getEmployByIdPathVariable(@PathVariable int id) {
		
		Employee emp = employeServices.findempByIdServices(id);
		
		
		
		return emp;
	}
	
	
	@GetMapping("/deleteById/{id}")
	public void deleteByIdpath(@PathVariable int id) {
//		employeServices.deleteEmpByIdServices(id);
		
//		if(employeServices != null) {
			employeServices.deleteEmpByIdServices(id);
//		}else {
//			throw new EmployeeNotDelete("Employee Not Deleted Successfully..");
//		}
	}
	
	@PostMapping("/getemp")
	public Employee UpdateEmpRecord(@RequestParam int id, @RequestBody Employee emp) {
		
		Employee Updateemp= employeServices.UpdateEmpServices(id, emp);
		return Updateemp;
		
	}
	
//	==========================singleNamefind===================================
	@GetMapping("/findEmpName")
	public Employee findEmpByName(@RequestParam String empName) {
		Employee getemname = employeServices.FindEmpNameSerivice(empName);
		return getemname;
	}
//	===============================DuplicateName Find usingList=================================
	@GetMapping("/findEmpNameList")
	public List<Employee> findempByNameUsingList(@RequestParam String empName){
		   List<Employee> empList = employeServices.findempNameUsingListServices(empName);
		return empList;
		
	}
//	======================================empSalaryFind========================================
	
	@GetMapping("/findEmpSalaryList")
	public List<Employee> findEmpSalary(@RequestParam int empSalary){
		List<Employee> salaryList= employeServices.findempsalaryUsingList(empSalary);
		
		return salaryList;
		
	}
//	======================================maxSalaryFind===================================================
	
	@GetMapping("/findmaxSalary")
	public int findempMAXSalary(){
		return employeServices.findempMAXSalaryServices();	
	}
//	===========================================MINSalary==================================================
	@GetMapping("/findminSalary")
	public int findempMINSalary(){
		return employeServices.findempMINSalaryServices();	
}
//	===========================================CountEmployee==================================================
	@GetMapping("/findEmpCount")
	public int findempCount() {
		return employeServices.findempCountServices();
	}
//	=============================================SecondMaxSalary===========================================================
	@GetMapping("/findSecondMAXSalary")
	public int findEmpSecondMAXSalary() {
		return employeServices.findempSecondMAXSalaryServices();
		
	}
//	=========================================orUsing list SecondMaxSalary=====================================================
//	@GetMapping("/findSecondMAXSalaryLIST")
//	public List<Employee> findEmpSecondMAXSalaryUsingList() {
//		    List<Employee> SecondempMAXSalarylIST = employeServices.findempSecondMAXSalaryLISTServices();
//		return SecondempMAXSalarylIST;
//		
//	}
	
//	================================================= find list of employee whoseose salary >50000================================================================
	
	@GetMapping("/findSalaryGreather")
	public List<Employee> findListgreatherThanSalary(){
		List<Employee> greatherThanSalaryList = employeServices.findSalaryGreatherThanServices();
		return greatherThanSalaryList;
		
	}
	
//	@GetMapping("/deleteByName")
//	public void DeleteByName(@RequestParam String empName){
//		
//		employeServices.DeleteByNameService(empName);;
//	} 
	
	@GetMapping("/list5Display")
	public List<Employee> Display_5_Employeelast(){
		List<Employee> list5emp= employeServices.Display_5_EmployeelastServices();
		return list5emp;
		
	}
	
}

