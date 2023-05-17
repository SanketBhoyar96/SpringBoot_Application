package com.soft.repositary;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.soft.entity.Employee;

@Repository
public interface EmployeeRepositary extends JpaRepository<Employee, Integer> {
	
	@Query(value ="FROM Employee where empName=?1")
	public Employee getEmpNameRepositary(String empName);
	
	@Query(value ="FROM Employee where empName=?1")
	public List<Employee> getempNameByRepositaryUsingList(String empName);
	
//	=====================================SQL=========================================
	@Query(value ="select * from emp_details_sb where emp_salary=?1", nativeQuery = true)
	public List<Employee> getempSalaryByRepositary(int empSalary);
	
	//SQL QUERY
	@Query(value ="select max(emp_salary) from emp_details_sb;",nativeQuery = true)
	public int getEmpMAXSalaryBYRepositary();
//	======================================HQL==================================
	//HQL AQUERY
	@Query(value ="Select min(empSalary) from Employee")
	public int getEmpMINSalaryBYRepositary();
	
	@Query(value ="Select count(empName) from Employee")
	public int getEmpCountRepositary();
	
	//HQL
//	@Query(value ="select max(empSalary) from Employee where empSalary < (select max(empSalary) from Employee);")
//	public int getEmpSecondMAXSalaryRepositary();
	                                         
//	                                                 ORRRRR
	
	//SQL
	@Query(value ="select max(emp_salary) from emp_details_sb where emp_salary < (select max(emp_salary) from emp_details_sb);",nativeQuery = true)
	public int getEmpSecondMAXSalaryRepositary();
//	                                                    OR
//	@Query(value ="select max(emp_salary) from emp_details_sb where emp_salary < (select max(emp_salary) from emp_details_sb);")
//	public List<Employee> getEmpSecondMAXSalaryLISTRepositary();
	
	//sql
//	@Query(value ="select emp_salary from emp_details_sb where emp_salary>5000",nativeQuery = true)
//	public List<Employee> getEmpGreatherThanSalaryRepositary();
	

	    @Query(value = "from Employee where empSalary>5000")
		public List<Employee> getEmpGreatherThanSalaryRepositary();
	    
	    @Query(value ="(SELECT * FROM springboot_employee.emp_details_sb ORDER BY emp_id DESC LIMIT 5) ORDER BY emp_id ASC;", nativeQuery = true)
	    public List<Employee> Display_5_EmployeelastRepositary();
	    
//	    @Query(value ="delete from emp_details_sb where emp_Name=?1",nativeQuery = true)
//	    public void DeleteByNameRepositary(String Name);
	
	

}
