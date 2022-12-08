package ders14_MethodOlusturma;

import java.util.Scanner;

public class C01_carpim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayi giriniz :");
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();

        // method call yapacaz
        System.out.println(carpimMethodu(sayi1,sayi2));

        double carpimSonucu = carpimMethodu(6,2); // bir variable a atadik

        System.out.println(carpimSonucu);

    }
    public static double carpimMethodu(double sayi1 , double sayi2){
        System.out.println("carpim methodu calisti ");
        return sayi1 * sayi2 ;
    }




}
