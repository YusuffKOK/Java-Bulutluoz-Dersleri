package ders19_Arrays;

import java.util.Arrays;

public class C08_ArrayeElemanEklemeMethodu {
    public static void main(String[] args) {
        // verilen bir array'e istenen bir elementi ekleyip
        // yeni halini bize donduren bir method olusturun

        int[] arr = {3,5,8,9,10,8,12,21,35,28,46,38,35};
        int eklenecekSayi = 100;

        arr = arrayeElemanEkleme(arr,eklenecekSayi);

        System.out.println(Arrays.toString(arr));

    }
    public static int[] arrayeElemanEkleme(int[] eklenecekArr,int eklenecekSayi){

        int[] yeniArr = new int[eklenecekArr.length+1];

        for (int i = 0; i < eklenecekArr.length ; i++) {

            yeniArr[i] = eklenecekArr[i];

        }

        yeniArr[yeniArr.length-1] = eklenecekSayi;

        return yeniArr;

    }



}
