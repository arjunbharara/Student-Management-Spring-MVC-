package com.arjun.api;

public class Student {
 private int id;
 private String name;
 private String country;
 private Long mobile;
 
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}

public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", country=" + country + ", mobile=" + mobile + "]";
}
 
}
