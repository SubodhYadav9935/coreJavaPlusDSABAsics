package Chapter2.video2_6;

public class Test {
    public static void main(String[] args) {
        JavaTeacher.getTeacherInstance(); //constructor invoke only once
        JavaTeacher.getTeacherInstance();
//        JavaTeacher j = new JavaTeacher();
    }
}
