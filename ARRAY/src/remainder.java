public class remainder {
    public static void main(String[]ar) {
        int prefixSum   = -1  ;
        int k = 5  ;
        int res  = ((prefixSum % k) + k) % k ;

        System.out.println(res);
    }
}