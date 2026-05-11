import java.lang.reflect.Array;
import java.util.Arrays;

public class removeDuplicates80 {
    public static int removeDuplicates (int[] nums) {

            int k = 0; // next position to fill

            for (int i = 0; i < nums.length; i++) {
                // keep first two always OR if current number != nums[k-2]
                if (k < 2 || nums[i] != nums[k - 2]) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }


    public static void main(String[] args) {
        int []arr =  {0,0,1,1,1,1,2,3,3} ;
        int ans = removeDuplicates(arr) ;
        System.out.println(ans);
//        System.out.println(Arrays.toString(arr));

        for(int num  : arr ) {
            System.out.print(num + " " );
        }
    }
}
