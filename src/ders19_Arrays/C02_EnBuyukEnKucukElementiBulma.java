package ders19_Arrays;

import java.util.Arrays;

public class C02_EnBuyukEnKucukElementiBulma {
    public static void main(String[] args) {

        int[] arr = {3,8,1,5,2,9};

        enBuyukEnKucukElementiBulma(arr);

    }
    public static void enBuyukEnKucukElementiBulma(int[] arr){

        Arrays.sort(arr);

        System.out.println("En buyuk element :" + arr[arr.length-1]);
        System.out.println("En kucuk element :" + arr[0]);

    }


}
