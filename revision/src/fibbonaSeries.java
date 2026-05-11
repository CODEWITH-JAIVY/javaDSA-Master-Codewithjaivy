import javax.swing.plaf.TableHeaderUI;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalTime;

public class fibbonaSeries {

    static int a  = 0 ;
    static int b  = 1 ;

    public  static  int   fibona ( int num  ) {
         // fribona serires
        //  1 ,1 , 2,  3 , 5, 8, 13 , 21 ,34 , 55
        // base case
//        if(num == 0 ) {
//            return    ;
//        }
//        int sum  =  a + b  ;
//        System.out.println(a);
//        a = b  ;
//        b = sum  ;
//        fibona(num-1) ;
            // base case
       if ( num == 0 || num == 1 ) {
           return num ;
       }
//         this line give the  n number of fibinchi resied
        System.out.println(num);
     return fibona(num-1)+fibona(num-2) ;
    }
    public static void main(String[] args) {
//        System.out.println(fibona(10 ) );
        LocalTime currentTime = LocalTime.now();

//        fibona(10);
        System.out.println(fibona(10 ) );
        LocalTime endTime = LocalTime.now();
        Duration duration = Duration.between(endTime ,  currentTime ) ;
        System.out.println(duration.toMillis());
    }
}
