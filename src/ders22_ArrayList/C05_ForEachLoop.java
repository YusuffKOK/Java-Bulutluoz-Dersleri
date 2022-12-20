package ders22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_ForEachLoop {
    public static void main(String[] args) {
        /*
        verilen bir String array'deki herbir elementi kontrol edip
        Kelimenin uzunlugu cift sayi ise ilk yarisini
        Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        Yeni bir list'e ekleyip yazdirin
         */

        String [] arr = {"Sümeyra","Mehmet","Ekrem","Yilmaz","Aysenur"};
        List<String> yeniList = new ArrayList<>();

        for (String each: arr
             ) {
            if (each.length() % 2 == 0) { // uzunlugu cift

                yeniList.add(each.substring(0,each.length() / 2));

            }else { // tek ise

                yeniList.add(each.substring((each.length()-1) / 2 ));

            }
        }

        System.out.println(yeniList);

    }
}
