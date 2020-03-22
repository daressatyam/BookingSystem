package com.capg.fms.dto;


import java.time.LocalDate;
import java.util.*;

	public class Booking {
	private Integer bookingId;
	private Integer userId;
	private LocalDate bookingDate;
	private List<Passenger> passengerList;
	private Double ticketCost;
	private Flight flight;
	private Integer noOfPassengers;
	private Integer bookingPNR;

	
	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(Integer bookingId, Integer userId, LocalDate bookingDate, List<Passenger> passengerList,
			Double ticketCost, Flight flight, Integer noOfPassengers, Integer bookingPNR) {
		super();
		this.bookingId = bookingId;
		this.userId = userId;
		this.bookingDate = bookingDate;
		this.passengerList = passengerList;
		this.ticketCost = ticketCost;
		this.flight = flight;
		this.noOfPassengers = noOfPassengers;
		this.bookingPNR = bookingPNR;
	}


	
	public Integer getBookingPNR() {
		return bookingPNR;
	}

	public void setBookingPNR(Integer bookingPNR) {
		this.bookingPNR = bookingPNR;
	}

	public Integer getBookingId() {
		return bookingId;
	}
	public void setBookingId(Integer bookingId) {
		this.bookingId = bookingId;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public List<Passenger> getPassengerList() {
		return passengerList;
	}
	public void setPassengerList(List<Passenger> passengerList) {
		this.passengerList = passengerList;
	}
	public Double getTicketCost() {
		return ticketCost;
	}
	public void setTicketCost(Double ticketCost) {
		this.ticketCost = ticketCost;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	public Integer getNoOfPassengers() {
		return noOfPassengers;
	}
	public void setNoOfPassengers(Integer noOfPassengers) {
		this.noOfPassengers = noOfPassengers;
	}
	
	

}
