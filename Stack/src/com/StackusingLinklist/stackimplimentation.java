package com.StackusingLinklist;

public class stackimplimentation {
    stackNode Top = null ;

    public    boolean isEmpty(){
        return Top==null  ;
    }
    void push(int data ) {
        stackNode newnode = new stackNode(data) ;
        if(isEmpty() ) {
            Top =newnode ;
            System.out.println("Push the value "+ data  + " in the stack  when stack is null ");
            return;
        }

        newnode.next = Top ;
        Top = newnode ;
        System.out.println("Push the value "+ data  + " in the stack ");
    }

    void pop() {
        if(Top  == null ) {
            System.out.println("Nothing to pop ");
            return;
        }
        System.out.println("Pop value is " + Top.data);
        Top = Top.next ;
    }
    void peek() {
        if (Top == null ) {
            System.out.println("Stack is empty ");
            return;
        }
        System.out.println("Peek elelement is " + Top.data );
    }


    public static void main(String[] args) {
        stackimplimentation st =  new stackimplimentation() ;
        st.push(10);
        st.push(20);
        st.pop();
        System.out.println(st.isEmpty());
        st.peek();
    }
}
