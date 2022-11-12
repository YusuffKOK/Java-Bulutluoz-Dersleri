package ders02_DataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner_Sorular_2 {
    public static void main(String[] args) {
        // kullanıcıdan isim soyisim  ve yasını alıp aşagıdaki formatta yazdırın
        // isminiz : John
        // soyisminiz : Dere
        // yasınız : 44
        // Kaydınız basarı ile alınmıstır
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz :");
        String isim = scan.next();
        System.out.println("Lütfen soyadınızı giriniz :");
        String soyİsim = scan.next();
        System.out.println("Lütfen yasınızı giriniz :");
        int yas = scan.nextInt();
        System.out.println("Adınız : " + isim + "\nSoyadınız : " + soyİsim + "\nYasınız : " + yas
                + "\nKaydınız basarı ile alınmıstır");

    }
}
