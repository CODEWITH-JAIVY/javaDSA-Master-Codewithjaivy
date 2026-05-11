import java.util.Scanner;

public class vowelcount {
     public  static  int   cal( int a , int b , String operation   ){
         int ans  = 0  ;
         switch (operation) {
             case  "+":
                 ans = a+  b  ;
                 break;
             case "-" :
                ans =    a - b  ;
                break;
             case  "/" :
                 ans  =  a/b  ;
                 break;
             case  "*" :
                 ans  =   a *b  ;
                    break;
             default:
                 System.out.println("Enter valid operation  ");
         }
         return  ans  ;
     }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in) ;
        System.out.println("Enter 1st number  ");
        int z  = scanner.nextInt();
        System.out.println("Enter 2nd value  ");
        int b  = scanner.nextInt() ;
        System.out.println("Enter operation  ");
        String  c  = scanner.next() ;

        int ans  = cal(z , b , c ) ;
        System.out.println(z  +  c   + b  + " = " +   ans  );
    }
}