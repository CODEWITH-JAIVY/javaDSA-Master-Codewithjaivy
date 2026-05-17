import java.util.HashSet;
import java.util.Set;

public class findIntersectionValues1956 {


    public   static   int[] findIntersectionValues(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int val : nums1) {
            set1.add(val);
        }

        for (int val : nums2) {
            set2.add(val);
        }

        int count1 = 0;
        int count2 = 0;

        for (int val : nums1) {
            if (set2.contains(val)) {
                count1++;
            }
        }

        for (int val : nums2) {
            if (set1.contains(val)) {
                count2++;
            }
        }

        return new int[]{count1, count2};
    }

    public static void main(String[] args) {
        int [] num1  = {2,3,2 } ;
        int[]  nums2 =  {1,2} ;

        int [] ans  =  findIntersectionValues(num1 , nums2  ) ;
        for(int val : ans ) {
            System.out.print  (val +"  ");
        }

    }
}