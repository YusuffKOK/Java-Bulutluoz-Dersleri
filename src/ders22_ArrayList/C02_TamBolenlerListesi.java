package ders22_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_TamBolenlerListesi {
    public static void main(String[] args) {
        // kullanicidan pozitif bir tamsayi alip
        // o tamsayiyi tam bolebilen tum pozitif tamsayilari
        // bir liste olarak bize donduren bir method olusturalim

        int input = 128;

        System.out.println(tamBolenlerListesi(input));
    }
    public static List<Integer> tamBolenlerListesi (int input){

        List<Integer> tamBolenlerlistesi = new ArrayList<>();

        for (int i = 1; i <= input ; i++) {

            if (input % i == 0){
                tamBolenlerlistesi.add(i);
            }
        }
        return tamBolenlerlistesi;


    }


}
