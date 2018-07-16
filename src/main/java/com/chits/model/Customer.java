package com.chits.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="profile")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="profile_id")
	private int profileId;
	
	@Column(name="user_id")
	private String userName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="address")
	private String address;
	
	@Column(name="email_address")
	private String emailAddress;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private int gender;
	
	@Column(name="monthly_income")
	private String monthlyIncome;
	
	@Column(name="job_type")
	private String jobType;
	
	@Column(name="chit_amount")
	private String chitAmt;
	
	@Column(name="bank_name")
	private String bankName;
	
	@Column(name="bank_acct_nr")
	private String bankAcctNr;
	
	@Column(name="created_at")
	private Date createdAt = new Date();
	
	@Column(name="last_updt_dt")
	private Date lastUpdtDt = new Date();

	public int getProfileId() {
		return profileId;
	}

	public void setProfileId(int profileId) {
		this.profileId = profileId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getMonthlyIncome() {
		return monthlyIncome;
	}

	public void setMonthlyIncome(String monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getChitAmt() {
		return chitAmt;
	}

	public void setChitAmt(String chitAmt) {
		this.chitAmt = chitAmt;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankAcctNr() {
		return bankAcctNr;
	}

	public void setBankAcctNr(String bankAcctNr) {
		this.bankAcctNr = bankAcctNr;
	}
	
}
