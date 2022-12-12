package ders15_Overloading_WhileLoops;

import java.util.Scanner;

public class C05_whileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan toplamak üzere sayi alin
        sayilarin toplami 500' e esit veya gecerse

        girilen sayi adedi
        girilen sayilarin toplami ve
        "bu kadar yeter yazdirin "
         */
        Scanner scan = new Scanner(System.in);
        int girilenSayi = 0;
        int sayac =0;
        int toplam=0;
        while (toplam < 500){
            System.out.println("Lütfen toplamak icin tamsayi giriniz ");
            girilenSayi = scan.nextInt();

            toplam += girilenSayi;
            sayac++;


        }
        System.out.println("girilen sayi adedi " + sayac +
                            "\ngirilen sayilarin toplami " + toplam + "\nbu kadar yeter yazdirin ");



    }
}
