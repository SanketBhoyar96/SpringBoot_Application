package com.soft.repositary;

import java.util.HashMap;import org.aspectj.weaver.tools.Trace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import com.soft.model.StudentModel;

@Repository
public interface StudentRepositary extends JpaRepository<StudentModel,Integer>  {
	
	@Query(value = "select * from student_model where student_email=?1 and student_password=?2",nativeQuery = true)
	public StudentModel LoginStudentRepositary(String student_email,String student_password);

}
