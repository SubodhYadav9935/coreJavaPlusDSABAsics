package Chapter2.solution;

public abstract interface Frobnicate {
    public void twiddle(String s);
}
//public abstract class frob implements Frobnicate{}


class Frob implements Frobnicate {
    public void twiddle(String i) { }
    public void twiddle(Integer s) { }
}