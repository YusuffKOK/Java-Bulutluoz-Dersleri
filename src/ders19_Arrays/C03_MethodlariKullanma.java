package ders19_Arrays;

import ders18_Arrays.C03_ArraysElementleriniArtirma;
import ders18_Arrays.C04_ArraysElementleriToplami;
import ders18_Arrays.C05_ArraydeElemananArama;
import ders18_Arrays.C06_KullaniciyaArrayOlusturma;

import java.util.Arrays;

public class C03_MethodlariKullanma {
    public static void main(String[] args) {

        // verilen bir int arrayin elementlerini 2 artirin

        int[] arr = {3,4,5};

        arr = C03_ArraysElementleriniArtirma.elementleri2Artir(arr);

        System.out.println(Arrays.toString(arr)); // 5 6 7

        // array elementlerini toplayip sonucu yazdirin
        System.out.println(C04_ArraysElementleriToplami.pozitifElementleriTopla(arr));

        // arr array'inde 10 element olarak var mi ?

        C05_ArraydeElemananArama.elemanAra(arr,10);

        // kullanicidan deger alarak bir array olusturun

        int[] yeniArr = C06_KullaniciyaArrayOlusturma.arrayOlustur();

        System.out.println(Arrays.toString(yeniArr));




    }



}
