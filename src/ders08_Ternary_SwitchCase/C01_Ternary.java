package ders08_Ternary_SwitchCase;

import java.util.Scanner;

public class C01_Ternary {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı alın
        // sayi pozitif ise 2 katını yazdırın
        // sayi pozitif degilse 10 ekleyip yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz :");
        double sayi = scan.nextDouble();
        System.out.println(sayi % 2 == 0 ? sayi * 2 : sayi +10);

    }
}
