package com.carpark;

public class car {
}
public class Vehicle {

    private String model;
    private String color;
    private int numOfWheels;
    private String transmission;


    public Vehicle(){

    }


    public Vehicle(String model, String color, int numOfWheels, String transmission){
        this.model = model;
        this.color = color;
        this.numOfWheels = numOfWheels;
        this.transmission = transmission;
    }


    public String getModel(){
        return model;
    }

    public String getColor(){
        return color;
    }