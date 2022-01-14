package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        replace(arr, 2, 30);
        System.out.println(Arrays.toString(arr));

    }

    //replace the element of the array at given index with a new element
    public static int[] replace(int[] array, int index, int newElement){

        if (index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //replace the element of the array at given index with a new element
    public static double[] replace(double[] array, int index, double newElement){

        if (index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //replace the element of the array at given index with a new element
    public static char[] replace(char[] array, int index, char newElement){

        if (index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }

    //replace the element of the array at given index with a new element
    public static String[] replace(String[] array, int index, String newElement){

        if (index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+ index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }






}
