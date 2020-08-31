package com.company;

public class CreateACar {
    public static void main(String[] args) {
        Car mikesHyundai = new Car(4, false, "Hyundai");
        mikesHyundai.printCarInfo();
        mikesHyundai.switchRadio();
        System.out.println();
        mikesHyundai.printCarInfo();

        System.out.println();
        Truck testTruck = new Truck(4,false, "Ford", 300);
        testTruck.printHorsePower();
    }
}
