package com.capg.fms.dtotest;

import org.junit.Assert;
import org.junit.Test;

import com.capg.fms.dto.*;
import com.capg.fms.exception.MyException;
public class BookingTest {

	/**
	 * Test method for
	 * {@link import com.capg.fms.DTO.Booking#Booking()}.
	 */
	@Test
	public void testBooking()throws MyException {
		Booking booking = new Booking();
		Assert.assertNull(booking.getBookingId());
		Assert.assertNull(booking.getBookingPNR());
		Assert.assertNull(booking.getTicketCost());
		Assert.assertNull(booking.getNoOfPassengers());
		Assert.assertNull(booking.getPassengerList());
		Assert.assertNull(booking.getUserId());
		
	}
	@Test
	public void testGetSetBookingNumber()throws MyException {
		final Booking booking = new Booking();
		booking.setBookingId(1001);
		Assert.assertTrue(1001 == booking.getBookingId());
	}
	@Test
	public void testGetSetUserId()throws MyException {
		final Booking booking = new Booking();
		booking.setUserId(11111);
		Assert.assertTrue(11111== booking.getUserId());
	}

}