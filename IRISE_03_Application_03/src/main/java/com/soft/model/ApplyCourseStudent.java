package com.soft.model;

import java.sql.Date;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name = "stud_seq",initialValue = 1, allocationSize = 1)
public class ApplyCourseStudent {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "stud_seq")
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private Long contact;
	private String education;
	private int duration;
	private int courseId;
	private String courseName;
	private Date localDate; 
	private int fees;
	
	public ApplyCourseStudent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ApplyCourseStudent(int id, String firstName, String lastName, String email, String address, Long contact,
			String education, int duration, int courseId, String courseName, Date localDate, int fees) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.address = address;
		this.contact = contact;
		this.education = education;
		this.duration = duration;
		this.courseId = courseId;
		this.courseName = courseName;
		this.localDate = localDate;
		this.fees = fees;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
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

	public Date getLocalDate() {
		return localDate;
	}

	public void setLocalDate(Date localDate) {
		this.localDate = localDate;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "ApplyCourseStudent [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", address=" + address + ", contact=" + contact + ", education=" + education + ", duration="
				+ duration + ", courseId=" + courseId + ", courseName=" + courseName + ", localDate=" + localDate
				+ ", fees=" + fees + "]";
	}
	
	

	
}