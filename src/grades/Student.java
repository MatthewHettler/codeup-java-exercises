package grades;

import java.util.ArrayList;

public class Student {

    //Properties
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, int grades) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.grades.add(grades);
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum/grades.size();
    }

    public ArrayList<Integer> getGrades() {
        return this.grades;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Matthew", 100);
        System.out.println(student1.getName());
        System.out.println(student1.getGradeAverage());
        student1.addGrade(90);
        System.out.println(student1.getGrades());
        System.out.println(student1.getGradeAverage());
    }

}
