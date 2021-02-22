package com.homework.ecm1410;

public class Room {
	String code;
	int capacity;
	
	public Room() {
		// TODO Auto-generated constructor stub
	}
	
	public Room(String code, int capacity) {
		this.code = code;
		this.capacity = capacity;
	}

	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
