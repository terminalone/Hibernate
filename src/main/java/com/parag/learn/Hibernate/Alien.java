package com.parag.learn.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="Alien")
public class Alien {
	@Id
	int Alien_id;
	//@Transient
	private AlienName Alien_name;
	@Column(name="Alien_Home")
	String Planet;

	@Override
	public String toString() {
		return "Alien [Alien_id=" + Alien_id + ", Alien_name=" + Alien_name + ", Planet=" + Planet + "]";
		
	}

	public int getAlien_id() {
		return Alien_id;
	}

	public void setAlien_id(int alien_id) {
		Alien_id = alien_id;
	}

	public String getPlanet() {
		return Planet;
	}

	public void setPlanet(String planet) {
		Planet = planet;
	}

	public AlienName getAlien_name() {
		return Alien_name;
	}

	public void setAlien_name(AlienName alien_name) {
		Alien_name = alien_name;
	}
	
}
