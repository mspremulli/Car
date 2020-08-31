package com.company;

public class Truck extends Car {
    public int horsePower;
    public Truck(int numberWheelDrive, String carModel, int horsePower) {
        super(numberWheelDrive,false, carModel);
        this.horsePower = horsePower;
    }

    public void printHorsePower(){
        System.out.println("The Truck's horse power is " + horsePower + ".");
    }
}
