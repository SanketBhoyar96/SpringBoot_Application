package com.soft.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "seq_corse",initialValue = 1,allocationSize = 11)
public class StudentCourse {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_corse")
	private int courseId;
	private String courseName;
	private String duration;
	private int fees;
	public StudentCourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentCourse(int courseId, String courseName, String duration, int fees) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.fees = fees;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "StudentCourse [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration
				+ ", fees=" + fees + "]";
	}
	
	
	
}
