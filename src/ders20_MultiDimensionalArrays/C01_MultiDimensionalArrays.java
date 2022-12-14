package ders20_MultiDimensionalArrays;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr = {{4,3,1},{1,2},{5,6,7},{},{3,6,8,0}};

        System.out.println(arr.length); // 5

        System.out.println(arr[2].length); // 3

        System.out.println(arr[1]); // [1,2] =>direk yazdirilamaz java referansını yazdirir.

        System.out.println(Arrays.toString(arr[1])); // [1, 2]

        // tum array'i yazdirmak istersek

        System.out.println(Arrays.deepToString(arr)); // [[4, 3, 1], [1, 2], [5, 6, 7], [], [3, 6, 8, 0]]

        // System.out.println(arr[3][0]); // ArrayIndexOutOfBoundsException



    }
}
