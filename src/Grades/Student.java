package Grades;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        this.grades = grades;
    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade : grades){
            sum += grade;
        }
        return sum/grades.size();
    }





    public static void main(String[] args) {
        Student s1 = new Student("Chris");
        s1.addGrade(99);
        s1.addGrade(100);
        s1.addGrade(86);
        s1.addGrade(88);
        s1.addGrade(79);
        System.out.println(s1.getGradeAverage());


    }
}
