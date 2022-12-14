package ders20_MultiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C09_ArrayList {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        // 1- List primitive data turu kabul etmez
        // 2- List bir interface oldugu icin direk obje olusturulamaz
        //      onun yerine sag tarafa ArrayList<>() yazariz

        sayilar.add(5);
        sayilar.add(4);

        System.out.println(sayilar);// [5, 4]


    }
}
