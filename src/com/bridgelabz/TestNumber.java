package com.bridgelabz;

public class TestNumber<T> {
   static Integer toFindMaximum(Integer[] intArray){
       Integer max =0;
       for (int i=0;i<intArray.length-1;i++){
          if (intArray[i].compareTo(intArray[i+1])==1){
              max=intArray[i];
          }else {
              max=intArray[i+1];
           }
       }
       return max;
    }
    public static void main(String[] args) {
        Integer[] intArray = {12,13,45};
       int result = toFindMaximum(intArray);
        System.out.println(result);
    }
}
