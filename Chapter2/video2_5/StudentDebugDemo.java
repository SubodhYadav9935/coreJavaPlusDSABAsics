package Chapter2.video2_5;

import java.util.Arrays;
import java.util.List;

public class StudentDebugDemo {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("Aman" ,98),
                new Student("Avinash" ,54),
                new Student("Abhinav" ,65)
        );
        double sum = 0;
        for(Student s: studentList){
            sum = sum + s.getMarks();
        }
        System.out.println("Total number of Students"+sum);
        double avg = sum/3;
        System.out.println("Average of numbers" + avg);

    }
}
class Student{
    private String name;
    private int marks;
    Student(String name,int marks){
        this.marks=marks;
        this.name=name;
    }
    public int getMarks(){
        return marks;
    }
    public String getName(){
        return name;
    }

}
