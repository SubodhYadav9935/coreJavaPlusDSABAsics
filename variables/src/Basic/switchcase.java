//public class switchcase {
//    public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in)  ;
//        System.out.println("enter number 1 to 7 for weak");
//    int weak = sc.nextInt();
//    switch (weak){
//        case 1:
//            System.out.println("monday");
//            break;
//        case 2:
//            System.out.println("tuesday");
//            break;
//
//
//        case 3:
//            System.out.println("wednesday");
//            break;
//        case 4:
//            System.out.println("thursday");
//            break;
//        case 5:
//            System.out.println("friday");
//            break;
//        case 6:
//            System.out.println("saturday");
//            break;
//        case 7:
//            System.out.println("Sunday");
//            break;
//
//        default:
//            System.out.println("invalid number ");
//    }
//    }
//}
//class switchcase{
//    private  long name;
//
//    public switchcase(int x){
//        this.name =x;
//        leapyear(x);
//    }
//
//    public  void leapyear(int x){
//        if(x%400==0 && x%100==0 || x%4==0 && x%100!=0){
//            System.out.println("leap year");
//        }
//        else{
//            System.out.println("not a leap year ");
//        }
//
//    }
//    public static void main(String[] args) {
//        switchcase sw = new switchcase(2025);
//
//    }
//}

//class switchcase{
//    private int a;
//    private int b;
//    private int c;
//    public switchcase(int a ,int b,int c){
//        this.a=a;
//        this.b=b;
//        this.c=c;
//        mainfuncion(a,b,c);
//
//    }
//    public void mainfuncion(int a,int b,int c){
//        if((a>b) && (a>c)){
//            System.out.println("a is greater "+ a);
//        } else if ((b>a) && (b>c)) {
//            System.out.println("b is greater" + b);
//        }else {
//            System.out.println("c is greater" + c);
//        }
//    }

//    public static void main(String[] args) {
//        switchcase sw = new switchcase(8,7,6);
//        int number = 5;
//
//
//        String ab = (number%2)==1? "odd":"even";
//        System.out.println(ab);
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int sum = 0;
//        int start = 1;
//
//        while(start <= n){
//            sum = sum + start;
//            start++;
//        }
//        System.out.println(sum);




//        for(int i = 1;i<=5;i++) {
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }



//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        while(n>0){
//            int rev = n%10;
//            System.out.print(rev);
//            n = n/10;
//        }
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int f=0;
//        while(n>0){
//             int rem = n%10;
//             f =  (f*10)+rem;
//             n = n/10;
//
//        }




//        System.out.print(f);
//        for(int i =0; i < 5;i++){
//            System.out.println("heloo");
//             i=i+2;
//        }


//   sum of even and odd numbers
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("enter a number");
//        int n = sc.nextInt();
//        int even = 0;
//        int odd = 0;
//        for(int i =1;i<=n; i++){
//            if(i%2==0){
//                even = even +i;
//            } else if (i%2==1) {
//                odd = odd + i;
//            }
//        }
//        System.out.println("summation of even is " + even);
//        System.out.println("summation of odd is " + odd);


        // factorial of any number
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("enter a number");
//        int n = sc.nextInt();
//        int fact = 1;
//        while (n>0){
//            fact = n*fact;
//            n--;
//        }
//        System.out.println(fact);


        // table os any number

//        Scanner sc =  new Scanner(System.in);
//        System.out.println("enter a number");
//        int n = sc.nextInt();
//        int table ;
//        System.out.println("the table of " + n + " is ");
//        for(int i =1;i<=10;i++){
//
//            table = i * n;
//            System.out.println (n + " * " + i + " = " + table);
//        }

//
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("enter a number");
//        int n = sc.nextInt();
//        boolean isPrime = true;
//        for(int i = 2;i<n;i++){
//            if(n%i==0){
//                isPrime= false;
//
//            }
//        }
//        if(isPrime == true){
//            System.out.println("the number is prime ");
//        }else{
//            System.out.println("number is not prime");
//        }
//
//
//    }
//
//}
