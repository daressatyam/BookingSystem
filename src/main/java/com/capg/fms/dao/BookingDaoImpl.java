package com.capg.fms.dao;

import java.util.*;

import com.capg.fms.dto.*;
import com.capg.fms.util.Repository;

public class BookingDaoImpl {

	static List<Booking> booking = Repository.getBooking();
	static List<Passenger> passenger = Repository.getPassenger();
	static List<Flight> flightinfo =Repository.getFlightinfo();
	static List<User> user = Repository.getUser();
	static List<Password> passwd = Repository.getPasswd();
	
	
	public List<Booking> addBookingDao(Booking bookingList) {
		//creates a new booking
		booking.add(bookingList);
		return booking;
		
	}
	
	
	
	public Booking modifyBookingDao(Booking bookingList) {
		//Modifies a previous booking. All
		//information related to the booking except the booking id can be
		//modified.
			
			
			 return bookingList;
		 }
	
	
	
	public Booking viewBookingDao(int bookingId) {
		//Retrieves a booking made by the user based on the booking id.
		for(Booking book : booking) 
		{
			if(book.getBookingId()==bookingId)
			{
				return book;
			}
		}
		return null;
		
	}
	

	public List<Booking> viewBookingListDao() {
		//- Retrieves a list of all the bookings made.
		
		return booking;
	}
	
	
	
	public void cancelBookingDao(int bookingId){
		//Deletes a previous booking identifiable by the ‘bookingId’.
		for(Booking book : booking)
		{
			if(book.getBookingId() == bookingId)
			{
				
				booking.remove(book);
				
			}
			
		}
		
		
		
}}
