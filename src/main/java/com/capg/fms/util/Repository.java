package com.capg.fms.util;
import java.time.LocalDate;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

import com.capg.fms.dto.*;
public class Repository {
	
	private static List<Flight> flightinfo = new CopyOnWriteArrayList<Flight>();
	private static List<Booking> booking = new CopyOnWriteArrayList<Booking>();
	private static List<Passenger> passenger = new CopyOnWriteArrayList<Passenger>();
	private static List<User> user = new CopyOnWriteArrayList<User>();
	private static List<Password> passwd = new CopyOnWriteArrayList<Password>();
	

	public static List<Flight> getFlightinfo() {
		return flightinfo;
	}


	public static void setFlightinfo(List<Flight> flightinfo) {
		Repository.flightinfo = flightinfo;
	}


	public static List<Booking> getBooking() {
		return booking;
	}


	public static void setBooking(List<Booking> booking) {
		Repository.booking = booking;
	}


	public static List<Passenger> getPassenger() {
		return passenger;
	}


	public static void setPassenger(List<Passenger> passenger) {
		Repository.passenger = passenger;
	}


	public static List<User> getUser() {
		return user;
	}


	public static void setUser(List<User> user) {
		Repository.user = user;
	}


	public static List<Password> getPasswd() {
		return passwd;
	}


	public static void setPasswd(List<Password> passwd) {
		Repository.passwd = passwd;
	}


	static
	{
	
		flightinfo.add(new Flight(12355,"BS2W2","1562",50));
		flightinfo.add(new Flight(12365,"BS2W2","4162",60));
		flightinfo.add(new Flight(12385,"BS2W2","4561",40));
	
		
		passenger.add(new Passenger(123456,"johnwick",31,1235,21.45));
		passenger.add(new Passenger(123455,"wick",28,1265,30.45));
		passenger.add(new Passenger(123445,"johnwick",25,1256,23.45));
		
		
		booking.add(new Booking(1001,11111,LocalDate.now(),passenger,9756.00,new Flight(12355,"BS2W2","1562",50),4,123456));
		booking.add(new Booking(1002,11112,LocalDate.now(),passenger,10900.00,new Flight(12365,"BS2W2","4162",60),3,123455));
		booking.add(new Booking(1003,11113,LocalDate.now(),passenger,9900.00,new Flight(12385,"BS2W2","4561",40),2,123445));
		
	
	}
	
	
	
}

	
	
	


