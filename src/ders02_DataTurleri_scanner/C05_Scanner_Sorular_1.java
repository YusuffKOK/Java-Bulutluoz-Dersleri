package ders02_DataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner_Sorular_1 {
    public static void main(String[] args) {
        // kullanıcıdan bir double birde int sayı alıp bunların toplamını ve çarpımı yazdırınız
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir ondalıklı sayı giriniz :");
        double sayı1 = scan.nextDouble();
        System.out.println("Lütfen bir tamsayı giriniz :");
        int sayı2 = scan.nextInt();
        double sayıToplam = (sayı1 + sayı2) ;
        double sayıCarpım = (sayı1*sayı2);
        System.out.println("Sayıların Toplamı :" + sayıToplam);
        System.out.println("Sayıların Carpımı :" + sayıCarpım);





    }
}
