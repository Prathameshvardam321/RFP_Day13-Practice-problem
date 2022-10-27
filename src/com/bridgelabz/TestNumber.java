package com.bridgelabz;
public class TestNumber<T> {
    static String toFindMaximum(String[] intArray){
        String max =intArray[0];
        for (int i=0;i<intArray.length;i++){
            if (intArray[i].compareTo(max) > 0) {
                max = intArray[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String[] stringArray = {"Banana","Potato","Carrot"};
        String result = toFindMaximum(stringArray);
        System.out.println(result);
    }
}