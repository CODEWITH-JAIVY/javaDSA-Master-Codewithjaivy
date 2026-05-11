import java.util.Stack;

public class prefixEvalution {

     public static  int evaluation(String  exp) {
         Stack<Integer>stack = new Stack<>();
         String[]starray = exp.trim().split("\\s+") ;
         System.out.println(starray);
         for (int i = starray .length -1 ; i >=0  ; i-- )  {
             String token = starray[i] ;

             if(isOperator(token)) {
                 int num1 = stack.pop() ;
                 int num2 = stack.pop() ;
                 int newnum = Compute(num2 , num1 , token ) ;
                 stack.push(newnum) ;
             }else{
                 stack.push(Integer.parseInt(token)) ;
             }
         }
         return stack.pop() ;
     }

    private static int Compute(int num2, int num1, String token) {

         switch (token) {
             case "+" :return  num1 + num2 ;
             case "-" : return  num1 - num2 ;
             case "*" : return  num1 * num2 ;
             case "/" : return  num1  / num2 ;
         }
         return 1 ;
    }

    private static boolean isOperator(String token) {
         if(token.equals("+") ||  token.equals("-") || token.equals("/")  ||  token.equals("*") ) {
             return  true  ;
         }
         return  false ;
    }

    public static void main(String[] args) {
        String exp =   "- * 9 2 3 / 8 40" ;
        System.out.println("Solution :- " +  evaluation(exp));
    }
}
