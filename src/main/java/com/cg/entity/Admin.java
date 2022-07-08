package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer adminId;
  @Column
  private String adminFirstName;
  @Column
  private String adminLastName;
  @Column
  private String adminPassword;
  @Column
  private String adminEmailId;
  
  public Admin() {}
public Admin(Integer adminId, String adminFirstName, String adminLastName, String adminPassword, String adminEmailId) {
	super();
	this.adminId = adminId;
	this.adminFirstName = adminFirstName;
	this.adminLastName = adminLastName;
	this.adminPassword = adminPassword;
	this.adminEmailId = adminEmailId;
}


public Integer getAdminId() {
	return adminId;
}
public void setAdminId(Integer adminId) {
	this.adminId = adminId;
}
public String getAdminFirstName() {
	return adminFirstName;
}
public void setAdminFirstName(String adminFirstName) {
	this.adminFirstName = adminFirstName;
}
public String getAdminLastName() {
	return adminLastName;
}
public void setAdminLastName(String adminLastName) {
	this.adminLastName = adminLastName;
}
public String getAdminPassword() {
	return adminPassword;
}
public void setAdminPassword(String adminPassword) {
	this.adminPassword = adminPassword;
}
public String getAdminEmailId() {
	return adminEmailId;
}
public void setAdminEmailId(String adminEmailId) {
	this.adminEmailId = adminEmailId;
}


@Override
public String toString() {
	return "Admin [adminId=" + adminId + ", adminFirstName=" + adminFirstName + ", adminLastName=" + adminLastName
			+ ", adminPassword=" + adminPassword + ", adminEmailId=" + adminEmailId + "]";
}
  
}
