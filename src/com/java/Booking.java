package com.java;

import java.util.Date;

public class Booking  {
    private FareStartegy basicFareStrategy;

    public BookingDetails bookARide(User user,Journey journey){

        //checkDriverAvailabilty in Are and Time
        Driver driver = new Driver("Test","12334");
        basicFareStrategy = new BasicFareStrategy();
        int fare = basicFareStrategy.calculateFare(journey);
        return sendBookingDetails(driver,fare);
    }


    public BookingDetails sendBookingDetails(Driver driver,int fare){

        BookingDetails bookingDetails = new BookingDetails();
        bookingDetails.setCabTime(String.valueOf(new Date().getTime() + 15));
        bookingDetails.setDriverDetails(driver);
        bookingDetails.setFareAmt(String.valueOf(fare));

        return bookingDetails;
    }

}
