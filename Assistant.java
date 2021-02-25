package com.homework.ecm1410;


/**
 * This is an assistant, it only has a <b>name</b> and an <b>email</b>.
 * @author at753
 */
public class Assistant {
	private String name;
	private String email;

	/**
	 * Parameterless constructor method for assistant.
	 */
	public Assistant() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param name:  name of an assistant
	 * @param email: email of an assistant
	 */
	public Assistant(String name, String email) {
		this.name = name;
		this.email = email;
	}

	/**
	 * @return get method for an assistant name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * set method for an assistant name.
	 * 
	 * @param name is the name of an assistant.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return get method for an assistant email.
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email set method for an assistant email.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}
