import java.util.HashSet;
import java.util.Set;

public class duplicateContain {
    public static  boolean duplicate(int [] arr ) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr ){
            if (! set.add(num)){
                return  true ;
            }
        }
        return  false ;
    }

    public static void main(String[] args) {
        int [] arr ={ 1,2,3,4,5,0,10,1 } ;
        boolean result = duplicate( arr ) ;
        if (result){
            System.out.println("true");
        }else {
            System.out.println("False");
        }
    }
}
