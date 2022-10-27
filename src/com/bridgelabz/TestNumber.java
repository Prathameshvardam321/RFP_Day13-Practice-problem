package com.bridgelabz;

public class TestNumber<T> {
   static Float toFindMaximum(Float[] intArray){
       Float max =0.0f;
       for (int i=0;i<intArray.length-1;i++){
          if (intArray[i].compareTo(intArray[i+1])==1&&intArray[i]>max){
              max=intArray[i];
          }
       }
       return max;
    }
    public static void main(String[] args) {
        Float[] intArray = {121.1f,13.21f,45.12f};
       float result = toFindMaximum(intArray);
        System.out.println(result);
    }
}
