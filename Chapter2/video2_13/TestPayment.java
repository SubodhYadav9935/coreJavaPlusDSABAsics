package Chapter2.video2_13;

public class TestPayment{
    private PaymentCard paymentCard;
    public static void main (String []a){
        TestPayment payment = new TestPayment();
        PaymentCard card = new CreditCard1();
        payment.makePayment(card);
    }
    public TestPayment(){}
    public TestPayment(PaymentCard pc){
        this.paymentCard=pc;
    }
    public void makePayment(PaymentCard card){
        card.pay();
    }
}
interface PaymentCard {
    void pay();
}
class CreditCard1 implements PaymentCard{
    public void pay(){
        System.out.println("making the payment using the credit card");
    }
}
class DebitCard1 implements PaymentCard{
    public void pay(){
        System.out.println("making payment using debit card");
    }
}
class GiftCard1 implements PaymentCard{
    public void pay(){
        System.out.println("making payment using gift card");
    }
}

