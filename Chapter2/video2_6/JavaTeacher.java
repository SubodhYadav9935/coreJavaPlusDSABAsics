package Chapter2.video2_6;

public class JavaTeacher {
    private static JavaTeacher teacherInstance = null;
    private JavaTeacher(){
        System.out.println("Constructor Invoke");
    }

    public static JavaTeacher getTeacherInstance() {
        if(teacherInstance == null){
            teacherInstance = new JavaTeacher();
        }
        return teacherInstance;
    }
}
