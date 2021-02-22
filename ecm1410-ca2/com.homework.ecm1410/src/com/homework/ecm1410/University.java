package com.homework.ecm1410;

import java.util.ArrayList;

public class University {
	private ArrayList<Room> rooms;
	private Assistant[] assistants;
	private String header = "University of Knowledge - COVID test \n";
	private String footer = "0. Back to main menu.\n-1. Quit application.\n";
	private ArrayList<BookableRoom> bookableRooms;

	public University() {
		rooms = new ArrayList<Room>();
		rooms.add(new Room("IC215", 0));
		rooms.add(new Room("IC216", 1));
		rooms.add(new Room("IC217", 2));
		rooms.add(new Room("IC218", 3));
		rooms.add(new Room("IC219", 4));
		rooms.add(new Room("IC221", 5));
		
		bookableRooms = new ArrayList<BookableRoom>();
		
		addBookableRooms(rooms.get(0), "01/03/2021", "10:00");
		addBookableRooms(rooms.get(1), "01/03/2021", "10:00");
		//addBookableRooms(rooms.get(2), "01/03/2021", "10:00");
		addBookableRooms(rooms.get(1), "01/03/2021", "10:00");
		addBookableRooms(rooms.get(1), "01/03/2021", "10:00");
		addBookableRooms(rooms.get(2), "01/03/2021", "10:00");
		System.out.println(rooms.get(1));
	}

	public void addBookableRooms(Room newRoom, String newDate, String newTime) {
		int result;
		result = this.bookableRooms.indexOf(newRoom); 
		System.out.println(newRoom);
		if (result >= 0) {
			this.bookableRooms.get(result).setOccupancy(this.bookableRooms.get(result).getOccupancy() + 1);
		} else {
			bookableRooms.add(new BookableRoom(newRoom, newDate, newTime));
			//System.out.println(bookableRooms.get(0));
		}

	}

	public void getBookableRooms() {
		System.out.println(this.header);
		for (BookableRoom bookableRoom : bookableRooms) {
			// if (room.getCapacity() > 0) {
			System.out.println("| " + bookableRoom.getRoom().getCode() + " | " + " capacity: "
					+ bookableRoom.getRoom().getCapacity() + " | ");
			// }
		}
		System.out.println(this.footer);
	}

	public void addBookableRoom() {
		System.out.println(this.header);
		for (Room room : rooms) {
			System.out.println("| " + room.getCode() + " | " + " capacity: " + room.getCapacity() + " | ");
		}
		System.out.println("Please, enter one of the following:\n");
		System.out.println(
				"The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM),separated by a white space.");
		System.out.println(this.footer);
	}

	public ArrayList<Room> getRooms() {
		return this.rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public Assistant[] getAssistants() {
		return assistants;
	}

	public void setAssistants(Assistant[] assistants) {
		this.assistants = assistants;
	}

}
