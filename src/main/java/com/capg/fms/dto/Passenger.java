package com.capg.fms.dto;



final public class Passenger {
	private Integer pnrNumber;
	private String passengerName;
	private Integer passengerAge;
	private Integer passengerUIN;
	private double luggage;
	
	
	
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(Integer pnrNumber, String passengerName, Integer passengerAge, Integer passengerUIN,
			double luggage) {
		super();
		this.pnrNumber = pnrNumber;
		this.passengerName = passengerName;
		this.passengerAge = passengerAge;
		this.passengerUIN = passengerUIN;
		this.luggage = luggage;
	}
	public Integer getPnrNumber() {
		return pnrNumber;
	}
	public void setPnrNumber(Integer pnrNumber) {
		this.pnrNumber = pnrNumber;
	}
	public String getPassengerName() {
		return passengerName;
	}
	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}
	public Integer getPassengerAge() {
		return passengerAge;
	}
	public void setPassengerAge(Integer passengerAge) {
		this.passengerAge = passengerAge;
	}
	public Integer getPassengerUIN() {
		return passengerUIN;
	}
	public void setPassengerUIN(Integer passengerUIN) {
		this.passengerUIN = passengerUIN;
	}
	public double getLuggage() {
		return luggage;
	}
	public void setLuggage(double luggage) {
		this.luggage = luggage;
	}
	

	
}



