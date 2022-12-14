package ders20_MultiDimensionalArrays;

import java.util.Arrays;

public class C07_MDA_Soru {
    public static void main(String[] args) {
        // verilen iki katli array'de ayni index'e sahip elementleri toplayip
        // yeni olusturacagimiz tek katli array'e bu toplamlari atayin

        int[][] arr ={{1,2,3,4},{5,6,7,8,10}};

        // inner 2 array olacagini ama bunlarin uzuunluklarinin degisebilecegini kabul ettik

        int ortakIndexSayisi = arr[0].length < arr[1].length ? arr[0].length : arr[1].length ;

        int[] ortakIndexToplamlariArr = new int[ortakIndexSayisi];

        for (int i = 0; i < ortakIndexToplamlariArr.length ; i++) {

            ortakIndexToplamlariArr[i] = arr[0][i] + arr[1][i];

        }
        System.out.println(Arrays.toString(ortakIndexToplamlariArr));

    }
}
