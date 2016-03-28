package com.java;

public  class Vehicle {

public Vehicle getVehicleType(String vehicleType){

    if (vehicleType.equals("Micro"))
             return new MicroVehicle();
    else
        return new MiniVehicle();
}

}
