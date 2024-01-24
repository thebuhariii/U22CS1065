import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Scanner class to collect input from user
        Scanner userInput = new Scanner(System.in);

        //Variables where input for first and second numbers will be stored
        long firstNumber;
        long secondNumber;

        //Variable where the result of calculation will be stored;

        //While loop so user can continuosly use calculator
        while(true){
            //Getting input for first number
            System.out.print("Enter First number: ");
            //Checking if number is the required data type ie handeling edge case
            if(userInput.hasNextLong()){
                //if input is of required datatype it gets stored in firstNumber variable
                firstNumber = userInput.nextLong();

                //Getting input for second number
                System.out.print("Enter Second number: ");
                //Checking if number is the required data type ie handeling edge case
                if(userInput.hasNextLong()){
                    //if input is of required datatype it gets stored in secondNumber variable
                    secondNumber = userInput.nextLong();

                    //Getting input for operation (+, -, *, /)
                    System.out.print("Enter Operator (+, -, *, /): ");
                    String operator = userInput.next();

                    //Logical statement for checking type of operation user wants to carry out
                    if(operator.equals("+")){
                        //checking if operation is addition
                        addition(firstNumber, secondNumber);
                    }else if(operator.equals("-")){
                        //checking if operation is subtraction
                        subtraction(firstNumber, secondNumber);
                    }else if(operator.equals("*")){
                        //checking if operation is multiplication
                        Multiplication(firstNumber, secondNumber);
                    }else if(operator.equals("/")){
                        //checking if operation is division
                        Division(firstNumber, secondNumber);
                    }else if(operator.equalsIgnoreCase("quit")){
                        //Checking if user typed quit so we can exit the program by breaking out of loop
                        System.out.println("Exiting program...");
                        break;
                    }else{
                        //if all of the above cases result to false then we tell the user type a valid operator
                        System.out.println("Invalid operator");
                    }
                }else {
                    //if the input for the second number was not the expected input we execute the code below

                    //using scanner class so if the user typed quit we exit program
                    String input = userInput.next();
                    if(input.equalsIgnoreCase("quit")){
                        //If user typed quit the below code is executed
                        System.out.println("Exiting program...");
                        break;
                    }else{
                        /*if the input is not the expected data type of long and is not quit we tell the
                        user and restart the program
                         */
                        System.out.println("Error: Input has to be a number");
//                        userInput.next();
                    }
                }


            }else{
                //if the input for the first number was not the expected input we execute the code below

                //using scanner class so if the user typed quit we exit program
                String input = userInput.next();
                if(input.equalsIgnoreCase("quit")){
                    //If user typed quit the below code is executed
                    System.out.println("Exiting program...");
                    break;
                }else{
                    /*if the input is not the expected data type of long and is not quit we tell the
                        user and restart the program
                     */
                    System.out.println("Error: Input has to be a number");
//                    userInput.next();
                }
            }

        }
    }


    public static void addition(long firstNum, long secondNum){
        //Function for adding numbers
        double additionResult = Math.addExact(firstNum, secondNum);
        System.out.println(additionResult);
    }

    public static void subtraction (long firstNum, long secondNum){
        //Function for subtracting numbers
        double subtractionResult = Math.subtractExact(firstNum, secondNum);
        System.out.println(subtractionResult);
    }

    public static void Multiplication(long firstNum, long secondNum){
        //Function for multiplying numbers
        double multiplicationResult = Math.multiplyExact(firstNum, secondNum);
        System.out.println(multiplicationResult);
    }

    public static void Division(long firstNum, long secondNum){
        //Function for dividing numbers

        //Checking if user is trying to divide numbers by 0
        if(secondNum != 0){
            //If user is not trying to divide by 0 the below code executes
            double divisionResult = (double) firstNum / (double) secondNum;
            System.out.println(divisionResult);
        }else{
            //if user tries to divide a number by 0 the below is printed
            System.out.println("Can not divide by 0");
        }
    }
}