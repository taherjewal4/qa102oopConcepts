package oopConcept;

public class ToyotaRav4 extends ToyotaCar{ //Inheritance


    @Override
    public void changeGearToD() {
        System.out.println("Using a joystick they can change the gear");
    }

    @Override
    public void have4Seats() {
        System.out.println("2 seats on the front and 2 in the back");
    }


    @Override
    void airConditions() {

    }

    public void sensorInFront(){

        System.out.println("RaV4 HAS SENSOR FOR THEIR SUV".toLowerCase());

    }
}
