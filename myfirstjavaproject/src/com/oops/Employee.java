package com.oops;

///DTO: Data Transfer object
/// POJO:Plain Old Java object
/// Model:Data Model
public class Employee {
	
	private int eid;
	private String ename;
	private double salary;
	
	
	public void setEid(int eid) {
		this.eid=eid;
	}
	
	public int getEid() {
		return eid;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}
	public String getEname() {
		return ename;
	}
	public void setSalary(double salary) {
		this.salary=salary;
	}
	public double getSalary(){
		return salary;
	}
	

}
