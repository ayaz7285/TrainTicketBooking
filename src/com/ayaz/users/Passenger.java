package com.ayaz.users;

public class Passenger {
	private String name;
	private int age;
	private String gender;
	private String contact;
	private String email;
	public Passenger(String name, int age, String gender, String contact, String email) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.contact = contact;
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getContact() {
		return contact;
	}
	public String getEmail() {
		return email;
	}
	
}
