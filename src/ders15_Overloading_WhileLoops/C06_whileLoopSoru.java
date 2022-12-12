package ders15_Overloading_WhileLoops;

import java.util.Scanner;

public class C06_whileLoopSoru {
    public static void main(String[] args) {
        /*
        kullanicidan sifre isteyin
        sartlari saglamayan sifrelelri hatalari yazdirip yeni sifre girmesini isteyin
        gecerli bir sifre yazilincaya kadar bu islemi devam ettirin
        gecerli bir sifre yazilinca sifreniz basari ile kaydedildi yazin
       -sifrenin ilk harf kücük olmali
       -sifrenin son karakteri sayi olmali
       - sifre en az 8 karakter olmali
         */
        Scanner scan =new Scanner(System.in);
        boolean sifreDogruMu =false;
        String sifre ="";
        char ilkHarf ;
        char sonHarf ;
        int bayrak =0;

        while (!sifreDogruMu){
            System.out.println("Lütfen sifre giriniz :");
            sifre = scan.nextLine();
            ilkHarf =sifre.charAt(0);
            sonHarf =sifre.charAt(sifre.length()-1);
            bayrak =0;

            if (ilkHarf< 'a' || ilkHarf > 'z'){
                System.out.println("ilk karakter kücük harf olmali");
                bayrak++;
            }
            if (sonHarf < '0' || sonHarf > '9') {
                System.out.println("son karakter rakam olmali");
                bayrak++;
            }
            if (sifre.length()<8){
                System.out.println("sifre en az 8 karekter olmali");
                bayrak++;
            }
            if (bayrak == 0){
                System.out.println("sifre basari ile kaydedildi");
                sifreDogruMu =true;
            }


        }






    }
}
