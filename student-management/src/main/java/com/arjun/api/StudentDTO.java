package com.arjun.api;

public class StudentDTO {
	private String name;
	private String country;
	private int id;
	private Long mobile;
	
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
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "StudentDTO [name=" + name + ", country=" + country + ", id=" + id + ", mobile=" + mobile + "]";
	}
	
}
