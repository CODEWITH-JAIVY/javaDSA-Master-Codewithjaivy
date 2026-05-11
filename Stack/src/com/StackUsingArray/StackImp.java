package com.StackUsingArray;

public class StackImp {
    int [] stack  ;
    int top  ;
int size ;
    StackImp(int size  ) {
        this.size = size ;
        stack = new int[size] ;
        top  = -1  ;
    }

    // push in the stack
    public void push(int value ) {
        if(top  == size -1   ) {
            System.out.println("Stack is full ");
        }
        top++  ;
        stack[top] = value ;
        System.out.println("push data is " +value );

    }
    // POP OPERATION FROM THE STACK
    public  void pop() {
        if(size -1  <=0  ){
            System.out.println("You can not pop out any data bcz stack is empty  ");
        }
        int value  = stack[top -- ] ;
        System.out.println("Poped value is " + value );
    }

    // PEEK VALUE
    public void peek() {
        if(stack.length <=0  ){
            System.out.println("You can not peek out any data bcz stack is empty  ");
        }
        int value  = stack[top] ;
        System.out.println("Peek data is " + value );
    }

    public static void main(String[] args) {
        StackImp st = new StackImp(4 ) ;
        st.push(1);
        st.push(2);
        st.push(3);
        st.peek();
        st.pop();
        st.peek();
    }
}