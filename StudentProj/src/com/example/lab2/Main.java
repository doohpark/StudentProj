package com.example.lab2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      List<Student> al = new ArrayList<Student>();
      System.out.println("Student List (orderd by name)");
      Student s1 = new Student(100,"Kim",23);
      al.add(s1);
      Student s2 = new Student(101,"Park",22);
      al.add(s2);
      Student s3 = new Student(102,"Choi",25);
      al.add(s3);
      Student s4 = new Student(103,"Hong",24);
      al.add(s4);
      Student s5 = new Student(104,"Seo",21);
      al.add(s5);
      Student s6 = new Student(105,"Lee",22);
      al.add(s6);
      Student s7= new Student(106,"Han",25);
      al.add(s7);
      Student s8 = new Student(107,"Bang",24);
      al.add(s8);
      Student s9 = new Student(108,"Song",21);
      al.add(s9);
      Student s10 = new Student(109,"Lim",22);
      al.add(s10);
      
      Collections.sort(al);
      for(Student s : al) {
         System.out.println(s.toString());
      }
   }

}
