package org.example;

public class Main {
    public static void main(String[] args) {
            FleetOfCars fleet = new FleetOfCars();
            Car gasCar1 = new GasolinCar("MD21233","Audi","A4",4,20);
            fleet.addCar(gasCar1);
            Car gasCar2 = new GasolinCar("PL39279","Audi","A7",4,4);
            fleet.addCar(gasCar2);

            Car elecCar1 = new ElectricCar("JK81766","Tesla","Y",2,200,6);
            fleet.addCar(elecCar1);
            Car elecCar2 = new ElectricCar("GH81766","Tesla","X",2,500,6);
            fleet.addCar(elecCar2);

            Car dieselCar1 = new DieselCar("HG51789","Honda","X",4,17,true);
            fleet.addCar(dieselCar1);
            Car dieselCar2 = new DieselCar("JK94539","Honda","Y",4,8,false);
            fleet.addCar(dieselCar2);

        System.out.println(fleet.toString());

        System.out.println("Total Registration Fee for fleet: " + fleet.getTotalRegistrationFeeForFleet() + " DKK");
    }
}
