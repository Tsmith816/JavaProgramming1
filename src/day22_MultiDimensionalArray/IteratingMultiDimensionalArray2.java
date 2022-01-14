package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {

    public static void main(String[] args) {

       int arr2d[][] = { {1,2,3}, {4,5,6,7,8}, {9,10,11,12,13} };

        for (int i = arr2d.length - 1; i >= 0; i--) { //i: index number of 1D arrays starting from last index to 0

            for (int j = 0; j < arr2d[i].length; j++) { //j: index number of elements starting from 0 to last index
                System.out.println( arr2d[i][j]);
            }

            System.out.println();

        }


        System.out.println("-------------------------------------");

        for (int i = 0; i < arr2d.length; i++) { //i: indexes of 1D starting from 0

            for (int j = arr2d[i].length - 1; j >= 0; j--) {
                System.out.println( arr2d[i][j]+" " );
            }

            System.out.println();

        }






    }

}
