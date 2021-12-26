package oopConcept.singletonPack;

public class SingletonClass {

    private static SingletonClass singleClass = new SingletonClass();

    private SingletonClass (){

    }

    public static SingletonClass getInstance(){
        return singleClass;
    }

    public void sing(){
        System.out.println("Do some action in the singleton Class");
    }

    public void singq1(){
        System.out.println("Do some action in the singleton Class");
    }
}
