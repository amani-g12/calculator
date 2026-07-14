import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int operatorNum = 0;
        double num1;
        double num2;
        String userResponse;


        do {

        boolean conditionMet = false;
         double result = 0;

        // Check what type of operation
        while (!conditionMet){

            operatorNum = (int) getNum("Which operation would you like to do? Type 1 for Addition, 2 for Subtraction, 3 for Multiplication, and 4 for Division: ", input);

             if (operatorNum > 0 && operatorNum < 5){
                conditionMet = true;
             } else{
                System.out.println("Invalid input!");
             }

        }
       

        num1 = getNum("Enter first number: ", input);
        
        num2 = getNum("Enter second number: ", input);

        

        if (operatorNum == 1){
            result = num1 + num2;
        }else if(operatorNum == 2){
            result = num1 - num2;
        }else if (operatorNum == 3){
            result = num1 * num2;
        }else{
            if (num2 == 0){
                System.out.println("Cannot divide by zero!");
            }else{
                result = num1/num2;
            }
            }
            

        System.out.println("Result: " + result);

        System.out.println("Would you like to do another calculation? Input y/n.");
        userResponse = input.next();


    } while(userResponse.equalsIgnoreCase("y"));

        input.close();


}

    private static double getNum(String prompt, Scanner input){
        

        while (true){
            System.out.print(prompt);

        try{
                return input.nextDouble();

             }catch(InputMismatchException e){
                System.out.println("Invalid input! Use numbers only.");
                input.next();
             }
            }
    }
}