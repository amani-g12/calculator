import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean conditionMet = false;
        int operatorNum = 0;


        // Check what type of operation
        while (!conditionMet){
             System.out.print("Which operation would you like to do? Type 1 for Addition, 2 for Subtraction, 3 for Multiplication, and 4 for Division: ");

             // in case user inputs something other than integers
             try{
                operatorNum = input.nextInt();
             }catch(InputMismatchException e){
                System.out.println("Invalid input! Use numbers only.");
                input.next();
                continue;
             }
             

             if (operatorNum > 0 && operatorNum < 5){
                conditionMet = true;
             } else{
                System.out.println("Invalid input!");
             }

        }
       
    
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double result;

        if (operatorNum == 1){
            result = num1 + num2;
        }else if(operatorNum == 2){
            result = num1 - num2;
        }else if (operatorNum == 3){
            result = num1 * num2;
        }else{
            result = num1/num2;
        }

        System.out.println("Result: " + result);

        input.close();
    }
}