package Chapter2.video2_1;

public class ArrayAsArgument {
    public void variableNoArgs(int... x){
        System.out.println(x.length);

    }
    public static void main(String[] args) {
            ArrayAsArgument a = new ArrayAsArgument();
            a.variableNoArgs(2,3,4,3,2,1,2,4,5);
    }
}
