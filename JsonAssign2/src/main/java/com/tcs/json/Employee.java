package com.tcs.json;

public class Employee {
	private String name;
	private int age;
	private String city;
	private long phone;
	private String role;
	
	public Employee() {
		super();
	}
	public Employee(String name,int age,String city,long phone,String role) {
		this.name=name;
		this.age=age;
		this.city=city;
		this.phone=phone;
		this.role=role;

}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User[name=" + name + ", age=" + age + ", phone=" + phone + ", role=" + role + "]";
	}
}
