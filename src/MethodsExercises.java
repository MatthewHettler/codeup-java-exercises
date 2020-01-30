import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {

//       ***** Exercise 1: Basic Arithmetic *****
        // TODO: Addition
//        System.out.println(addition(5, 5));

        // TODO: Subtraction
//        System.out.println(subtraction(5, 5));

        // TODO: Multiplication
//        System.out.println(multiplication(5, 5));

        // TODO: Division
//        System.out.println(division(5, 5));

        // TODO: Modulus
//        System.out.println(modulus(5, 5));


//       ***** Exercise 2: Create a method that validates that user input is in a certain range. *****
//        System.out.println(getInteger(1, 10));


//       ***** Exercise 3: Calculate the factorial of a number.. *****
        System.out.println(getfactorial());


    }

//       ***** Exercise 1 Methods *****

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static int modulus(int x, int y) {
        return x % y;
    }


//       ***** Exercise 2 Methods *****

//    public static int getInteger(int min, int max) {
//        System.out.print("Enter a number between " + min + " and " + max + ": ");
//        Scanner scanner = new Scanner(System.in);
//        int userInput = scanner.nextInt();
//        if (userInput < min || userInput > max) {
//            System.out.println("The number shown below must be within " + min + " and " + max + ".");
//        } else if (userInput > min & userInput < max) {
//            System.out.println("Here is your inputted number: ");
//        }
//        return userInput;
//    }


//       ***** Exercise 3 Methods *****

    public static long getfactorial() {

        while (true) {
            System.out.println("Please enter an integer from 1 to 10: ");
            Scanner scanner = new Scanner(System.in);
            long number = scanner.nextInt();
            long fact = 1;
                for (long i = 1; i <= number; i++) {
                    fact = fact * i;
                }
                System.out.println("Factorial of " + number + " is: " + fact + ".");

            System.out.println("Do you want to continue? y/n ");
            Scanner scanner2 = new Scanner(System.in);
            String option = scanner2.nextLine();
            if (!option.equalsIgnoreCase("y")) {
                System.out.println("Goodbye, until next time. Your last factorial was: ");
                return fact;
            }
        }

    }



}


