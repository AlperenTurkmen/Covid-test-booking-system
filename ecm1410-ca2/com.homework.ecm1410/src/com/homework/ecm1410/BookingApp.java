package com.homework.ecm1410;

public class BookingApp {
	public static void main(String[] args) {
		University universityOfKnowledge = new University();
		//System.out.println(universityOfKnowledge.getRooms().get(0).getCode()+" " +universityOfKnowledge.getRooms().get(0).getCapacity());
		
		
		MainMenu mainMenu = new MainMenu();
		//mainMenu.showMenu();
		// System.out.println(mainMenu.getSelectedMenuItem());
		while (mainMenu.getSelectedMenuItem()!= -1) {
			
		switch (mainMenu.getSelectedMenuItem()) {
		case -1: //TODO
			mainMenu.clearScreen();
		    System.exit(0);
		    break;
		case 0:
		    mainMenu.clearScreen();
		    mainMenu.showMenu();
		    break;
		case 1:
			universityOfKnowledge.getBookableRooms();
			break;
		case 2:
			universityOfKnowledge.addBookableRoom();
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		case 8:
			System.out.println("Sunday");
			break;
		case 9:
			System.out.println("Sunday");
			break;
		case 10:
			System.out.println("Sunday");
			break;

		}
		mainMenu.getInput();
		}
	}

}
