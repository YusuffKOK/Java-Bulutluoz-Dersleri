package ders07_NestedIfElse_Statement;

import java.util.Scanner;

public class C02_IfElseIf_Statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Aldınız ürünün adedini giriniz :");
        int adet = scan.nextInt();
        System.out.println("Aldıgınız ürünün liste fiyatını giriniz");
        double fiyat = scan.nextInt();
        System.out.println("Müsteri kartınız var mı ? (EVET yada HAYIR)");
        char kart = scan.next().charAt(0);
        if ((kart == 'E' || kart == 'e') && adet >= 10){
            System.out.println(" % 20 indirim kazandiniz" + " ödemeniz gereken tutar : " + ((adet * fiyat)*0.8));
        } else if ((kart == 'E' || kart == 'e') && adet < 10) {
            System.out.println(" % 15 indirim kazandiniz" + " ödemeniz gereken tutar : " + ((adet * fiyat)*0.85));
        } else if ((kart == 'H' || kart == 'h') && adet >= 10) {
            System.out.println(" % 15 indirim kazandiniz" + " ödemeniz gereken tutar : " + ((adet * fiyat)*0.85));
        }else {
            System.out.println(" % 10 indirim kazandiniz" + " ödemeniz gereken tutar : " + ((adet * fiyat)*0.90));
        }

    }
}
