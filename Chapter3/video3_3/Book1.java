package Chapter3.video3_3;

public class Book1 {
    private String title = "ABC";

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book1 b = new Book1();
        String s = b.getTitle();
        String t = s.toLowerCase();
        System.out.println(t);
    }
}
