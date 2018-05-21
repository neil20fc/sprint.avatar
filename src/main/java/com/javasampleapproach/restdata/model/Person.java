package com.javasampleapproach.restdata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.javasampleapproach.restdata.model.validate.Films;


@Entity
public class Person {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)

  private int id_person;
  
  @NotNull
  private String name;
  @NotNull
  private int height;
  @NotNull
  private int mass;
  @NotNull
  private String hair_color;
  @NotNull
  private String gender;
  @NotNull
  @Films
  private String planet;
  
public int getId_person() {
	return id_person;
}
public void setId_person(int id_person) {
	this.id_person = id_person;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getHeight() {
	return height;
}
public void setHeight(int height) {
	this.height = height;
}
public int getMass() {
	return mass;
}
public void setMass(int mass) {
	this.mass = mass;
}
public String getHair_color() {
	return hair_color;
}
public void setHair_color(String hair_color) {
	this.hair_color = hair_color;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getPlanet() {
	return planet;
}
public void setPlanet(String planet) {
	this.planet = planet;
}
public Person(int id_person, String name, int height, int mass, String hair_color, String gender, String planet) {
	super();
	this.id_person = id_person;
	this.name = name;
	this.height = height;
	this.mass = mass;
	this.hair_color = hair_color;
	this.gender = gender;
	this.planet = planet;
}
public Person() {
	super();
}



}
