package com.timbuchalka.springdemo.domain;

public class Organization {
	
	private int id;
	private String companyName;
	private int yearOfIncorporation;
	private String postalCode;
	private int employeeCount;
	private String slogan;
	
	public Organization() {
		
	}
	
	public Organization(String companyName, int yearOfIncorporation, String postalCode, int employeeCount,
			String slogan) {
		super();
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		this.postalCode = postalCode;
		this.employeeCount = employeeCount;
		this.slogan = slogan;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public int getYearOfIncorporation() {
		return yearOfIncorporation;
	}
	
	public void setYearOfIncorporation(int yearOfIncorporation) {
		this.yearOfIncorporation = yearOfIncorporation;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public int getEmployeeCount() {
		return employeeCount;
	}
	
	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
	public String getSlogan() {
		return slogan;
	}
	
	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String toString() {
		return "[Company Name: " + getCompanyName() + " | Year Started: " + getYearOfIncorporation() + " | Slogan: " + getSlogan() + "]";
	}
	
}
