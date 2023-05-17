package com.soft.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soft.entity.Employee;
import com.soft.exception.EmployeeNotFoundException;
import com.soft.repositary.EmployeeRepositary;

@Service
public class EmployeeServiceImp implements EmployeServices {

	@Autowired
	private EmployeeRepositary employeeRepositary;

	@Override
	public Employee savEmployeeDetails(Employee emp) {

		Employee saveEmpFromEmpServices = employeeRepositary.save(emp);

		return saveEmpFromEmpServices;
	}

	@Override
	public List<Employee> getAllempServices() {
		List<Employee> empList = employeeRepositary.findAll();
		return empList;
	}

	@Override
	public Employee findempByIdServices(int empId) {
		Employee emp = null;
		Optional<Employee> CheckempByID = null;
		try {
			CheckempByID = employeeRepositary.findById(empId);

			if (CheckempByID.isPresent()) {
				emp = CheckempByID.get();
			} else {
				System.out.println("Not Found");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return emp;
	}

	@Override
	public void deleteEmpByIdServices(int id) {

//		if (employeeRepositary.existsById(id)) {
			employeeRepositary.deleteById(id);
//		} else {
//			System.out.println("Employee User Id Not present");
//		}
	}

	@Override
	public Employee UpdateEmpServices(int id, Employee emp) {
		
		Employee em = null;

		Optional<Employee> existingemp = employeeRepositary.findById(id);
		try {	
			if (existingemp.isPresent()) {

				em = existingemp.get();

				em.setEmpName(emp.getEmpName());

				em.setEmpAddress(emp.getEmpAddress());
				em.setEmpSalary(emp.getEmpSalary());
				em.setEmpId(id);
				employeeRepositary.save(em);
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
//		
		return em;
	}
//=====================================================================
	@Override
	public Employee FindEmpNameSerivice(String empName) {
		Employee getEmpNamfromRepo = employeeRepositary.getEmpNameRepositary(empName);
		return getEmpNamfromRepo;
	}

	@Override
	public List<Employee> findempNameUsingListServices(String empName) {
		List<Employee> empListservice = employeeRepositary.getempNameByRepositaryUsingList(empName);
		return empListservice;
	}

	@Override
	public List<Employee> findempsalaryUsingList(int empSalary) {
		
		return employeeRepositary.getempSalaryByRepositary(empSalary);
	}

	@Override
	public int findempMAXSalaryServices() {
		return employeeRepositary.getEmpMAXSalaryBYRepositary();
	    
		
	}

	@Override
	public int findempMINSalaryServices() {
		
		return employeeRepositary.getEmpMINSalaryBYRepositary();
	}

	@Override
	public int findempCountServices() {
		  
		return employeeRepositary.getEmpCountRepositary();
	}

	@Override
	public int findempSecondMAXSalaryServices() {
		
		return employeeRepositary.getEmpSecondMAXSalaryRepositary();
	}
//                                   OR
//	@Override
//	public List<Employee> findempSecondMAXSalaryLISTServices() {
//		
//		return employeeRepositary.getEmpSecondMAXSalaryLISTRepositary();
//	}

	
	@Override
	public List<Employee> findSalaryGreatherThanServices() {
		 List<Employee> greatherSalaryfromREpo = employeeRepositary.getEmpGreatherThanSalaryRepositary();
		return greatherSalaryfromREpo ;
	}

	@Override
	public List<Employee> Display_5_EmployeelastServices() {
		List<Employee> list5 = employeeRepositary.Display_5_EmployeelastRepositary();
		return list5;
	}

//	@Override
//	public void DeleteByNameService(String empName) {
//	employeeRepositary.DeleteByNameRepositary(empName);
//		
//	}

}
