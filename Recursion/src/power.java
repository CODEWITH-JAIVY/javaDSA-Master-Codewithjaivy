

public class power {

    public static int pow(int a , int b) {
        if(b ==0 )return  1 ;
        return a* pow(a , b-1 ) ;
    }
    public static void main(String[] args) {
        int res  = pow ( 5 , 2 ) ;
        System.out.println(res);
    }
}
