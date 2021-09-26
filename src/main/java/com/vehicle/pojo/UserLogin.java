package com.vehicle.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UserLoginDet")
public class UserLogin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String emailId;
	private String FullName;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserLogin [id=" + id + ", emailId=" + emailId + ", FullName=" + FullName + ", password=" + password
				+ "]";
	}
	public UserLogin(int id, String emailId, String fullName, String password) {
		super();
		this.id = id;
		this.emailId = emailId;
		FullName = fullName;
		this.password = password;
	}
	public UserLogin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
