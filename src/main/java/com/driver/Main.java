package com.driver;

public class Main {
 public class A{
   public String Meth(){
     return "Invoking method from class A";
   }
 }
   class B extends A{
     
     public String Meth(){
       return "Method is overridden in Extended class B";
   }
   }
   public static void main(String[] args){
     B obj=new B();
     System.out.println(obj.Meth());
   }
 }

   
