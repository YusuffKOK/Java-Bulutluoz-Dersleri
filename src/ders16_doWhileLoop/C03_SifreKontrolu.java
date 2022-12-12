package ders16_doWhileLoop;

import java.util.Scanner;

public class C03_SifreKontrolu {
    public static void main(String[] args) {
        /*
        kullanicidan bir sifre girmesini isteyin.Girilen sifreyi asagidaki sartlara göre komntrol edin
        ve sifredeki hatalari yazdirin
        kullanici gecerli bir sifre girinceye kadar bu isleme devam edin ve gerli bir sifre girdiginde
        "sifrenin Basariyla Kaydedilmistir." yazdirin
        -sifre kücük harf icermeli
        -sifre büyük harf icermeli
        -sifre özel karakter icermelidir
        -sifre en az 8 karakter olmalidir
         */
        Scanner scan = new Scanner(System.in);
        String sifre;
        int bayrak=0;
        int sayac=0;
        String ozelKarakterler = "@!$%^&*()_-+=?/<.>,'~#";

        do {
            System.out.println("Lütfen sifrenizi giriniz :");
            sifre= scan.nextLine();
            sayac=0;
            // tüm hataları söylemek istiyorsak bagımsız if cumleleri kullanmaliyiz

            // sifre kücük harf icermelidir
            // bunun icin for loop kullanmalıyız
            // bir tane kücük harf bulmam yeterli
            for (int i = 0; i < sifre.length() ; i++) {
                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z'){
                    bayrak++;
                    sayac++;
                    break;
                }
            }
            // bayrak ==0 ise kucuk harf yoktur, yani bir hata var bunu yazdiralim
            if (bayrak == 0){
                System.out.println("sifre kücük harf icermeli");
            }
            //sifre büyük harf icermelidir
            bayrak =0;
            for (int i = 0; i < sifre.length() ; i++) {
                if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z'){
                    bayrak++;
                    sayac++;
                    break;
                }
            }
            // bayrak ==0 ise büyük harf yoktur, yani bir hata var bunu yazdiralim
            if (bayrak == 0){
                System.out.println("sifre büyük harf icermeli");
            }
            // sifre özel karakter icermeli
            bayrak=0;
            for (int i = 0; i < sifre.length() ; i++) {
                if (ozelKarakterler.contains(sifre.substring(i,(i+1)))){
                bayrak++;
                sayac++;
                break;
                }
            }
            if (bayrak == 0){
                System.out.println("sifre özel karakter icermeli");
            }
            if (sifre.length()<8){
                System.out.println("sifre en az 8 karakter olmali");
            }else {
                sayac++;
            }

            }while (sayac != 4);
        System.out.println("sifreniz basari ile kaydedildi");










        }
























    }