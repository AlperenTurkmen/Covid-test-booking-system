package com.homework.ecm1410;

/**
 * This class is specialized for assistants and their shifts. it is not the same
 * as an assistant, it includes assistant as a field.
 * 
 * @author at753
 * 
 */
public class AssistantOnShift {
	private String date;
	private String time;
	private String status;
	private Assistant assistant;
	// TODO private DateAndTime dateAndTime;

	/**
	 * @param assistant is the assistant that's assigned.
	 * @param date      is the day of shift.
	 * @param time      is the shift hour.
	 */
	public AssistantOnShift(Assistant assistant, String date, String time) {
		this.assistant = assistant;
		this.date = date;
		this.status = "FREE";
		this.time = time;
	}

	/**
	 * This is a getter method for date of this shift.
	 * 
	 * @return returns a date.
	 */
	public String getDate() {

		return date;
	}

	/**
	 * This is a getter method for the assistant of this shift.
	 * 
	 * @return returns an assistant object.
	 */
	public Assistant getAssistant() {
		return assistant;
	}

	/**
	 * This is a setter method for the assistant of this shift.
	 * 
	 * @param assistant is the assistant of this shift.
	 */
	public void setAssistant(Assistant assistant) {
		this.assistant = assistant;
	}

	/**
	 * This is a setter method for the date of this shift.
	 * 
	 * @param date is the date.
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * This is a getter method for the time of this shift.
	 * 
	 * @return returns the time.
	 */
	public String getTime() {
		return time;
	}

	/**
	 * This is a setter method for the time of this shift.
	 * 
	 * @param time is the time.
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * This is a getter method for the status of this shift.
	 * 
	 * @return returns a status.
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * This is a setter method for the status of this shift.
	 * 
	 * @param status is the status of it.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
