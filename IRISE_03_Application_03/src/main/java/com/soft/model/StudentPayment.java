package com.soft.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
@SequenceGenerator(name="cardno",initialValue = 1,allocationSize = 11)
public class StudentPayment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator ="cardno")
	private int cardNo;
	private String cardExpiry;
	private int cvv;
	private String fullName;
	private String billingAddress;
	
	private int courseId;
	private String courseName;
	private int fees;
	public StudentPayment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public StudentPayment(int cardNo, String cardExpiry, int cvv, String fullName, String billingAddress, int courseId,
			String courseName, int fees) {
		super();
		this.cardNo = cardNo;
		this.cardExpiry = cardExpiry;
		this.cvv = cvv;
		this.fullName = fullName;
		this.billingAddress = billingAddress;
		this.courseId = courseId;
		this.courseName = courseName;
		this.fees = fees;
	}

	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public String getCardExpiry() {
		return cardExpiry;
	}
	public void setCardExpiry(String cardExpiry) {
		this.cardExpiry = cardExpiry;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getBillingAddress() {
		return billingAddress;
	}
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
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
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	
	
	
}
