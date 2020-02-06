package grades;

import java.util.HashMap;
import java.util.Scanner;
import util.Input;

public class GradesApplication {

    static HashMap<String, Student> Students = new HashMap<>();
    static Input userInput = new Input();

    public static void main(String[] args) {

        Students.put("RyanReynolds", new Student("Ryan", 90));
        Students.put("ZachGarcia", new Student("Zach", 85));
        Students.put("FernandoGarza", new Student("Fernando", 70));
        Students.put("JustinWorthy", new Student("Justin", 80));

        System.out.println("Welcome!\n");
        System.out.println("Here are the GitHub usernames of our students: \n");

        doStuff();
    }

    public static void doStuff() {

        System.out.println(Students.keySet() + "\n");
        System.out.println("What student would you like to see more information on?\n");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.next();

        if (!Students.containsKey(option)) {
            System.out.println("Sorry, no student found with the GitHub username of " + "\"" + option + "\"." + "\n");
            System.out.println("\nWould you like to see another student? y/n ");
            boolean confirm = userInput.yesNo();
            if (confirm) {
                doStuff();
            } else {
                System.out.println("Goodbye, and have a wonderful day!");
            }
        } else if (Students.containsKey(option)) {
            System.out.printf("\nName: %S - GitHub Username: %S - Current Average: %f", Students.get(option).getName(), option, Students.get(option).getGradeAverage());
            System.out.println("\nWould you like to see another student? y/n ");
            boolean confirm = userInput.yesNo();
            if (confirm) {
                doStuff();
            } else {
                System.out.println("Goodbye, and have a wonderful day!");
            }
        }
    }

}


