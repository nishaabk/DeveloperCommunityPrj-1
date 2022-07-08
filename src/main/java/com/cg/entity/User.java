package com.cg.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class User {
	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int userId;
	 @Column(name="userpassword")
	 private String password;
	 @Column(name="userrole")
      private String userrole;
	 public User() {}


	public User(String password, String role, int userId) {
		super();
		this.userId = userId;
		this.password = password;
		this.userrole = role;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
	/*public void setUserId(int userId) {
		this.userId = userId;
	}*/
	}


	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return userrole;
	}
	public void setRole(String role) {
		this.userrole = role;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", role=" + userrole + "]";
	}
	
}
