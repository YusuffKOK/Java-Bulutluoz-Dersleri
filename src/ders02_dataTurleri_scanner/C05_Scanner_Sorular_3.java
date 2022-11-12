package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner_Sorular_3 {
    public static void main(String[] args) {
        // Kullanıcıdan iki deger alıp bu degerlerin yerini degiştirme (Swap işlemi)
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen ilk tam sayıyı giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("lütfen ikinci tam sayıyı giriniz");
        int sayi2 = scan.nextInt();
        int sayıDegisim ;
        sayıDegisim = sayi1 ;
        sayi1 = sayi2;
        sayi2 = sayıDegisim;
        System.out.println("Birinci sayi : " + sayi1 + "\nikinci sayi : " + sayi2);

        // Ücüncü bir variable kullanmadan swap işlemi

        System.out.println("lütfen birinci tam sayıyı giriniz");
        int sayi3 = scan.nextInt();
        System.out.println("lütfen ikinci tam sayıyı giriniz");
        int sayi4 = scan.nextInt();
        sayi3 = sayi3 + sayi4;
        sayi4 = sayi3 - sayi4;
        sayi3 = sayi3 - sayi4;
        System.out.println("Birinci sayi : " + sayi3 + "\nikinci sayi : " + sayi4);






    }
}
