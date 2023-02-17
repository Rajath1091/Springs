package com.ty.springs.dto;

public class Student {

	private String name;
	private long phone;
	private String course;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student(String name, long phone, String course) {
		super();
		this.name = name;
		this.phone = phone;
		this.course = course;
	}

}
