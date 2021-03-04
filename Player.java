package com.ltts.Player;

import java.util.Date;

public class Player {
	private String name;
	private Date dateofbirth = new Date();
	private String skill;
	private int Numberofmatches;
	private int runs;
	private int wickets;
	String nationality;
	private double PowerRating;
	
	public Player(String name, Date dateofbirth, String skill, int numberofmatches, int runs, int wickets,
			String nationality, double powerRating) {
		super();
		this.name = name;
		this.dateofbirth = dateofbirth;
		this.skill = skill;
		Numberofmatches = numberofmatches;
		this.runs = runs;
		this.wickets = wickets;
		this.nationality = nationality;
		PowerRating = powerRating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public int getNumberofmatches() {
		return Numberofmatches;
	}
	public void setNumberofmatches(int numberofmatches) {
		Numberofmatches = numberofmatches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public double getPowerRating() {
		return PowerRating;
	}
	public void setPowerRating(double powerRating) {
		PowerRating = powerRating;
	}
	
}