public class nested {

    static  int nestedR(int n ) {
        if( n == 1 ) return  1  ;
        return  nestedR(nestedR(n-1)) ;
    }


    public static void main(String[] args) {
        System.out.println(nestedR(3));
    }
}
