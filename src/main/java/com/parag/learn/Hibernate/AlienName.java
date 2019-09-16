package com.parag.learn.Hibernate;

import javax.persistence.Embeddable;

@Embeddable
public class AlienName {

	String firstname;
	String middleName;
	String lastName;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "AlienName [firstname=" + firstname + ", middleName=" + middleName + ", lastName=" + lastName + "]";
	}
	
	
}
