package Chapter3.video3_3;

public class Salary {
    public static void main(String[] args) {
        int salary = 500;
        Salary r = new Salary();
        r.modify(salary);
        System.out.println("After modify"+salary);

    }
    void modify(int salary){
        salary = salary +100;
        System.out.println(salary);
    }
}
