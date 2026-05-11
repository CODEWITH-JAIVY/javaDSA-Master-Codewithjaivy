import java.util.* ;

public class Common_in_3_Sorted_Arrays {

    public static List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                               List<Integer> arr3) {

        List<Integer> result = new ArrayList<>();
        int i = 0 , j= 0 , k =0 ;
        int n = arr1.size() , m = arr2.size() , l= arr3.size() ;

        while (i < n && j < m && k < l) {
            int a = arr1.get(i) , b = arr2.get(j) , c = arr3.get(k) ;

            if (a == b && b == c) {
                if (result.isEmpty() || result.get(result.size() - 1) != a) {
                    result.add(a);
                            i++  ;
                            j++ ;
                            k++ ;
                }

            } else if (a < b) {
                i++;
            } else if (b < c) {
                j++;
            } else {
                k++;
            }

        while (i > 0 && i < arr1.size() && arr1.get(i).equals(arr1.get(i - 1))) {
            i++;
        }
        while (j > 0 && j < arr2.size() && arr2.get(j).equals(arr2.get(j - 1))) {
            j++;
        }

        while (k > 0 && k < arr3.size() && arr3.get(k).equals(arr3.get(k - 1))) {
            k++;
        }
    }
   if(result.isEmpty()) { return  Collections.singletonList(-1 );}
   return  result ;
}

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(1, 5, 10, 20, 40, 80 , 100 );
        List<Integer> arr2 = Arrays.asList(3, 5, 15, 20, 20,  10, 80, 100);
        List<Integer> arr3 = Arrays.asList(5, 7, 20, 20, 80 ,100);

        List<Integer> common = commonElements (arr1, arr2, arr3);
        System.out.println("Common elements: " + common);
    }
}
