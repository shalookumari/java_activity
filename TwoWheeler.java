package com.ltts;
public class TwoWheeler extends Vehicle {

	  public TwoWheeler(String make, String vehicleNumber, int fuelCapacity, String fuelType, int cc) {
		super(make, vehicleNumber, fuelCapacity, fuelType, cc);
	}

	private boolean KickStartAvailable;
	  

	public TwoWheeler(String make, String vehicleNumber, int fuelCapacity, String fuelType, int cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelCapacity, fuelType, cc);
		KickStartAvailable = kickStartAvailable;
	}

	public boolean isKickStartAvailable() {
		return KickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		KickStartAvailable = kickStartAvailable;
	}
	  
	void getNumberOfDoors() {
		System.out.println("kickStartAvailable"+KickStartAvailable);
	}
}
	
	  