/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jan06;

/**
 *
 * @author JEE
 */
public class ExceptionTask {
    
   public static void main(String[] args) { 
        // 1. ArrayIndex
       try {
           int[] arr = {10, 20, 30};
           System.out.println(arr[5]); //invaild index
      } catch (ArrayIndexOutOfBoundsException e) {
          System.out.println("ArrayIndexOutOfBoundsException occurred");
      }
     // 2. Arithmetic
     try {
         int a = 10;
         int b = 0;
         int c = a / b; //divide by zero
         System.out.println(c);
     }  catch (ArithmeticException ee) {
            System.out.println("ArthmethicException occured");
     }
     // 3. Null
     try {
         String name = null;
         System.out.println(name.length());
     } catch (NullPointerException e) {
        System.out.println("NullPointerException occurred");
     }
      System.out.println("Program finished successfully");
   }

 }