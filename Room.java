package com.homework.ecm1410;

/**
 * This is a room, it only has a <b>code</b> and a <b>capacity</b>.
 * 
 * @author at753
 */
public class Room {

	String code;
	int capacity;

	/**
	 * This is a parameterless constructor method of room.
	 */
	public Room() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is a constructor method with parameters for room.
	 * 
	 * @param code     is the code of the room.
	 * @param capacity is the capacity of the room.
	 */
	public Room(String code, int capacity) {
		this.code = code;
		this.capacity = capacity;
	}

	/**
	 * this is the getter method for room code.
	 * 
	 * @return returns the code of a room.
	 * 
	 */
	public String getCode() {
		return code;
	}

	/**
	 * This is a setter method for room code.
	 * 
	 * @param code is the code of a room.
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * This is a getter method for room capacity.
	 * 
	 * @return returns the capacity of a room.
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * This is a setter method for room capacity.
	 * 
	 * @param capacity is tne capacity of a room.
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
