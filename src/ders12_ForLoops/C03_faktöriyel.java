package ders12_ForLoops;

import java.util.Scanner;

public class C03_faktöriyel {
    public static void main(String[] args) {
        // kullanicinin verdigi sayinin faktöriyelini bulalim
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir pozitif bir tam sayi giriniz :");
        int sayi = scan.nextInt();
        int faktoriyel =1;
        for (int i = sayi; i >= 1 ; i--) {
            faktoriyel = faktoriyel * i;

        }
        System.out.println(faktoriyel);

        // 1 den 100 e kadar olan sayilari toplayın
        System.out.println(" ");
        int toplam = 0 ;
        for (int i = 1; i <=100 ; i++) {
            toplam =toplam + i;
        }
        System.out.println(toplam);






    }
}
