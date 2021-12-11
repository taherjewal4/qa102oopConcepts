package oopConcept;

public abstract class ToyotaCar implements Car {


    // abstract class is 50 abstract and 50 regular class

    @Override
    public void fillFuel() {
        System.out.println(" Fill should be on left side of the car ");
    }

    @Override
    public void moveBreakPadsDown() {
        System.out.println("Press break by foot");
    }


    public void haveRadio() {
        System.out.println("Toyota added radio as new function in the car");
    }


    abstract void airConditions();
}
