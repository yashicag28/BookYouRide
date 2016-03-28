package com.java;

public class Journey {

    private  String startPoint;
    private String endPoint;
    private Vehicle cabType;


    public  Journey(String startPoint,String endPoint,Vehicle cabType){
        this.endPoint=endPoint;
        this.startPoint=startPoint;
        this.cabType=cabType;
    }

    public int getDistance(){

        return 100;

    }


}
