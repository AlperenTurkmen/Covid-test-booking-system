package com.homework.ecm1410;

import java.util.Scanner;

public class MainMenu {

	private int selectedMenuItem = 0;

	public void getInput() {
		Scanner myObj = new Scanner(System.in); // Create a Scanner object

		String userInput = myObj.nextLine(); // Read user input
		try {
			this.selectedMenuItem = Integer.parseInt(userInput);

		} catch (NumberFormatException a) {
			System.out.println("The input has to be an integer between -1 and 10.\nPress enter to continue");
			myObj.nextLine();
			this.selectedMenuItem = 0;
		}
	}

	public MainMenu() {
		this.selectedMenuItem = 0;
	}
	
	public void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    //System.out.flush();  
	}  

	public int getSelectedMenuItem() {
		return selectedMenuItem;
	}

	public void setSelectedMenuItem(int selectedMenuItem) {
		this.selectedMenuItem = selectedMenuItem;
	}

	public void showMenu() {
		System.out.println("University of Knowledge - COVID test");
		System.out.println();
		System.out.println("Manage Bookings");
		System.out.println();
		System.out.println("Please, enter the number to select your option:");
		System.out.println();
		System.out.println("To manage Bookable Rooms:");
		System.out.println("1. List");
		System.out.println("2. Add");
		System.out.println("3. Remove");
		System.out.println("To manage Assistants on Shift:");
		System.out.println("4. List");
		System.out.println("5. Add");
		System.out.println("6. Remove");
		System.out.println("To manage Bookings:");
		System.out.println("7. List");
		System.out.println("8. Add");
		System.out.println("9. Remove");
		System.out.println("10. Conclude");
		System.out.println("After selecting one the options above, you will be presented other screens.");
		System.out.println("If you press 0, you will be able to return to this main menu.");
		System.out.println("Press -1 (or ctrl+c) to quit this application.");
		System.out.println();

	}
}
