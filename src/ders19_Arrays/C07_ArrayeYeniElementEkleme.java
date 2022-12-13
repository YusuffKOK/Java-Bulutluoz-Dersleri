package ders19_Arrays;

import java.util.Arrays;

public class C07_ArrayeYeniElementEkleme {
    public static void main(String[] args) {

        int[] arr = {2,4,6};

        // bu arr'e 4. element olarak 8 i ekleyelim

        /*
        var olan bir array'e yeni eleman eklenemez
        ama yeni bir deger atanabilir

        once int[] arr2 ={2,4,6,8} seklinde yenibir array olusturup
        sonra arr2 degerini arr'ye atayabilirim
         */

        // yeni bir array olusturalim
        // arr2 'e konulacak datalarin turu
        //uzunlugu ise eski array'in uzunlugunun bir fazlasi

        int[] arr2 = new int[arr.length+1]; // [0,0,0,0]

        for (int i = 0; i < arr.length ; i++) {

            arr2[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr2)); // [2, 4, 6, 0]

        arr2[arr2.length-1] = 8;

        System.out.println(Arrays.toString(arr2)); // [2, 4, 6, 8]

        // arr degerine yeni deger olarak olusturdugumuz arr2 y, atayacagiz

        arr = arr2;

        System.out.println("arr'nin son hali :"+ Arrays.toString(arr));




    }
}
