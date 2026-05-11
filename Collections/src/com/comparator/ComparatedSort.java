package com.comparator;

import java.util.ArrayList;
import java.util.List;

class Student {
    private String name  ;
    private  int rollNumber  ;
    int sem  ;

    Student(String name , int rollNumber , int sem ) {
        this.name = name  ;
        this.rollNumber = rollNumber  ;
        this.sem = sem  ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", sem=" + sem +
                '}';
    }
}
public class ComparatedSort {

    public static void main(String[] args) {
        Student student1  = new Student("Sanjeet kumar " , 1 , 1 ) ;
        Student student2  = new Student("Hariya  " , 2 , 3 ) ;
        Student student3  = new Student("Vishal  " , 3 ,  3) ;
        Student student4  = new Student("Jaivy " , 4, 4 ) ;
        Student student5  = new Student("roy  r" , 5 , 5 ) ;

        List<Student> studentList = new ArrayList<>() ;
        studentList.add(student1) ;
        studentList.add(student2) ;
        studentList.add(student3) ;
        studentList.add(student4) ;
        studentList.add(student5) ;
        studentList.sort((s1 ,s2 ) -> s1.sem - s2.sem );


        for(Student std : studentList ) {
            System.out.println(std.toString());
        }
    }


}