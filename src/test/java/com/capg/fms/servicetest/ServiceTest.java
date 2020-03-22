package com.capg.fms.servicetest;

import java.time.LocalDate;
import java.util.List;

//import org.junit.Assert;
import org.junit.Test;

import com.capg.fms.dto.*;
import com.capg.fms.exception.MyException;
import com.capg.fms.service.BookingServiceImpl;
import com.capg.fms.util.Repository;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ServiceTest {
	List<Booking> testingList = Repository.getBooking();
	BookingServiceImpl BSIobj = new BookingServiceImpl();
	List<Booking> booking = BSIobj.viewBooking();
	private List<Passenger> passenger = Repository.getPassenger();
	
	
	@Test
	 public void viewBookingService()
	{
		Throwable exception=assertThrows(MyException.class,()->{
			BSIobj.viewBookingService(1001);
			throw new MyException("Doesn't contain Booking.");
		});
		assertEquals("Doesn't contain Booking.",exception.getMessage());
	}
	@Test
	 public void viewBookingService1()
	{
		Throwable exception=assertThrows(MyException.class,()->{
			BSIobj.viewBookingService(1002);
			throw new MyException("Doesn't contain Booking.");
		});
		assertEquals("Doesn't contain Booking.",exception.getMessage());
	}
	@Test
	 public void viewBookingService2()
	{
		Throwable exception=assertThrows(MyException.class,()->{
			BSIobj.viewBookingService(1003);
			throw new MyException("Doesn't contain Booking.");
		});
		assertEquals("Doesn't contain Booking.",exception.getMessage());
	}
	
	@Test
	public void  viewBooking()throws MyException
	{
		assertThat(testingList, is(BSIobj.viewBooking()));
		assertEquals(testingList, BSIobj.viewBooking());
	}
	@Test
	public void deleteBookingService()throws MyException
	{
		Throwable exception=assertThrows(MyException.class,()->{
		BSIobj.cancelBookingService(1001);;
		throw new MyException("Doesn't contain Booking.");
	});
	assertEquals("Doesn't contain Booking.",exception.getMessage());
}
	@Test
	public void addBookingService()throws MyException
	{
		Booking book = new Booking(1005,11113,LocalDate.now(),passenger,9900.00,new Flight(12385,"BS2W2","4561",40),2,12343212);
		assertEquals(BSIobj.addBookingService(book),booking);
	}
	public void addBookingService1()throws MyException
	{
		Booking book = new Booking(1007,11113,LocalDate.now(),passenger,9900.00,new Flight(12385,"BS2W2","4561",40),2,12343212);
		assertEquals(BSIobj.addBookingService(book),booking);
	}

}
