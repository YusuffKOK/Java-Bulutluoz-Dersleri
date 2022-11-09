package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int sayı = scan.nextInt();
        System.out.println("Lütfen adınızı giriniz :");
        String isim = scan.next();
        System.out.println(isim.toUpperCase());




    }
}
