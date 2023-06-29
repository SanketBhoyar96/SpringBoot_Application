package com.soft.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="student_model")
@SequenceGenerator(name = "stud_seq",initialValue = 1, allocationSize = 1)
public class StudentModel {
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "stud_seq")
	@Id
	@Column(name = "student_Id")
	private int stud_Id;
	@Column(name = "stududent_firstName")
	private String studFirstName;
	@Column(name = "student_lastname")
	private String studLastName;
	@Column(name = "student_email")
	private String studEmail;
	@Column(name = "student_password")
	private String studPassword;
	@Column(name = "student_mobileno")
	private String studMobileNo;
	@Column(name = "student_role")
	private String role;
	@Column(name = "is_actived")
	private boolean is_Actived=true;
	@Column(name = "is_deleted")
	private boolean isDeleted;
	@Column(name = "date")
	private Date date;
	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentModel(int stud_Id, String studFirstName, String studLastName, String studEmail, String studPassword,
			String studMobileNo, String role, boolean is_Actived, boolean isDeleted, Date date) {
		super();
		this.stud_Id = stud_Id;
		this.studFirstName = studFirstName;
		this.studLastName = studLastName;
		this.studEmail = studEmail;
		this.studPassword = studPassword;
		this.studMobileNo = studMobileNo;
		this.role = role;
		this.is_Actived = is_Actived;
		this.isDeleted = isDeleted;
		this.date = date;
	}
	public int getStud_Id() {
		return stud_Id;
	}
	public void setStud_Id(int stud_Id) {
		this.stud_Id = stud_Id;
	}
	public String getStudFirstName() {
		return studFirstName;
	}
	public void setStudFirstName(String studFirstName) {
		this.studFirstName = studFirstName;
	}
	public String getStudLastName() {
		return studLastName;
	}
	public void setStudLastName(String studLastName) {
		this.studLastName = studLastName;
	}
	public String getStudEmail() {
		return studEmail;
	}
	public void setStudEmail(String studEmail) {
		this.studEmail = studEmail;
	}
	public String getStudPassword() {
		return studPassword;
	}
	public void setStudPassword(String studPassword) {
		this.studPassword = studPassword;
	}
	public String getStudMobileNo() {
		return studMobileNo;
	}
	public void setStudMobileNo(String studMobileNo) {
		this.studMobileNo = studMobileNo;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isIs_Actived() {
		return is_Actived;
	}
	public void setIs_Actived(boolean is_Actived) {
		this.is_Actived = is_Actived;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "StudentModel [stud_Id=" + stud_Id + ", studFirstName=" + studFirstName + ", studLastName="
				+ studLastName + ", studEmail=" + studEmail + ", studPassword=" + studPassword + ", studMobileNo="
				+ studMobileNo + ", role=" + role + ", is_Actived=" + is_Actived + ", isDeleted=" + isDeleted
				+ ", date=" + date + "]";
	}
	
}