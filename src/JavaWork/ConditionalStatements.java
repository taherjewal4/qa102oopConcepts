package JavaWork;

public class ConditionalStatements {

    /**
     * https://www.w3schools.com/java/java_operators.asp
     * +
     * -
     * *
     * /
     * %
     * ++
     * --
     * ==
     * =
     * -=
     * <
     * >
     * >=
     * <=

     * if(Conditions [form of boolean]){
     * Given statement
     * }
     */

    public static void main(String[] args) {

        double gpa = 3.5;

        boolean isTrue = gpa < 2;

//        if (gpa > 2) {
//            System.out.println("Student gets average gpa");
//        } else {
//            System.out.println("Student get more then lowest gpa");
//        }


//        System.out.println("**********************"); cmd+/
//
//        if (gpa > 3) {
//            System.out.println("Student gets average gpa");
//        }

        // David
        // passing mark 35
        // 35-50= C
        // 50-60 = B
        // 60-80 = A
        // 80+ = A+
        String student = "David";
        int number = 35;

        if (number < 35) { //false
            System.out.println(student + " is Fail");

        } else if (number > 35 && number < 50) {
            System.out.println(student + " gets C Grade");

        } else if (number > 50 && number < 60) {
            System.out.println(student + " gets B Grade");

        } else if (number > 60 && number < 80) {
            System.out.println(student + " gets A Grade");

        } else {
            System.out.println(student + " gets A+ Grade ");
        }

        if ((number >= 85) || (number < 50)){
            System.out.println(student+" gets C Grade");
        }


    }
}
