package ders21_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_ArraydenTekrarlariSilme {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // bu soruyu array'le yapmak cok zor
        // bunun yerine bu array'in elemanlarini tek tek inceleyip
        // tekrarsiz olanlari bir list'e atalim
        // en son o list'teki elementleri iceren bir array olusturup
        // yeni array'i eski array'e deger olarak atayalim

        List<Integer> tekrarsizSayilar = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {

            if (!(tekrarsizSayilar.contains(arr[i]))){

                tekrarsizSayilar.add(arr[i]);

            }

        }

        System.out.println("tekrarsiz sayilar :" +tekrarsizSayilar); // tekrarsiz sayilar :[1, 2, 4, 3, 5]
        // en son o list'deki elementleir array'e atamak gerekir
        // bunun icin once array'e yeni ve bos bir array degeri atayip
        // sonra list'deki elementleri array'e tasiyalim

        arr = new int[tekrarsizSayilar.size()];

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = tekrarsizSayilar.get(i);

        }

        System.out.println("yeni array'imiz : " + Arrays.toString(arr)); // yeni array'imiz : [1, 2, 4, 3, 5]


    }
}
