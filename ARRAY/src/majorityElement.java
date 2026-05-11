public class majorityElement {
    public  static int majority( int [] arr) {
            int count = 0, candidate = 0;

            for (int num : arr ) {
            if (count == 0) {
                candidate = num;
            }
            count = count + ((num == candidate) ? 1 : -1);
        }

        return candidate;
    }

    public static void main(String[] args) {
        int []arr = { 1,1,1,1,2,2,2,2,0,0,10} ;
        int result = majority( arr ) ;
        System.out.println(result);
    }
}
