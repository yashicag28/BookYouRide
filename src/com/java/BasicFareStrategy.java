package com.java;

public class BasicFareStrategy implements FareStartegy {
    @Override
    public int calculateFare(Journey journey) {
        return 100;
    }
}
