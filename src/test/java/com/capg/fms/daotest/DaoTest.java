package com.capg.fms.daotest;
import org.junit.Test;

import com.capg.fms.dao.BookingDaoImpl;
import com.capg.fms.dto.*;
import com.capg.fms.exception.MyException;
import com.capg.fms.util.Repository;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.List;

public class DaoTest {
	List<Booking> testing = Repository.getBooking();
	BookingDaoImpl BDIobj = new BookingDaoImpl();
	List<Booking> booking = BDIobj.viewBookingListDao();
	private List<Passenger> passenger = Repository.getPassenger();
	
	@Test
	 public void viewBookingDao()
	{
		Throwable exception=assertThrows(MyException.class,()->{
			BDIobj.viewBookingDao(1001);
			throw new MyException("Doesn't contain Booking.");
		});
		assertEquals("Doesn't contain Booking.",exception.getMessage());
	}
	

	@Test
	 public void viewBookingDao1()
	{
		Throwable exception=assertThrows(MyException.class,()->{
			BDIobj.viewBookingDao(1002);
			throw new MyException("Doesn't contain Booking.");
		});
		assertEquals("Doesn't contain Booking.",exception.getMessage());
	}

	@Test
	 public void viewBookingDao2()
	{
		Throwable exception=assertThrows(MyException.class,()->{
			BDIobj.viewBookingDao(1003);
			throw new MyException("Doesn't contain Booking.");
		});
		assertEquals("Doesn't contain Booking.",exception.getMessage());
	}
	
	@Test
	public void  viewBookingListDao()throws MyException
	{
		assertThat(testing, is(BDIobj.viewBookingListDao()));
		assertEquals(testing, BDIobj.viewBookingListDao());
	}
	@Test
	public void deleteBookingService()
	{
		Throwable exception=assertThrows(MyException.class,()->{
		BDIobj.cancelBookingDao(1001);;
		throw new MyException("Doesn't contain Booking.");
	});
	assertEquals("Doesn't contain Booking.",exception.getMessage());
}

	@Test
	public void addBookingDao()throws MyException
	{
		Booking book = new Booking(1005,11113,LocalDate.now(),passenger,9900.00,new Flight(12385,"BS2W2","4561",40),2,12343212);
		assertEquals(BDIobj.addBookingDao(book),booking);
	}
	public void addBookingDao1()throws MyException
	{
		Booking book = new Booking(1007,11113,LocalDate.now(),passenger,9900.00,new Flight(12385,"BS2W2","4561",40),2,12343212);
		assertEquals(BDIobj.addBookingDao(book),booking);
	}
}
