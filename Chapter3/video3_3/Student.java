package Chapter3.video3_3;

public class Student {
    int id = 100;
    public static void main(String[] args) {
        int val=200;
        Student st1 = new Student();
        st1.id = val;
        update(st1);
        System.out.println(st1.id);
        Student st2 = new Student();
        st2.id=500;
        switchStudent(st2,st1);
    }
    public static void switchStudent(Student st1, Student st2) {
        int temp = st1.id;
        st1.id = st2.id;
        st2 = new Student();
        st2.id=temp;
    }
    public static void update(Student st) {
        st.id = 300;
        st = new Student();
        st.id = 400;
    }
}
