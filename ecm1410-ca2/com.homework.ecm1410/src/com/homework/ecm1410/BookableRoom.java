package com.homework.ecm1410;

import java.util.ArrayList;
import java.util.Date;

public class BookableRoom {
	private int occupancy;

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	private String date;
	private String time;
	private Room room;

	public BookableRoom(Room room, String date, String time) {
		this.room = room;
		this.date = date;
		this.time = time;
		this.occupancy++;
	}

	public BookableRoom() {
		// TODO Auto-generated constructor stub
	}

	public int getOccupancy() {
		return occupancy;
	}

	public void setOccupancy(int occupancy) {
		this.occupancy = occupancy;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

}
