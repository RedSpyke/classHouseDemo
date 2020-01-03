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
    }
}

class myHouse {
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
