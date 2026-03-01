package Chapter2.video2_13;

public class TestShoppingMart {
    public static void main(String[] args) {
        TestShoppingMart mart = new TestShoppingMart();
        CreditCard card = new CreditCard();
        DebitCard card1 = new DebitCard();
        GiftCard card2 = new GiftCard();
        mart.makePayment(card);
        mart.makePayment(card1);
        mart.makePayment(card2);
    }
    public void makePayment(CreditCard card){
        card.pay();
    }
    public void makePayment(DebitCard card){
        card.pay();
    }
    public void makePayment(GiftCard card){
        card.pay();
    }
}
class CreditCard{
    public void pay(){
        System.out.println("making the payment using the credit card");
    }
}
class DebitCard{
    public void pay(){
        System.out.println("making payment using debit card");
    }
}
class GiftCard{
    public void pay(){
        System.out.println("making payment using gift card");
    }
}