package oopConcept;

import oopConcept.poly.Home;
import oopConcept.poly.SecondHome;
import oopConcept.singletonPack.SingletonClass;

public class ExecutionClass {


    /**
     * oop = Object Oriented Programming
     * <p>
     * 1) Abstraction
     * 2) Encapsulation
     * 3) Inheritance
     * 4) Polymorphism
     * 5) Singleton
     * <p>
     * <p>
     * Abstraction -> Implementation Hiding -> Interface/Abstract class
     * Inheritance -> getting properties from Parents
     */

    public static void main(String[] args) {


//        Car car = new ToyotaRav4();
//        car.changeGearToD();
//        car.fillFuel();
//        car.have4Seats();
//        car.moveBreakPadsDown();
//
//        System.out.println();
//        System.out.println();
//
//        ToyotaCar toyotaCar = new ToyotaRav4();
//        toyotaCar.changeGearToD();
//        toyotaCar.fillFuel();
//        toyotaCar.have4Seats();
//        toyotaCar.moveBreakPadsDown();
//        toyotaCar.haveRadio();
//        toyotaCar.airConditions();
//
//        System.out.println();
//        System.out.println();
//
//
//        ToyotaRav4 rav4 = new ToyotaRav4();
//        rav4.airConditions();
//        rav4.sensorInFront();
//        rav4.changeGearToD();
//        rav4.have4Seats();


        Students std = new Students();
        std.setName("Jhon");
        System.out.println(std.getName());


        Home hm = new Home();

        hm.homeDesign("", "");

        SecondHome scHome = new SecondHome();

        scHome.doors();



        SingletonClass.getInstance().sing();

    }


}
