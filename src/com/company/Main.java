package com.company;

public class Main {
    public static void main(String[] args) {
        myHouse House1 = new myHouse();
        House1.EisOn();
        House1.GisOn();
        House1.WisOn();
        House1.displayStatusElectricity();
        House1.displayStatusGas();
        House1.displayStatusWater();

        House1.EisOff();
        House1.WisOFF();
        House1.GisOFF();
        House1.displayStatusElectricity();
        House1.displayStatusGas();
        House1.displayStatusWater();
        House1.numberOfDoors = 10;
        House1.numberOfRooms = 20;
        House1.numberOfWindows = 30;
        House1.numberOfFloors = 2;

        System.out.println("The house has " + House1.numberOfFloors + " floors, "+ House1.numberOfRooms + " rooms " + House1.numberOfDoors + " doors " + House1.numberOfWindows + " windows.");
    }
}

class myHouse {
    byte numberOfWindows;
    byte numberOfDoors;
    byte numberOfFloors;
    byte numberOfRooms;

    private boolean electricity;
    private boolean gas;
    private boolean water;
    public void EisOn(){
        electricity = true;
    }
    public void EisOff (){
        electricity = false;
    }
    public void GisOn () {
        gas = true;
    }
    public void GisOFF (){
        gas = false;
    }
    public void WisOn (){
        water = true;
    }
    public void WisOFF (){
        water = false;
    }
    void displayStatusElectricity (){
        if (electricity == true){
            System.out.println("Electricity is on.");
        }
        else{
            System.out.println("Electricity is off.");
        }
    }
    void displayStatusGas (){
        if (gas == true){
            System.out.println("Gas is on.");
        }
        else{
            System.out.println("Gas is off.");
        }
    }
    void displayStatusWater (){
        if (water == true){
            System.out.println("Water is on.");
        }
        else {
            System.out.println("Water is off.");
        }
    }
}
