package com.homework.ecm1410;

/**
 * This is the main class of the project, It controls the <b> entire app. </b>
 * @author at753
 */
public class BookingApp {
	/**
	 * main class.
	 * 
	 * @param args is an array of arguments.
	 */
	public static void main(String[] args) {
		/**
		 * main method
		 * 
		 * @param args
		 */
		BookingSystem bookingSystem = new BookingSystem();

		MainMenu mainMenu = new MainMenu();
		while (mainMenu.getSelectedMenuItem() != -1) {

			switch (mainMenu.getSelectedMenuItem()) {
			case -1: // TODO
				mainMenu.clearScreen();
				System.exit(0);
				break;
			case 0:
				mainMenu.clearScreen();
				mainMenu.showMenu();
				break;
			case 1:
				bookingSystem.listBookableRooms("ALL", true);
				break;
			case 2:
				bookingSystem.addBookableRooms();
				break;
			case 3:
				bookingSystem.removeBookableRoom();
				break;
			case 4:
				bookingSystem.listAssistantsOnShifts("ALL", true);
				break;
			case 5:
				bookingSystem.addAssistantsonShift();
				break;
			case 6:
				bookingSystem.removeAssistantOnShifts();
				break;
			case 7:
				bookingSystem.listBookings();
				break;
			case 8:
				bookingSystem.addBooking();
				break;
			case 9:
				bookingSystem.removeBooking();
				break;
			case 10:
				bookingSystem.concludeBooking();
				break;

			}
			mainMenu.getInput();
		}
	}

}
