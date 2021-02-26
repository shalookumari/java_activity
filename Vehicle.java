package com.ltts;

public class Vehicle {
	private String make;
	private String vehicleNumber;
	private int fuelCapacity;
	private String fuelType;
	private int cc;
	
	public Vehicle(String make, String vehicleNumber, int fuelCapacity, String fuelType, int cc) {
		super();
		this.make = make;
		this.vehicleNumber = vehicleNumber;
		this.fuelCapacity = fuelCapacity;
		this.fuelType = fuelType;
		this.cc = cc;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public int getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	void displayMake()
	{
		System.out.println("***"+make+"***");
	}
	void displayBasicInfo()
	{
		System.out.println("vehicleNumber:"+ vehicleNumber);
		System.out.println("FuelCapacity"+fuelCapacity);
		System.out.println("Cc"+cc);
		System.out.println("");
	}
	void displayDetailInfo()
	{
		
	}
}
	
	
	