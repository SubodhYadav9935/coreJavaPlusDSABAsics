package Chapter3.video3_3;

public class Book {
    private String title ;

    public String getTitle() {
        return title;
    }

    public static void main(String[] args) {
        Book b = new Book();
        String s = b.getTitle();
        String t = s.toLowerCase();
        System.out.println(t);
    }
}
