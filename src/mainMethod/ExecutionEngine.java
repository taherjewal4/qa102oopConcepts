package mainMethod;

import JavaWork.Home;
import JavaWork.Students;

public class ExecutionEngine {

    /**
     * What is Class?  Is a blue print of and object.
     * What is Object? Is an instance  of a class
     * What is access specifier ? Public, protected and privet
     * What is local and global variable;  local: with the method. Global: with in the class.
     * What is a method?  is a function/action/bloc of code that performs some actions.
     * What is return type in method? the type the the method returns like int, string, boolean etc
     * What is primitives and Reference variable? primitives: int, double, boolean, char, float, byte etc Reference: String, Objects
     **/

    //Access specifier, privet and protected
    public static void main(String[] args) {
        String name = "David"; //small box
        int id = 102; // primitive / Integer
        double gpa = 3.5234567856;
        boolean isCurrentStudent = true;
        char section = 'A';
//        System.out.println(name);
//        System.out.println(id);
//        System.out.println(gpa);

//        JavaWork.Students std = new JavaWork.Students();
//        std.studentName();
//        std.studentID();
//        std.studentSection();
//


        Students std = new Students("David");
        String stdName = std.getName();
        System.out.println(stdName);

        int stdID = std.getID();
        System.out.println(stdID);


        Students std2 = new Students("adam", 202);

        String stdName1 = std2.getName();
        System.out.println(stdName1);

        int std2ID = std2.getID();
        System.out.println(std2ID);

        Home.name = "Jhon";
        Home.address = "203 adams street";


        Home.getName(); // static method belongs to the class

        Home home = new Home();
        home.getAddress(); // not static belongs to object

    }
}
