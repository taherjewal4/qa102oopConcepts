package JavaWork;

public class ExceptionHandling {


    public static void main(String[] args) {

        int num1 = 10 ;

        int num2 = 0;


        try {

            System.out.println("Inside try block but before error");

            int sum = num1 / num2;

            System.out.println(sum);

            System.out.println("Inside try block but after error");

        } catch (Exception e ){

            System.out.println(e);
        }


        System.out.println("Continue Executions");
    }
}
