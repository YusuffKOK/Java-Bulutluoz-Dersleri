package ders15_Overloading_WhileLoops;

import java.util.Scanner;

public class C04_whileLoop {
    public static void main(String[] args) {
        /*
         kullanicidan toplanılmak üzere  tam sayilar alin
         kullanici 0 a basarsa sayi alma islemini bitirin
         -kullanicinin kac sayi girdigini
         - bu sayilarin toplamini yazdirin
         */
        Scanner scan = new Scanner(System.in);
        int girilenSayi =5; // verilen ilk deger bu soru icin 0 olmamalı
                            // cunku 0 loop u bitirmek icin kullanilacak
        int sayac = 0;
        int toplam =0;

        while (girilenSayi !=0){
            System.out.println("Lütfen toplamak icin tamsayi giriniz " +
                    "\n Bitirmek icin 0 a basin");
            girilenSayi = scan.nextInt();

            if (girilenSayi !=0){
                sayac++;
                toplam= toplam+girilenSayi;
            }
        }
        System.out.println("Girilen " + sayac + " adet sayinin toplami: " + toplam );


    }
}
