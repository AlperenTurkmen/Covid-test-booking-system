package com.homework.ecm1410;

/**
 * This class is a time slot. It must contain an assistant on shift and a
 * bookable room at the same time. It also contains strings of student email,
 * status, booking date, booking time.
 * 
 * @author at753
 */
public class TimeSlot implements Comparable<TimeSlot> {
	private AssistantOnShift assistantOnShift;
	private BookableRoom bookableRoom;
	private String studentEmail;
	private String status;
	private String bookingDate;
	private String bookingTime;

	@Override
	public int compareTo(TimeSlot u) {
		if (getBookingDateAndTime() == null || u.getBookingDateAndTime() == null) {
			return 0;
		}
		return getBookingDateAndTime().compareTo(u.getBookingDateAndTime());
	}

	/**
	 * This is a getter method for date and time of a time slot.
	 * 
	 * @return returns the booking date and time concatenated.
	 */
	public String getBookingDateAndTime() {
		return bookingDate + bookingTime;
	}

	/**
	 * This is a getter method for the date of a time slot.
	 * 
	 * @return returns the booking date of this time slot.
	 */
	public String getBookingDate() {
		return bookingDate;
	}

	/**
	 * This is a getter method for the time of a time slot.
	 * 
	 * @return returns the booking time of this time slot.
	 */
	public String getBookingTime() {
		return bookingTime;
	}

	/**
	 * This is a setter method for the time of a time slot.
	 * 
	 * @param bookingTime is the time of time slot
	 */
	public void setBookingTime(String bookingTime) {
		this.bookingTime = bookingTime;
	}

	/**
	 * This is a setter method for the date of a time slot.
	 * 
	 * @param bookingDate is the date of time slot
	 */
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}

	/**
	 * This is a parameterless constructor for TimeSlot class.
	 */
	public TimeSlot() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param assistantOnShift is the assistant on shift object.
	 * @param bookableRoom     is the bookable room object.
	 * @param studentEmail     is the email of taking the test in this time slot.
	 * @param status           is the status of this time slot. It can be full or
	 *                         empty.
	 * @param bookingDate      is the date of the time slot.
	 * @param bookingTime      is the time of the time slot.
	 */
	public TimeSlot(AssistantOnShift assistantOnShift, BookableRoom bookableRoom, String studentEmail, String status,
			String bookingDate, String bookingTime) {
		super();
		this.assistantOnShift = assistantOnShift;
		this.bookableRoom = bookableRoom;
		this.studentEmail = studentEmail;
		this.status = status;
		this.bookingDate = bookingDate;
		this.bookingTime = bookingTime;
	}

	/**
	 * This is a getter method for the status of a time slot.
	 * 
	 * @return returns the status of this time slot.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This is a setter method for the status of a time slot.
	 * 
	 * @param status is the status of a time slot.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * This is a getter method for assistant on shift object of a time slot.
	 * 
	 * @return returns the assistant on shift object of this time slot.
	 */
	public AssistantOnShift getAssistantOnShift() {
		return assistantOnShift;
	}

	/**
	 * This is a setter method for the assistant on shift object of a time slot.
	 * 
	 * @param assistantOnShift is a field of a time slot.
	 */
	public void setAssistantOnShift(AssistantOnShift assistantOnShift) {
		this.assistantOnShift = assistantOnShift;
	}

	/**
	 * This is a getter method for the bookable room object of a time slot.
	 * 
	 * @return returns the bookable room object of this time slot.
	 */
	public BookableRoom getBookableRoom() {
		return bookableRoom;
	}

	/**
	 * This is a setter method for the bookable room object of a time slot.
	 * 
	 * @param bookableRoom is the bookable room object.
	 */
	public void setBookableRoom(BookableRoom bookableRoom) {
		this.bookableRoom = bookableRoom;
	}

	/**
	 * This is a getter method for the student email of a time slot.
	 * 
	 * @return returns the student email of this time slot.
	 */
	public String getStudentEmail() {
		return studentEmail;
	}

	/**
	 * This is a setter method for the student email of a time slot.
	 * 
	 * @param studentEmail is the student's email. It must end with \@uok.ac.uk.
	 */
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

}
