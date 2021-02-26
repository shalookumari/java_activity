package com.ltts;

public class FourWheeler extends Vehicle {
	public FourWheeler(String make, String vehicleNumber, int fuelCapacity, String fuelType, int cc) {
		super(make, vehicleNumber, fuelCapacity, fuelType, cc);
		// TODO Auto-generated constructor stub
	}

	public String audioSystem;
	public String numberOfDoors;


	
	 public String getAudioSystem() {
		return audioSystem;
	}

	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}

	public String getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(String numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public void displayDetailInfo() {
		System.out.println("---Basic Information---");
		System.out.println("Audio System:"+getAudioSystem());
		System.out.println("Number of Doors:"+getNumberOfDoors());
		
		 
	 }
}
