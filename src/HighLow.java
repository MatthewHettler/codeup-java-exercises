import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {

        highLowGuessingGame();  // Calling the method

    }

//    ***** Method *****
    public static void highLowGuessingGame () {

        Random rand = new Random(); //instance of random class
        int upperbound = 101;
        int int_random = rand.nextInt(upperbound);

        do {

            System.out.println("Try to guess the number between 1 and 100! : ");
            Scanner scanner = new Scanner(System.in);
            int guess = scanner.nextInt();

//          If user's guess is less than the number, it outputs "HIGHER".
            if (guess < int_random){
                System.out.println("Higher!");
            }

//          If user's guess is more than the number, it outputs "LOWER".
            else if (guess > int_random){
                System.out.println("Lower!");
            }

//          If a user guesses the number, the game should declare "GOOD GUESS!"
            else if (guess == int_random){
                System.out.println("Good Guess! You're correct!");
                break;
            }

        } while (true);

    }

}
