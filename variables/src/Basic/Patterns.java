package Basic;

class Main{
    public static void main(String[] args) {
        int  n = 4;
        // for row
//        for(int i = 1; i<=n;i++){
//            //for gaps
//            for(int j = 1; j<=n-i;j++){
//                System.out.print(" " );
//            }
//            for(int j = 1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = 1;i<=n; i++){
//            for(int j = 1; j<=n-i+1;j++){
//                System.out.print(j);
//            }
//            System.out.println( );
//        }
//        int  ch = 1;
//          for(int i = 1;i<=n; i++){
//            for(int j = 1; j<=i ;j++){
//
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println( );
//        }

//        for(int i = 1;i<=n; i++){
//            for(int j = 1; j<=i ;j++){
//                if((i+j) % 2==0){
//                    System.out.print("1");
//                }
//                else{
//                    System.out.print("0");
//                }
//
//            }
//            System.out.println( );
//        }

        // butterfly patterns
//        for(int i = 1; i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j = 1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for(int i = n; i>=1;i--){
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int j = 1;j<=2*(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println( );
//        }
        // solid rombus
//        for(int i =1; i<=n;i++){
//            for(int j =1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j =1;j<=n;j++){
//                System.out.print("*");
//            }
//            for(int j =1;j<=i-1;j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//
//        }
        // hollow rombus
//        for(int i =1; i<=n;i++){
//            for(int j =1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j =1;j<=n;j++){
//                if(i==1 || i==n || j==1 || j==n){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            for(int j =1;j<=i-1;j++){
//                System.out.print(" ");
//            }
//            System.out.println();
//
//        }
        // diamond patterns

//          for(int i = 1;i<=n;i++){
//              for(int j = 1;j<=n-i;j++){
//                  System.out.print(" ");
//              }
//              for(int j = 1;j<=i;j++){
//                  System.out.print("*");
//              }
//
//              for(int j = 1;j<i;j++){
//                  System.out.print("*");
//              }
//
//
//              System.out.println();
//          }
//        for(int i = n;i>=1;i--){
//            for(int j = 1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//
//            for(int j = 1;j<i;j++){
//                System.out.print("*");
//            }
//
//
//            System.out.println();
//        }
        //palindrome pattern
        //     1
        //    121
        //   12321
        //  1234321
        // 123454321
        //12345654321
//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int j = 1;j<=i;j++){
//                System.out.print(j);
//            }
//            for(int j=i-1; j>=1;j--){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        int num = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++){
                System.out.print(num);
                num++;
                System.out.print(" ");
            }

            System.out.println();
        }



    }
}