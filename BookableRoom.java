package com.homework.ecm1410;

/**
 * This class is a room with a date and a time. It also contains the occupancy
 * and status of the room at that time.
 * 
 * @author at753
 */
public class BookableRoom {
	private int occupancy;
	private String status = "";
	private String date;
	private String time;
	private Room room;

	/**
	 * This is a getter method for room field.
	 * 
	 * @return returns a room object.
	 */
	public Room getRoom() {
		return room;
	}

	/**
	 * This is a getter method for status field. It calculates the status.
	 * 
	 * @return returns the status.
	 */
	public String getStatus() {
		if (this.occupancy == 0) {
			status = "EMPTY";
		} else if (this.occupancy == this.getRoom().capacity) {
			status = "FULL";
		} else {
			status = "AVAILABLE";
		}
		return status;
	}

	/**
	 * This is a constructor method with parameters for bookable rooms.
	 * 
	 * @param room is the room object of this slot.
	 * @param date is the date of this slot.
	 * @param time is the time of this slot.
	 */
	public BookableRoom(Room room, String date, String time) {
		this.room = room;
		this.date = date;
		this.time = time;
		this.occupancy = 0;
	}

	/**
	 * This is a parameterless constructor method for bookable rooms.
	 */
	public BookableRoom() {

	}

	/**
	 * This is a setter method for the status field of a bookable room.
	 * 
	 * @param status is the status of this slot.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This is a setter method for the room field of a bookable room.
	 * 
	 * @param room is the room object of this slot.
	 */
	public void setRoom(Room room) {
		this.room = room;
	}

	/**
	 * This is a getter method for the occupancy field of a bookable room.
	 * 
	 * @return returns the occupancy of this slot.
	 */
	public int getOccupancy() {
		return occupancy;
	}

	/**
	 * This is a setter method for the occupancy field of a bookable room. It also
	 * calculates the status.
	 * 
	 * @param newOccupancy is the occupancy after a booking is added.
	 */
	public void setOccupancy(int newOccupancy) {
		this.occupancy = newOccupancy;
		if (this.occupancy == 0) {
			this.status = "EMPTY";
		} else if (this.occupancy == this.getRoom().capacity) {
			this.status = "FULL";
		} else {
			this.status = "AVAILABLE";
		}
	}

	/**
	 * This is a getter method for the date of this slot.
	 * 
	 * @return returns the date of a slot.
	 */
	public String getDate() {
		return date;
	}

	/**
	 * This is a setter method for the date field of a bookable room.
	 * 
	 * @param date is the date of the slot.
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * This is a getter method for the time field of a bookable room.
	 * 
	 * @return returns the time of a slot.
	 */
	public String getTime() {
		return time;
	}

	/**
	 * This is a setter method for the time field of a bookable room.
	 * 
	 * @param time is the time of the slot.
	 */
	public void setTime(String time) {
		this.time = time;
	}

}
