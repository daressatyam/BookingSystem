package com.capg.fms.ui;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.capg.fms.dto.*;
import com.capg.fms.exception.MyException;
import com.capg.fms.service.BookingServiceImpl;
import com.capg.fms.util.Repository;

public class UserInterface 
{
	
	public static void main(String args[])
	{
		
	    char ch;
	
		Scanner sc = new Scanner(System.in);
	BookingServiceImpl bookserviceobj = new BookingServiceImpl();	
	List<Booking> bookObj = Repository.getBooking();
	List<Passenger> passengerlist = Repository.getPassenger();
	do
	{
		System.out.println("----------------------BOOKING SYSTEM----------------");
		System.out.println(" Press 1 to ADD BOOKING:  \n Press 2 to MODIFY BOOKING: \n Press 3 to VIEW BOOKING By BOOKING_ID: \n Press 4 to VIEW ALL DATA: \n Press 5 to DELETE BOOKING: \n");
		System.out.print(" \n PRESS AND HIT ENTER:");
		int choice;
		while (true) {
	        try {
	        	 choice = sc.nextInt();
	            break;
	        }
	        catch (InputMismatchException e) {
	            System.out.print("INVALID INPUT-------- ENTER AGAIN =  ");
	            sc.nextLine();
	        }
	    }
		switch(choice)
		{
		case 1:
			// ADD BOOKING
			Booking booking=new Booking();
			
			Passenger passenger = new Passenger();
			Random bookingId = new Random(); 
			int randomBookingId = bookingId.nextInt(10000000);
			
			booking.setBookingId(randomBookingId );
			int pnr = bookingId.nextInt(10000000);
			
			booking.setBookingPNR(pnr);
			System.out.println("ENTER THE USER ID:");
			int userIdInput;
		    while (true) {
		        try {
		        	userIdInput = sc.nextInt();
		            break;
		        }
		        catch (InputMismatchException e) {
		            System.out.print("Invalid input. Please reenter USER ID as Integer: ");
		            sc.nextLine();
		        }
		    }
			
			booking.setUserId(userIdInput);
			System.out.println(" BOOKING DATE:"+LocalDate.now());
			booking.setBookingDate(LocalDate.now());
			
			

			booking.setNoOfPassengers(1);
			System.out.println("TOTAL COST:"+(2999.00));
			booking.setTicketCost(2999.00);
			System.out.println("ENTER THE PASSENGER DETAILS:");
			
			passenger.setPnrNumber(pnr);
			System.out.println("ENTER THE PASSENGER FULL NAME:");
			passenger.setPassengerName(sc.next());
			
			System.out.println("ENTER THE PASSENGER AGE :");
			int  age;
		    while (true) {
		        try {
		        	 age = sc.nextInt();
		            break;
		        }
		        catch (InputMismatchException e) {
		            System.out.print("Invalid input. Please reenter AGE as Integer: ");
		            sc.nextLine();
		        }
		    }
			passenger.setPassengerAge(age);
			System.out.println("ENTER THE PASSENGER UIN:");
			int UIN;
			while (true) {
		        try {
		        	 UIN = sc.nextInt();
		            break;
		        }
		        catch (InputMismatchException e) {
		            System.out.print("Invalid input. Please reenter PASSENGER UIN as Integer: ");
		            sc.nextLine();
		        }
		    }
			passenger.setPassengerUIN(UIN);
			System.out.println("ENTER THE LUGGAGE:");
			double luggage;
			while (true) {
		        try {
		        	 luggage = sc.nextDouble();
		            break;
		        }
		        catch (InputMismatchException e) {
		            System.out.print("Invalid input. Please reenter Luggage weight as double: ");
		            sc.nextLine();
		        }
		    }
			passenger.setLuggage(luggage);
			passengerlist.add(passenger);
			
			
			bookserviceobj.addBookingService(booking);
			System.out.println(":::::::::::::BOOKING DONE:::::::::::::::::::::");	
			System.out.println("BOOKING ID IS ="+randomBookingId );
			System.out.println("PNR ="+pnr);
			
		
			break;	
		
			
		case 2:
			// MODIFY BOOKING
			System.out.println(":::::::::::::::MODIFY BOOKING::::::::::::::");
			System.out.println("ENTER THE BOOKING ID TO MODIFY.");
			int modifyBooking;
			while (true) {
		        try {
		        	 modifyBooking = sc.nextInt();
		            break;
		        }
		        catch (InputMismatchException e) {
		            System.out.print("Invalid input. Please reenter BOOKING ID weight as Integer: ");
		            sc.nextLine();
		        }
		    }
			List<Booking> view = bookserviceobj.viewBooking();
			for(Booking book : view)
			{
				for(Passenger pass : passengerlist)
				{
				if(book.getBookingId()==modifyBooking)
				{
						System.out.println(" WHAT YOU WANT TO MODIFY. IT HAVING LIMITED MODIFY.");
						System.out.println("  1. TO MODIFY USERID. \n  2. TO MODIFY NO OF PASSENGER \n  3. TO MODIFY PASSENGER NAME. \n  4. TO MODIFY PASSENGER AGE \n  5. TO MODIFY UIN. \n  6. TO MODIFY LUGGAGE WEIGHT ");
						System.out.print(" PRESS AND HIT ENTER:");
						int modifyChoice;
						while (true) {
					        try {
					        	 modifyChoice = sc.nextInt();
					            break;
					        }
					        catch (InputMismatchException e) {
					            System.out.print("INVALID INPUT-------- ENTER AGAIN =  ");
					            sc.nextLine();
					        }
					    }
						switch(modifyChoice)
						{
						case 1:
							System.out.println("ENTER THE USER ID:");
							int modifyUserId;
						    while (true) {
						        try {
						        	modifyUserId = sc.nextInt();
						            break;
						        }
						        catch (InputMismatchException e) {
						            System.out.print("Invalid input. Please reenter USER ID as Integer: ");
						            sc.nextLine();
						        }
						    }
							book.setUserId(modifyUserId);
							//flag = 0;
							break;
						case 2:
							System.out.println("ENTER NO of PASSENGER:");
							int  modifyNoOfPasseger;
						    while (true) {
						        try {
						        	 modifyNoOfPasseger = sc.nextInt();
						            break;
						        }
						        catch (InputMismatchException e) {
						            System.out.print("Invalid input. Please reenter No Of Passenger as Integer: ");
						            sc.nextLine();
						        }
						    }
							book.setNoOfPassengers(modifyNoOfPasseger);
							//flag = 0;
							break;
						case 3:
							System.out.println("ENTER THE PASSENGER FULL NAME:");
							pass.setPassengerName(sc.next());
							//flag = 0;
							break;
						case 4:
							System.out.println("ENTER THE PASSENGER AGE :");
							int  modifyAge;
						    while (true) {
						        try {
						        	 modifyAge = sc.nextInt();
						            break;
						        }
						        catch (InputMismatchException e) {
						            System.out.print("Invalid input. Please reenter AGE as Integer: ");
						            sc.nextLine();
						        }
						    }
							pass.setPassengerAge(modifyAge);
							//flag = 0;
							break;
						case 5:
							System.out.println("ENTER THE PASSENGER UIN:");
							int pUIN;
							while (true) {
						        try {
						        	 pUIN = sc.nextInt();
						            break;
						        }
						        catch (InputMismatchException e) {
						            System.out.print("Invalid input. Please reenter PASSENGER UIN as Integer: ");
						            sc.nextLine();
						        }
						    }
							pass.setPassengerUIN(pUIN);
							//flag = 0;
							break;
						case 6:
							System.out.println("ENTER THE LUGGAGE:");
							double modifyLuggage;
							while (true) {
						        try {
						        	 modifyLuggage = sc.nextDouble();
						            break;
						        }
						        catch (InputMismatchException e) {
						            System.out.print("Invalid input. Please reenter Luggage weight as double: ");
						            sc.nextLine();
						        }
						    }
							pass.setLuggage(modifyLuggage);
							//flag = 0;
							break;
						default:
							System.out.println("ENTER VALID CHOICE.");
							//flag = 1;
							break;
						}
					break;
					}
				else{
					System.out.println("BOOKING ID Doesn't Exist.");
					break;
				
				}
				
				
				}
				bookserviceobj.modifyBookingService(book);
				break;
			}
		
		
			break;
		
			
		case 3:
			System.out.println(":::::::::::::ENTER THE BOOKING ID::::::::::::::::");
			int bookId;
			while (true) {
		        try {
		        	 bookId = sc.nextInt();
		            break;
		        }
		        catch (InputMismatchException e) {
		            System.out.print("Invalid input. Please reenter BOOKINGID as Integer: ");
		            sc.nextLine();
		        }
		    }try
			{
		    	Booking obj = bookserviceobj.viewBookingService(bookId);
		    	System.out.println("BookingId" + "             " +"UserId "+ "              " +" PNR"+ "       " + "BookingDate" + "  " +  "            " + "TicketCost() "+  "      " + "NoOfPassengers");	
        	
		    	System.out.println(obj.getBookingId() + "             " +obj.getUserId() + "              " + obj.getBookingPNR()+ "       " + obj.getBookingDate() + "  " +  "            " + obj.getTicketCost() +  "      " + obj.getNoOfPassengers() );	
	        	}
			catch(MyException e)
			{
				System.out.println(e.getMessage());
			}
			break;
			 
			
			
		case 4:
			
			List<Booking> book =bookserviceobj.viewBooking();
			System.out.println("::::::::::::BOOKING DETAILS :::::::::::");
			System.out.println("\n");
			System.out.println("Booking ID" + "       " + "User ID" + "              " +"PNR" + "     "+ "Booking Date" +  "           " + "Ticket Cost" + "  " + " NO of Passenger");
			for(Booking obj:book)
			{
			
				System.out.println(obj.getBookingId() + "             " +obj.getUserId() + "              " + obj.getBookingPNR()+ "    " + obj.getBookingDate() + "  " +  "            " + obj.getTicketCost() +  "      " + obj.getNoOfPassengers() );
				System.out.println("\n\n");
			}
			System.out.println("::::::::::PASSENGER DETAILS::::::::::\n");
			System.out.println("\n");
			for(Passenger pass : passengerlist)
			{
				System.out.println(pass.getPnrNumber() + "       "  + pass.getPassengerName() + "            " + pass.getPassengerAge() + "        " + pass.getPassengerUIN() + "         " + pass.getLuggage());
				System.out.println("\n");
			}
							
			break;
		case 5:
			
			System.out.println(":::::::::::::::ENTER THE BOOKING ID TO DELETE::::::::::::::");
			int deleteId=sc.nextInt();
			try
			{
			
			bookserviceobj.cancelBookingService(deleteId);
			}
			catch(MyException e)
			{
				System.out.println(e.getMessage());
			}
			for(Booking deleteBook : bookObj)
			{
				for(Passenger pass : passengerlist)
				{
					if(deleteBook.getBookingPNR() == pass.getPnrNumber())
					{
						passengerlist.remove(pass);
					}
				}
				}
			
			break;
		default:
			System.out.println("INVALID OPTION CHOOSEN. ");
			System.out.println("ENTER VALID CHOICE \n");
			break;
		}
		System.out.print("Do you want to continue : (Y/N) :");
		ch = sc.next().charAt(0);
		}
		while(ch=='Y'|| ch=='y');
		sc.close();
	}

	
	
	
	
}
	
