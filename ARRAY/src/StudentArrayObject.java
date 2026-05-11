import java.util.Arrays;

public class StudentArrayObject {
    private  int roll_number  ;
    private  int mark ;
    private  String name ;

  StudentArrayObject ( int roll_number , int mark , String name  ) {
      this.name  = name  ;
      this.mark  = mark  ;
      this.roll_number  = roll_number ;
  }
  void display( ) {
      System.out.print (" Roll number " + roll_number  + " \n Name " + name + "\n mark " +  mark );
      System.out.println(" ");
  }

    public static void main(String[] args) {
        StudentArrayObject studentArrayObjects[][] = new StudentArrayObject [2][2] ;
        studentArrayObjects[0][0] = new StudentArrayObject( 1 , 98 , "Sanjeet ") ;
        studentArrayObjects [0][1] = new StudentArrayObject( 2 , 78 , "jaivy roy ") ;
        studentArrayObjects[1][0] = new StudentArrayObject(3 , 63 , "sunil kumar ") ;
        studentArrayObjects[1][1]  = new StudentArrayObject( 3 , 45 , "SAnjeet kushawaha ") ;

//        System.out.println(Arrays.deepToString(studentArrayObjects));

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j <2 ; j++) {
                studentArrayObjects[i][j].display();
            }
            System.out.println(" ");
        }
    }
    }

