package com.homework.ecm1410;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

/**
 * This booking system class contains all the major methods.
 * 
 * @author at753
 */
public class BookingSystem {
	/**
	 * @param args
	 */
	private ArrayList<Room> rooms;
	private ArrayList<Assistant> assistants;
	private String header = "University of Knowledge - COVID test \n";
	private String footer = "0. Back to main menu.\n-1. Quit application.\n";
	private ArrayList<BookableRoom> bookableRooms;
	private ArrayList<AssistantOnShift> assistantsOnShifts;
	private ArrayList<Booking> bookings = new ArrayList<Booking>();;
	// private ArrayList<TimeSlot> availableTimeSlots;
	private List<TimeSlot> availableTimeSlots = new ArrayList<TimeSlot>();

	Scanner scanner; // Create a Scanner object
	String userInput; // User input line

	/**
	 * This method initializes the program, adds rooms and assistants.
	 */
	public BookingSystem() {
		scanner = new Scanner(System.in); // Create a Scanner object

		rooms = new ArrayList<Room>();
		rooms.add(new Room("IC211", 1));
		rooms.add(new Room("IC212", 2));
		rooms.add(new Room("IC213", 3));
		rooms.add(new Room("IC214", 4));
		rooms.add(new Room("IC215", 5));
		rooms.add(new Room("IC216", 6));

		bookableRooms = new ArrayList<BookableRoom>();

		addBookableRooms(rooms.get(0), "01/02/2021", "08:00");
		addBookableRooms(rooms.get(0), "02/03/2021", "08:00");
		addBookableRooms(rooms.get(0), "03/03/2021", "08:00");
		addBookableRooms(rooms.get(0), "04/03/2021", "08:00");
		addBookableRooms(rooms.get(0), "05/03/2021", "08:00");
		addBookableRooms(rooms.get(0), "01/03/2021", "09:00");
		addBookableRooms(rooms.get(0), "02/03/2021", "09:00");
		addBookableRooms(rooms.get(0), "03/03/2021", "09:00");
		addBookableRooms(rooms.get(0), "04/03/2021", "09:00");
		addBookableRooms(rooms.get(0), "05/03/2021", "09:00");

		addBookableRooms(rooms.get(1), "01/03/2021", "07:00");
		addBookableRooms(rooms.get(1), "02/03/2021", "08:00");
		addBookableRooms(rooms.get(1), "03/03/2021", "09:00");

		addBookableRooms(rooms.get(2), "01/03/2021", "07:00");
		addBookableRooms(rooms.get(2), "02/03/2021", "08:00");
		addBookableRooms(rooms.get(2), "03/03/2021", "09:00");

		addBookableRooms(rooms.get(3), "01/03/2021", "09:00");
		addBookableRooms(rooms.get(4), "02/03/2021", "08:00");
		addBookableRooms(rooms.get(5), "03/03/2021", "07:00");

		// addBookableRooms(rooms.get(2), "01/03/2021", "10:00");
		addBookableRooms(rooms.get(1), "06/03/2021", "07:00");
		addBookableRooms(rooms.get(1), "06/03/2021", "08:00");
		addBookableRooms(rooms.get(1), "06/03/2021", "09:00");
		assistants = new ArrayList<Assistant>();
		assistants.add(new Assistant("Alperen", "alperen@uok.ac.uk"));
		assistants.add(new Assistant("Turkmen", "turkmen@uok.ac.uk"));
		assistants.add(new Assistant("Halil", "halil@uok.ac.uk"));
		assistants.add(new Assistant("Cemile", "cemile@uok.ac.uk"));
		assistants.add(new Assistant("Ipek", "ipek@uok.ac.uk"));
		assistants.add(new Assistant("DrIpek", "Dripek@uok.ac.uk"));

		assistantsOnShifts = new ArrayList<AssistantOnShift>();
		addAssistantOnShifts(assistants.get(0), "01/02/2021");
		addAssistantOnShifts(assistants.get(1), "01/03/2021");
		addAssistantOnShifts(assistants.get(1), "02/03/2021");
		addAssistantOnShifts(assistants.get(1), "03/03/2021");
		addAssistantOnShifts(assistants.get(2), "01/03/2021");
		addAssistantOnShifts(assistants.get(3), "05/03/2021");
		addAssistantOnShifts(assistants.get(4), "06/03/2021");
		addAssistantOnShifts(assistants.get(1), "06/03/2021");
		addAssistantOnShifts(assistants.get(4), "04/03/2021");
		addAssistantOnShifts(assistants.get(1), "07/03/2021");
		addAssistantOnShifts(assistants.get(0), "07/03/2021");
		addAssistantOnShifts(assistants.get(3), "07/03/2021");

		// assistantsOnShifts.add(assistants.get(0), "01/03/2021", "10:00");

		// bookings = new ArrayList<Booking>();

	}

	private int findAssistantOnShifId(AssistantOnShift SearchAssistantOnShift) {
		return assistantsOnShifts.indexOf(SearchAssistantOnShift);
	}

	private int findBookableRoomId(BookableRoom SearchBookableRoom) {
		return bookableRooms.indexOf(SearchBookableRoom);
	}

	/**
	 * @return returns 0.
	 */
	public int listBooking() {

		return 0;
	}

	/**
	 * @param searchStatus this parameter filters the results.
	 * @param printFooter  this parameter decides if it requires a footer or not.
	 * @return returns the amount(number) of found elements.
	 */
	public int listBookableRooms(String searchStatus, Boolean printFooter) {

		System.out.println(this.header);
		int i = 0;
		try {

			for (BookableRoom bookableRoom : bookableRooms) {
				if (searchStatus == "ALL" || bookableRoom.getStatus() == searchStatus) {
					System.out.println((i + 11) + ". " + bookableRoom.getDate() + " " + bookableRoom.getTime() + " | "
							+ bookableRoom.getStatus() + " | " + bookableRoom.getRoom().getCode() + " | occupancy: "
							+ bookableRoom.getOccupancy());
					i++;
				}
			}
		} catch (NullPointerException e) {
			System.out.print("There aren't any bookable rooms.\n");
		}
		if (printFooter) {
			System.out.println(this.footer);
		}
		return i;
	}

	/**
	 * @param newRoom the room which is assigned to a time slot.
	 * @param newDate date of time slot.
	 * @param newTime time of time slot.
	 */
	public void addBookableRooms(Room newRoom, String newDate, String newTime) {

		// adding all 3 shifts in a day to choosen assistant
		bookableRooms.add(new BookableRoom(newRoom, newDate, newTime));

	}

	/**
	 * @return this method lists the rooms, adds a bookable room.
	 */
	public int addBookableRooms() {
		int i = 10;
		String[] userInputs;
		int seqId;
		System.out.println(this.header);
		System.out.println("Adding bookable room\n");
		try {
			for (Room room : rooms) {
				i++;
				System.out.println(String.valueOf(i) + ". " + room.getCode() + " | " + room.getCapacity() + " |");

			}
		} catch (NullPointerException e) {
			System.out.print("There aren't any rooms in University.\n");
		}
		System.out.println();
		System.out.println("Please, enter one of the following:\n");
		System.out.println(
				"The sequential ID listed to a room, a date (dd/mm/yyyy), and a time (HH:MM),separated by a white space.");
		System.out.println(this.footer);

		userInput = this.scanner.nextLine(); // Read user input
		userInputs = userInput.split(" "); // put ın a array splıt by whıte space
		seqId = Integer.parseInt(userInputs[0]);
		if (seqId == 0) {
			return 0; // TODO Go back to main menu.
		}
		;
		if (seqId == -1) {
			System.exit(0);
		}
		;
		if (seqId > 10 && seqId <= i) {
			try {
				addBookableRooms(rooms.get(seqId - 11), userInputs[1], userInputs[2]);
				System.out.println(" Bookable room added successfully");
				System.out.println("| " + rooms.get(seqId - 11).getCode() + " | capacity: "
						+ rooms.get(seqId - 11).getCapacity() + " |");
			} catch (ArrayIndexOutOfBoundsException a) {
				System.out.println("Error!\nSequential ID must be valid.");

				addBookableRooms();

				// TODO Auto-generated catch block
				a.printStackTrace();
			}

			seqId = addBookableRooms();
		}
		;
		return 0;
	}

	/**
	 * @param seqId user will give a sequential ID as an input.
	 */
	public void removeBookableRoom(int seqId) {
		// removing all 3 shifts for a assistant
		// TODO ID kontrol edılmelı 0 dan buyuk vs
		bookableRooms.remove(seqId - 11);
	}

	/**
	 * @return this method lists the bookable rooms and removes the requested slot.
	 */
	public int removeBookableRoom() {
		int i;
		String userInput;
		int seqId;
		i = listBookableRooms("EMPTY", false);

		System.out.println(" Removing bookable room\n");
		System.out.println("Please, enter one of the following:\n");
		System.out.println("The sequential ID to select the bookable room to be removed.");
		System.out.println(this.footer);

		userInput = this.scanner.nextLine(); // Read user input
		// userInputs = userInput.split(" "); // put ın a array split by white space

		seqId = Integer.parseInt(userInput);

		if (seqId == 0) {
			return 0; // TODO Go back to main menu.
		}
		;
		if (seqId == -1) {
			System.exit(0);
		}
		;

		if (seqId > 10 && seqId <= 11 + i) {
			removeAssistantOnShifts(seqId - 11);
			System.out.println(" Bookable removed successfully");
			seqId = removeAssistantOnShifts();
		}
		;
		return 0;
	}

	/**
	 * @param searchStatus this parameter filters the results.
	 * @param printFooter  this parameter decides if it requires a footer or not.
	 * @return returns the number of found elements.
	 */
	public int listAssistantsOnShifts(String searchStatus, Boolean printFooter) {
		System.out.println(this.header);
		int i = 0;
		try {
			for (AssistantOnShift assistantOnShift : assistantsOnShifts) {
				if (searchStatus == "ALL" || assistantOnShift.getStatus() == searchStatus) {
					i++;
					System.out.println((assistantsOnShifts.indexOf(assistantOnShift) + 11) + ". "
							+ assistantOnShift.getDate() + " " + assistantOnShift.getTime() + " | "
							+ assistantOnShift.getStatus() + " | " + assistantOnShift.getAssistant().getEmail() + " |");
				}
			}
		} catch (NullPointerException e) {
			System.out.print("There aren't any assistants on shifts.\n");
		}
		if (printFooter) {
			System.out.println(this.footer);
		}
		return i;

	}

	/**
	 * @param newAssistant is the assistant who is assigned to a shift.
	 * @param newDate      is the shift date.
	 */
	public void addAssistantOnShifts(Assistant newAssistant, String newDate) {

		// adding all 3 shifts in a day to choosen assistant
		assistantsOnShifts.add(new AssistantOnShift(newAssistant, newDate, "07:00"));
		assistantsOnShifts.add(new AssistantOnShift(newAssistant, newDate, "08:00"));
		assistantsOnShifts.add(new AssistantOnShift(newAssistant, newDate, "09:00"));

	}

	/**
	 * 
	 * @return this lists the assistants, adds a shift to an assistant and a time
	 *         slot. (Has to be 3 hours shift)
	 */
	public int addAssistantsonShift() {
		int i = 10;
		String[] userInputs;
		int seqId;
		System.out.println(this.header);
		System.out.println("Adding assistant on shift\n");
		try {
			for (Assistant assistant : assistants) {
				i++;
				System.out
						.println(String.valueOf(i) + ". " + assistant.getName() + " | " + assistant.getEmail() + " |");

			}
		} catch (NullPointerException e) {
			System.out.print("There aren't any assistant in University.\n");
		}
		System.out.println();
		System.out.println("Please, enter one of the following:\n");
		System.out.println("The sequential ID of an assistant and date (dd/mm/yyyy), separated by a white space.");
		System.out.println(this.footer);

		userInput = this.scanner.nextLine(); // Read user input
		userInputs = userInput.split(" "); // put ın a array splıt by whıte space
		seqId = Integer.parseInt(userInputs[0]);
		if (seqId == 0) {
			return 0; // TODO Go back to main menu.
		}
		;
		if (seqId == -1) {
			System.exit(0);
		}
		;
		if (seqId > 10 && seqId <= i) {
			addAssistantOnShifts(assistants.get(seqId - 11), userInputs[1]);
			System.out.println(" Assistant on Shift added successfully");
			seqId = addAssistantsonShift();
		}
		;
		return 0;
	}

	/**
	 * @param assistantID is the id of the assistant whose shift we're removing.
	 */
	public void removeAssistantOnShifts(int assistantID) {

		// removing all 3 shifts for a assistant
		// TODO ID kontrol edılmelı 0 dan buyuk vs
		assistantsOnShifts.remove(assistantID);
	}

	/**
	 * @return this method prints a list and then asks for an input to remove an
	 *         assistant on a shift.
	 */
	public int removeAssistantOnShifts() {

		int i;
		String userInput;
		int seqId;
		i = listAssistantsOnShifts("FREE", false);

		System.out.println(" Removing assistant on shift\n");
		System.out.println("Please, enter one of the following:\n");
		System.out.println("The sequential ID to select the assistant on shift to be removed.");
		System.out.println(this.footer);

		userInput = this.scanner.nextLine(); // Read user input
		// userInputs = userInput.split(" "); // put ın a array split by white space

		seqId = Integer.parseInt(userInput);

		if (seqId == 0) {
			return 0; // TODO Go back to main menu.
		}
		;
		if (seqId == -1) {
			System.exit(0);
		}
		;

		if (seqId > 10 && seqId <= 11 + i) {
			removeAssistantOnShifts(seqId - 11);
			System.out.println(" Assistant on Shift removed successfully");
			seqId = removeAssistantOnShifts();
		}
		;
		// TODO diger degerler hata verir

		return 0;

	}

	/**
	 * @param searchStatus this parameter filters the results.
	 * @param printFooter  this parameter decides if it requires a footer or not.
	 * @return returns the number of found elements.
	 */
	public int listBooking(String searchStatus, Boolean printFooter) {
		System.out.println(this.header);
		int i = 0;
		System.out.println("list bookings status:selected status " + searchStatus);
		try {
			for (Booking booking : bookings) {

				if (searchStatus == "ALL" || booking.getStatus() == searchStatus) {
					System.out.println((i + 11) + ". " + booking.getBookingDate() + " | " + booking.getStatus() + " | "
							+ booking.getStudentEmail() + " |");
					i++;
				}
			}
		} catch (NullPointerException e) {
			System.out.print("There aren't any assistants on shifts.\n");
		}
		if (printFooter) {
			System.out.println(this.footer);
		}
		return i;

	}

	/**
	 * This method lists the bookings.
	 */
	public void listBookings() {
		@SuppressWarnings("unused")
		int i = 0;
		String userInput;
		int seqId;

		System.out.println(this.header);
		System.out.println(
				"Select which booking to list:\n1. All\n2. Only bookings status:SCHEDULED\n3. Only bookings status:COMPLETED ");
		System.out.println(this.footer);
		userInput = this.scanner.nextLine(); // Read user input
		seqId = Integer.parseInt(userInput);
		switch (seqId) {
		case 1:
			i = listBooking("ALL", true);
			break;
		case 2:
			i = listBooking("SCHEDULED", true);
			break;
		case 3:
			i = listBooking("COMPLETED", true);
			break;
		}

	}

	/**
	 * @param newTimeSlot     is the time slot which is going to be filled.
	 * @param newStudentEmail is the email of the student taking a covid test.
	 */
	public void addBooking(TimeSlot newTimeSlot, String newStudentEmail) {

		// TODO note myself asagidaki islemler tek transaction icinde olmali. hata alan
		// olursa tumu birden iptal olmali

		assistantsOnShifts.get(findAssistantOnShifId(newTimeSlot.getAssistantOnShift())).setStatus("BUSY");

		bookableRooms.get(findBookableRoomId(newTimeSlot.getBookableRoom()))
				.setOccupancy(bookableRooms.get(0).getOccupancy() + 1);

		// newTimeSlot.getAssistantOnShift().getStatus()
		bookings.add(new Booking(newTimeSlot.getAssistantOnShift(), newTimeSlot.getBookableRoom(), newStudentEmail,
				"SCHEDULED", newTimeSlot.getBookingDate(), newTimeSlot.getBookingTime()));

	}

	/**
	 * @return this method adds a booking to the system.
	 */
	public int addBooking() {

		String[] userInputs;
		int seqId;

		System.out.println(this.header);
		System.out
				.println("Adding booking (appointment for a COVID test) to the system\nList of available time-slots:");

		listAvailableTimeSlots();
		System.out.println("\nPlease, enter one of the following:\n"
				+ "The sequential ID of an available time-slot and the student email, separated by a white space.");
		System.out.println(this.footer);
		userInput = this.scanner.nextLine(); // Read user input
		userInputs = userInput.split(" "); // put in a array split by whıte space
		seqId = Integer.parseInt(userInputs[0]);
		if (seqId == 0) {
			return 0; // TODO Go back to main menu.
		}
		;

		if (seqId == -1) {
			System.exit(0);
		}
		;

		if (seqId > 10 && seqId <= availableTimeSlots.size() + 11) {
			try {
				if (userInputs[1].endsWith("@uok.ac.uk") && userInputs[1].length() > 10) { 
					addBooking(availableTimeSlots.get(seqId - 11), userInputs[1]);
					System.out.println("Booking added successfully");
					seqId = addBooking();
				} else if (userInputs[1].length() < 11) { // The email can't only be the domain.
					System.out.println("Error!\nemail should also contain your unique ID.\n");
					System.out.println(
							"Please, enter one of the following:\n\nThe sequential ID of an available time-slot and the student email, separated by a white space.");
					System.out.println(this.footer);
				} else { //The email must end with a specific domain.
					System.out.println("Error!\nemail must end with @uok.ac.uk.\n");
					System.out.println(
							"Please, enter one of the following:\n\nThe sequential ID of an available time-slot and the student email, separated by a white space.");
					System.out.println(this.footer);
				}
			} catch (ArrayIndexOutOfBoundsException a) {
				System.out.println("Error!\nNot enough input is given.\nPlease enter the following:\n");
				System.out.println(
						"The sequential ID of an available time-slot and the student email, separated by a white space.");
				System.out.println(this.footer);
			} catch (NumberFormatException n) {
				System.out.println("Error!\nNot enough input is given.\nPlease enter the following:\n");
				System.out.println(
						"The sequential ID of an available time-slot and the student email, separated by a white space.");
				System.out.println(this.footer);
			}

		}
		;

		return 0;

	}

	/**
	 * @param booking is the booking that'll be removed.
	 */
	public void removeSelectedBooking(Booking booking) {
		booking.getAssistantonshift().setStatus("FREE");
		booking.getBookableRoom().setOccupancy(booking.getBookableRoom().getOccupancy() - 1);
		bookings.remove(booking);

		// assistantsOnShifts.get(findAssistantOnShifId(newTimeSlot.getAssistantOnShift())).setStatus("BUSY");

	}

	/**
	 * This method prints a list and then removes a booking according to user input.
	 */
	public void removeBooking() {
		int seqId;
		listBooking("SCHEDULED", false);
		System.out.println("\nRemoving booking from the system\nPlease enter one of he following:\n");
		System.out.println("The sequential ID to select the booking to be removed from the listed bookings above.");
		System.out.println(this.footer);

		userInput = this.scanner.nextLine(); // Read user input
		seqId = Integer.parseInt(userInput);
		if (seqId == 0) {
			return; // TODO Go back to main menu.
		}
		;
		if (seqId == -1) {
			System.exit(0);
		}
		;
		if (seqId > 10 && seqId <= bookings.size() + 10) {
			removeSelectedBooking(bookings.get(seqId - 11));
			System.out.println(" Assistant on Shift removed successfully");
			removeBooking();
		}

	}

	/**
	 * This is a method to conclude a booking(<sup>scheduled</sup>-->completed).
	 */
	public void concludeBooking() {
		int seqId;
		listBooking("SCHEDULED", false);
		System.out.println("\nConclude booking\nPlease enter one of he following:\n");
		System.out.println("The sequential ID to select the booking to be completed.");
		System.out.println(this.footer);

		userInput = this.scanner.nextLine(); // Read user input
		seqId = Integer.parseInt(userInput);
		if (seqId == 0) {
			return; // TODO Go back to main menu.
		}
		;
		if (seqId == -1) {
			System.exit(0);
		}
		;
		if (seqId > 10 && seqId <= bookings.size() + 10) {
			concludeSelectedBooking(bookings.get(seqId - 11));
			System.out.println("Booking completed successfully");
			concludeBooking();
		}

	}

	/**
	 * @param booking is the booking that'll be concluded.
	 */
	public void concludeSelectedBooking(Booking booking) {
		booking.setStatus("COMPLETED");
	}

	private boolean isSlotAvailable(String searchDate, String SearchTime) {
		for (TimeSlot timeSlot : availableTimeSlots) {
			if (timeSlot.getBookingDate().equals(searchDate) && timeSlot.getBookingTime().equals(SearchTime)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This method prints a list of available time slots to the user.
	 */
	public void listAvailableTimeSlots() {
		// Creates available list from available room and and assistants on shift by same
		// date and time
		availableTimeSlots.clear();
		for (BookableRoom bookableRoom : bookableRooms) {
			if (bookableRoom.getStatus().equals("EMPTY") || bookableRoom.getStatus().equals("AVAILABLE")) {
				for (AssistantOnShift assistantOnShift : assistantsOnShifts) {
					if (assistantOnShift.getStatus().equals("FREE")) {
						if (bookableRoom.getDate().equals(assistantOnShift.getDate())
								&& bookableRoom.getTime().equals(assistantOnShift.getTime())) {
							if (isSlotAvailable(bookableRoom.getDate(), bookableRoom.getTime())) {
								continue; // IF there is a same slot dont add it pass next
							}
							TimeSlot timeSlot = new TimeSlot(assistantOnShift, bookableRoom, null, null,
									bookableRoom.getDate(), bookableRoom.getTime());
							availableTimeSlots.add(timeSlot);
						}
					}
				}
			}
		}
		// sort timeslot array list by
		Collections.sort(availableTimeSlots);
		// Print list
		for (TimeSlot a : availableTimeSlots) {
			System.out.println(
					(availableTimeSlots.indexOf(a) + 11) + ". " + a.getBookingDate() + ' ' + a.getBookingTime());
		}
	}

	/**
	 * This is a getter method for the rooms.
	 * 
	 * @return this method returns an array list of rooms.
	 */
	public ArrayList<Room> getRooms() {
		return this.rooms;
	}

	/**
	 * This is a setter method for the rooms.
	 * 
	 * @param rooms is an array list of rooms.
	 */
	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	/**
	 * this is a getter method for the assistants.
	 * 
	 * @return returns an array list of assistants.
	 */
	public ArrayList<Assistant> getAssistants() {
		return assistants;
	}

	/**
	 * This is a setter method for the assistants.
	 * 
	 * @param assistants is an array list of assistants.
	 */
	public void setAssistants(ArrayList<Assistant> assistants) {
		this.assistants = assistants;
	}

}
