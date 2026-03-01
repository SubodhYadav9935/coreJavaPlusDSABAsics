package Chapter2.video2_3;

class Test4 {
     void m1(A a){
         System.out.println("A argument");
     }
     void m1(B b){
         System.out.println("B argument");
     }

     public static void main(String[] args) {
         Test4 t = new Test4();
//    t.m1(null); // Ambiguous method compiler is confuse which one call first that's why it shown error
     }
}
class A{}
class B{}
