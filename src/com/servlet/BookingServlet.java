package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.java.Booking;
import com.java.BookingBean;
import com.java.BookingDetails;
import com.java.Journey;
import com.java.User;
import com.java.Vehicle;

@Controller
public class BookingServlet {

	@RequestMapping(value = "/bookingDetails", method = RequestMethod.POST)
	public @ResponseBody BookingBean bookingDetails(@RequestBody BookingBean bookingBean)
	{
		User user = new User(bookingBean.getUserName(),bookingBean.getContactNumber());
		Vehicle vehicle = new Vehicle();
		vehicle.getVehicleType(bookingBean.getCabType());
		Journey journey= new Journey(bookingBean.getCabType(),bookingBean.getDrop(),vehicle);

		Booking booking = new Booking();
		BookingDetails bookingDetails= booking.bookARide(user, journey);
		bookingBean.setContactNumber( "122344");
		bookingBean.setDriverName(bookingDetails.getDriverDetails().getUserNam()); 
		bookingBean.setDriverContactNumber(bookingDetails.getDriverDetails().getContactNumber());
		bookingBean.setVehicleRegNumber("1223");
		bookingBean.setFare(bookingDetails.getFareAmt() ); 

		return bookingBean;

	}
}