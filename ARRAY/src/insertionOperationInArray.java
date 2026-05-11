import java.util.ArrayList;
import java.util.List;

public class insertionOperationInArray {
    public static void main(String[] args) {
        List<Integer>arr  = new ArrayList<>() ;
        arr.add(0 , 1 ) ;
        System.out.println(arr.toString());
        arr.add(0, 2) ;
        System.out.println(arr.toString());
    }
}