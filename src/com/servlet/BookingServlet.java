package com.servlet;

import com.java.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class BookingServlet extends HttpServlet {


    public void doPost(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        User user = new User(request.getParameter("userName"),request.getParameter("contactNumber"));
        Vehicle vehicle = new Vehicle();
        vehicle.getVehicleType(request.getParameter("cabType"));
        Journey journey= new Journey(request.getParameter("pickUp"),request.getParameter("drop"),vehicle);


        Booking booking = new Booking();
        BookingDetails bookingDetails= booking.bookARide(user, journey);

        RequestDispatcher dispatcher = request.getRequestDispatcher("BookingConfirmation.jsp");

        request.setAttribute("userName", request.getParameter("userName")); // set your String value in the attribute
        request.setAttribute("contactNumber", "122344"); // set your String value in the attribute
        request.setAttribute("cabType", request.getParameter("cabType")); // set your String value in the attribute
        request.setAttribute("pickUp", request.getParameter("pickUp")); // set your String value in the attribute
        request.setAttribute("drop", request.getParameter("drop")); // set your String value in the attribute
        request.setAttribute("driverName", bookingDetails.getDriverDetails().getUserNam()); // set your String value in the attribute
        request.setAttribute("driverContactNumber", bookingDetails.getDriverDetails().getContactNumber());
        request.setAttribute("vehicleRegNumber", "1223");
        request.setAttribute("fare",bookingDetails.getFareAmt() ); // set your String value in the attribute

        dispatcher.forward(request, response);


    }
}