package ders04_matematikselislemler_incrementDecrement;

import java.util.Scanner;

public class C02_RakamlarToplamı {
    public static void main(String[] args) {
        // modulus islemi % bir bölme isleminde bize kalanı verir
        // Kullanıcıdan dört basamaklı bir pozitif bir tamsayı alıp rakamları toplamını bulalım
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dört basamaklı bir pozitif bir tamsayı giriniz :");
        int sayi = scan.nextInt();
        int rakamlarToplamı = 0;
        rakamlarToplamı = sayi % 10 ; // birler basamagı
        sayi = sayi / 10;
        rakamlarToplamı = rakamlarToplamı+ (sayi % 10) ; // onlar basamagı
        sayi = sayi / 10;
        rakamlarToplamı = rakamlarToplamı+ (sayi % 10) ; // yüzler basamagı
        sayi = sayi / 10;
        rakamlarToplamı = rakamlarToplamı+sayi;
        System.out.println(rakamlarToplamı);



    }
}
