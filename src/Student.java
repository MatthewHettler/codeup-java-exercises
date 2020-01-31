import java.util.Date;

public class Student {
    String name;
    String cohort;
    Date startDate;
    String program;
    String location;
    boolean drinksCoffee;

    public static void main(String[] args) {
        Student matthew = new Student("Matthew");
//        matthew.name = "Matthew";
        matthew.drinksCoffee = true;
        matthew.cohort = "Europa";
        matthew.startDate = new Date("11/4/2019");
        matthew.program = "Web Development";
        matthew.location = "San Antonio";

        Student miguel = new Student("Miguel");
//        miguel.name = "Miguel";
        miguel.cohort = "Europa";
        miguel.startDate = new Date("November 4, 2019");
        miguel.program = "Web Development";
        miguel.location = "San Antonio";
        miguel.drinksCoffee = false;

        System.out.println(matthew.report());
        System.out.println(miguel.report());
        if (matthew.drinksCoffee)
            System.out.println(matthew.name + " drinks coffee.");
    }

    public Student (String name){
        this.name = name;
    }

    public String report() {
        String output = "";
        output += "My name is " + this.name +". ";
        output += "I started learning " + this.program + " with " + this.cohort + " on " + this.startDate + ". ";
        if (this.drinksCoffee)
            output += "I drink coffee in " + this.location + ".";
            else
                output += "I don't drink coffee.";
            return output;
    }
}
