package com.homework.ecm1410;

/**
 * This class is designed for holding all fields of a booking, It contains
 * objects of assistant on shift and bookable room, it has strings of: student
 * email, status, date, time.
 * 
 * @author at753
 */
public class Booking {
	private AssistantOnShift assistantonshift;
	private BookableRoom bookableRoom;
	private String studentEmail;
	private String status;
	private String bookingDate;
	private String bookingTime;

	/**
	 * This is a getter method for booking time.
	 * 
	 * @return returns the time of a booking.
	 */
	public String getBookingTime() {
		return bookingTime;
	}

	/**
	 * This is a setter method for booking time.
	 * 
	 * @param bookingTime is the new time of this booking
	 */
	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}

	/**
	 * This is a getter method for booking date.
	 * 
	 * @return returns the date of a booking
	 */
	public String getBookingDate() {
		return bookingDate;
	}

	/**
	 * This is a setter method for booking date.
	 * 
	 * @param bookingDate is the new date of this booking.
	 */
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	/**
	 * This is a parameterless constructor for Booking class.
	 */
	public Booking() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * This is a constructor with parameters for Booking class.
	 * 
	 * @param assistantonshift is the assistant on shift object required for a
	 *                         booking.
	 * @param bookableRoom     is the bookable room object required for a booking.
	 * @param studentEmail     is the email of the student who's getting the test,
	 *                         must end with \@uok.ac.uk
	 * @param status           is the status of this booking. It can be scheduled or
	 *                         completed.
	 * @param bookingDate      is the date of this booking.
	 * @param bookingTime      is the time of this booking.
	 */
	public Booking(AssistantOnShift assistantonshift, BookableRoom bookableRoom, String studentEmail, String status,
			String bookingDate, String bookingTime) {
		this.assistantonshift = assistantonshift;
		this.bookableRoom = bookableRoom;
		this.studentEmail = studentEmail;
		this.status = status;
		this.bookingDate = bookingDate;
		this.bookingTime = bookingTime;
	}

	/**
	 * This is a getter method for booking status.
	 * 
	 * @return returns the status of a bookable room. Can be scheduled or completed.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This is a setter method for booking status.
	 * 
	 * @param status is the status that's being assigned to this booking.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This is a getter method for the assistant on shift of this booking.
	 * 
	 * @return returns the assistant on shift.
	 */
	public AssistantOnShift getAssistantonshift() {
		return assistantonshift;
	}

	/**
	 * This is a setter method for the assistant on shift of this booking.
	 * 
	 * @param assistantonshift is the assistant required to create the booking. A
	 *                         free assistant at that hour.
	 */
	public void setAssistantonshift(AssistantOnShift assistantonshift) {
		this.assistantonshift = assistantonshift;
	}

	/**
	 * This is a getter method for the bookable room of this booking.
	 * 
	 * @return returns the bookable room object of this booking.
	 */
	public BookableRoom getBookableRoom() {
		return bookableRoom;
	}

	/**
	 * This is a setter method for the bookable room of this booking.
	 * 
	 * @param bookableRoom is the bookable room required to create the booking. An
	 *                     available room
	 */
	public void setBookableRoom(BookableRoom bookableRoom) {
		this.bookableRoom = bookableRoom;
	}

	/**
	 * This is a setter method for booking email.
	 * 
	 * @return returns the student's email.
	 */
	public String getStudentEmail() {
		return studentEmail;
	}

	/**
	 * This is a setter method for booking email.
	 * 
	 * @param studentEmail is the email of the student getting the test.
	 */
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

}
