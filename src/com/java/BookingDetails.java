package com.java;

public class BookingDetails {

    String cabTime;
    Driver driverDetails;
    String  fareAmt;

    public Driver getDriverDetails() {
        return driverDetails;
    }

    public void setDriverDetails(Driver driverDetails) {
        this.driverDetails = driverDetails;
    }

    public String getCabTime() {
        return cabTime;
    }

    public void setCabTime(String cabTime) {
        this.cabTime = cabTime;
    }

    public String getFareAmt() {
        return fareAmt;
    }

    public void setFareAmt(String fareAmt) {
        this.fareAmt = fareAmt;
    }
}
