package com.ty.springs.dto;

public class School {

	private String name;
	private long fees;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public School(String name, long fees, String address) {
		this.name = name;
		this.fees = fees;
		this.address = address;
	}

}
