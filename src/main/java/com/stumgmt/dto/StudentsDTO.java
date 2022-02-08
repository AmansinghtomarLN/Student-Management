package com.stumgmt.dto;

public class StudentsDTO {

	private int id;
	private String name = "Aman";
	private long mobile;
	private String country;
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
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "StudentsDTO [id=" + id + ", name=" + name + ", mobile=" + mobile + ", country=" + country + "]";
	}
}
