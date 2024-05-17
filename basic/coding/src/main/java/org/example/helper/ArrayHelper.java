package org.example.helper;

public class ArrayHelper {

   public static void print(int[] arr){
       for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + ", ");
       }
   }


   public static void copy(int[] tocopy, int[] arr){
       for(int i = 0; i < arr.length; i++){
           tocopy[i] = arr[i];
       }
   }
}
