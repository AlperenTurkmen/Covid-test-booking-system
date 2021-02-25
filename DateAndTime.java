package com.homework.ecm1410;

/**
 * This class contains both <b>date</b> and <b>time</b>. It's used for keeping them together.
 * 
 * @author at753
 */
public class DateAndTime {
	private String date;
	private String time;

	/**
	 * This is a parameterless constructor method for DateAndTime class.
	 */
	public DateAndTime() {
		super();
	}

	/**
	 * @param date is the date.
	 * @param time is the time.
	 */
	public DateAndTime(String date, String time) {
		super();
		this.date = date;
		this.time = time;
	}

	/**
	 * This is a getter method for date in DateAndTime class.
	 * 
	 * @return returns the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * This is a setter method for date in DateAndTime class.
	 * 
	 * @param date is the date for this class.
	 */
	public void setDate(String date) {
		this.date = date;
	}

	/**
	 * This is a getter method for time in DateAndTime class.
	 * 
	 * @return returns the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * This is a setter method for time in DateAndTime class.
	 * 
	 * @param time is the time for this class.
	 */
	public void setTime(String time) {
		this.time = time;
	}

}
