package com.capg.fms.service;

import java.util.List;

import com.capg.fms.dao.BookingDaoImpl;
import com.capg.fms.dto.*;
import com.capg.fms.exception.MyException;
import com.capg.fms.util.Repository;

public class BookingServiceImpl {
	List<Booking> booking = Repository.getBooking();
	BookingDaoImpl bookDao = new BookingDaoImpl();
	
	
	public List<Booking> addBookingService(Booking  booking) {
	//Creates a new booking.
		//returning to DAO Class
		return bookDao.addBookingDao(booking);
			
	}
	
	public Booking modifyBookingService(Booking booking) {
		/*Modifies a previous booking. All
		information related to the booking except the booking id can be
		modified.*/	
		return bookDao.modifyBookingDao(booking);
		
	}
	
	
	public Booking viewBookingService(Integer bookingId) throws MyException{
		//List<Booking> :- Retrieves a booking made
		//by the user based on the booking id.
		
		if(bookingId == 0) 
		{
			throw new MyException("Enter a Valid Booking ID.");
			
		}
		Booking bookObj =  bookDao.viewBookingDao(bookingId);
		if(bookObj == null) 
		{
			throw new MyException("Doesn't contain Booking.");
			
		}
			return bookObj;				
	}
	
	public List<Booking> viewBooking() {
		//Retrieves a list of all the bookings made.
		//BookingDaoImpl bookDao = new BookingDaoImpl();
		List<Booking> book = bookDao.viewBookingListDao();
		return book;
		
		
	}
	
	public void cancelBookingService(int bookingId) throws MyException {
	//Deletes a previous booking identifiable by the ‘bookingId’.
		if(bookingId == 0) 
		{
			throw new MyException("Enter a Valid Booking ID.");
			
		}
		else
		{
		bookDao.cancelBookingDao(bookingId);
		}
						
	}
	
	
}
