package ders15_Overloading_WhileLoops;

public class C08_rakamlarToplamı {
    public static void main(String[] args) {
        // while loop kullanilarak kullanicidan alinan sayinin rakamlar toplamını bulun
        int sayi =14531111;

        int birlerBasamagi =0;
        int rakamlarToplami =0;

        while (sayi !=0){
            birlerBasamagi = sayi % 10;
            rakamlarToplami += birlerBasamagi;
            sayi /= 10 ;
        }
        System.out.println(rakamlarToplami);

    }
}
