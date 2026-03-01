package DSAPHASE2.Day5;

public class BestTimeToSellPrice {
    public static int BuyStock(int prices[]){
        int maxProfit=0;
        int buyPrice=Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice<prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit,profit);
            }else {
                buyPrice= prices[i];
            }

        }
        return maxProfit;
    }

    public static long getL(long l)
    {
        System.out.println(++l);
        return ++l;

    }

    static final long l = 2323L;
    public static void main(String[] args) {
        final long l = 2323L;
        System.out.println(getL(l));


//        int []x = {7,1,5,3,6,4};
//        System.out.println(BuyStock(x));

    }
}
interface Breakable{
    void breakAble();
}
class Car{
    void Accelrate(){}
}
class FancyCar extends Car{
   public void breakAble(){}
}
class SuperFancyCar extends FancyCar implements Breakable{
    public void breakAble(){

    }
    public void Main(){}
}
class S{
    public static void main(String[] args) {
       Print1(new FancyCar());
    }
    public static void Print1(Car c){
        ((Breakable)c).breakAble();
    }
}
