package com.company;

public class Car {
    private int numberWheelDrive;
    private boolean isRadioOn;
    private String carModel;

    public Car(int numberWheelDrive, boolean isRadioOn, String carModel) {
        this.numberWheelDrive = numberWheelDrive;
        this.isRadioOn = isRadioOn;
        this.carModel = carModel;
    }

    private boolean getRadioOn() {
        return isRadioOn;
    }

    private void setRadioOn(boolean isRadioOn) {
        this.isRadioOn = isRadioOn;
    }

    private String getCarModel() {
        return carModel;
    }

    private void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    private int getNumberWheelDrive() {
        return numberWheelDrive;
    }

    private void setNumberWheelDrive(int numberWheelDrive) {
        this.numberWheelDrive = numberWheelDrive;
    }

    public void printCarInfo() {
        System.out.println("The car is a " + this.carModel + " and has " + this.numberWheelDrive + " wheel drive.");
        System.out.print("The radio is ");
//        getRadioOn() ? System.out.println("On.") : System.out.println("Off.");
        System.out.println(getRadioOn() ? "On." : "Off.");
//        String onOff = getRadioOn() ? "On." : "Off.";
//        System.out.println(onOff);
    }
    public boolean switchRadio() {

       setRadioOn(!getRadioOn());
       return getRadioOn();
    }

}
