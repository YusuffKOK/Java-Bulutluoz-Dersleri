package ders19_Arrays;

import java.util.Arrays;

public class C01_elemanlariSolaKaydirma {
    public static void main(String[] args) {
        // verilen bir array'deki tum elementleri bir saga kaydirip
        // sondaki elementi de basa tasıyacak bir method olusturun. array'i yeni haliyle kaydedin
        // orn: input : [4,5,6,7] output : [7,4,5,6]

         int[] arr ={4,5,6,7};

         arr = sagaKaydir(arr);

        System.out.println(Arrays.toString(arr));





    }
    public static int[] sagaKaydir(int[] arr){

        int bosKova = arr[arr.length-1]; // son elementi bos kovaya koyduk

        for (int i = arr.length-2; i >= 0 ; i--) {
            arr[i+1] = arr[i];

        }
        arr[0] =bosKova;

        return arr;
    }




}
