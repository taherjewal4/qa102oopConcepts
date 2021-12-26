package oopConcept.poly;

public class Home {

    // poly = many ,
    // morphism = forms
    // means:  many form of methods
    // There are 2 way we can achieve polymorphism : 1) Method overloading. 2) Method Overwriting.

    public void homeDesign(String address) {

    }

    public void homeDesign(String address, String homeName) {

    }

    public void homeDesign(String address, boolean homeName, int homeNumber) {
        System.out.println(address + " " + homeName);

    }

    public void homeDesign(int homeNumber, String address, String homeName) {

    }


    public void doors() {
        System.out.println("This doors method from Home class " );
    }


}
