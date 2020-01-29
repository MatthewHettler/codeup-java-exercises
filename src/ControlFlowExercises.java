import javax.security.auth.callback.ChoiceCallback;
import java.math.*;
import java.util.Scanner;
import javax.swing.*;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //        Loop Basics
        //
        //While
        //
        //Create an integer variable i with a value of 5.
        //Create a while loop that runs so long as i is less than or equal to 15
        //Each loop iteration, output the current value of i, then increment i by one.
        //Your output should look like this:
        //
        //5 6 7 8 9 10 11 12 13 14 15
        //
//        int i = 5;
//        while (i <= 15) {
////        System.out.print(i + " ");
//            i++;
//        }
        //Do While
        //
        //Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
        //Alter your loop to count backwards by 5's from 100 to -10.
        //Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
        //
        // 2
        // 4
        // 16
        // 256
        // 65536
//        int x = 0;
/*    do {
//        System.out.println(x);
        x+=2;
    } while (x <= 100);*/

//    x = 100;

/*    do {
        System.out.println(x);
        x-=5;
    } while (x >= -10);*/
//        x = 2;
//        do {
//            System.out.println(x);
//            x = (int) Math.pow(x,2);
//        } while (x < 1000000);


        //For
        //
        //Refactor the previous two exercises to use a for loop instead.Loop Basics
        //
//        for (int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }
//        for (int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }
//        for (int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }
//        for (int i = 2; i < 100000; i = (int) Math.pow(i,2)) {
//            System.out.println(i);
//        }
//        fizzBuzz(100);


        ImageIcon qMark = new ImageIcon("src/question-mark.png");
        int confirm = 0;
        while (confirm == 0) {
            squaresAndCubes();
            confirm = JOptionPane.showConfirmDialog(null, "Would you like to continue?", "Enter Yes/No.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, qMark);
            if (confirm == 1) {
                System.out.println("Exiting Program");
            }
        }

/*        int confirm = 0;
        while (confirm == 0) {
            System.out.println(calcLetterGrade());
            confirm = JOptionPane.showConfirmDialog(null, "Would you like to continue?", "Enter Yes/No.", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, qMark);
            if (confirm == 1) {
                System.out.println("Exiting Program");
            }
        }*/
    }

    public static void fizzBuzz(int number) {
        for (int i = 0; i <= number; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void squaresAndCubes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= num; i++) {
            System.out.printf("%-6d | %-7d | %d\n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        }
    }

    public static String calcLetterGrade() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a grade bettwen 0 to 100.");
        int grade = scanner.nextInt();
        if (grade > 96) {
            return "A+";
        } else if (grade > 92) {
            return "A";
        } else if (grade > 89) {
            return "A-";
        } else if (grade > 86) {
            return "B+";
        } else if (grade > 82) {
            return "B";
        } else if (grade > 79) {
            return "B-";
        } else if (grade > 76) {
            return "C+";
        } else if (grade > 72) {
            return "C";
        } else if (grade > 69) {
            return "C-";
        } else if (grade > 66) {
            return "D+";
        } else if (grade > 64) {
            return "D";
        } else {
            return "F";
        }
    }
}