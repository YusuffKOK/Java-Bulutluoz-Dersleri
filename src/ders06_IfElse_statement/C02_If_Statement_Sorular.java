package ders06_IfElse_statement;

import java.util.Scanner;

public class C02_If_Statement_Sorular {
    public static void main(String[] args) {
        // Kullanıcıdan bir harf alın, Harf ile başlayan bir ay varsa yazdırın
        // Kullanıcı o veya O yazdıgında output Ocak olsun
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz :");
        char ilkHarf = scan.next().charAt(0);
        if (ilkHarf == 'o' || ilkHarf == 'O'){
            System.out.println("Ocak");
        }
        if (ilkHarf == 's' || ilkHarf == 'S'){
            System.out.println("Subat");
        }
        if (ilkHarf == 'm' || ilkHarf == 'M'){
            System.out.println("Mart veya Mayıs");
        }
        if (ilkHarf == 'n' || ilkHarf == 'N'){
            System.out.println("Nisan");
        }
        if (ilkHarf == 'h' || ilkHarf == 'H'){
            System.out.println("Haziran");
        }
        if (ilkHarf == 't' || ilkHarf == 'T'){
            System.out.println("Temmuz");
        } if (ilkHarf == 'a' || ilkHarf == 'A'){
            System.out.println("Agustos veya Aralık");
        } if (ilkHarf == 'e' || ilkHarf == 'E'){
            System.out.println("Eylül veya Ekim");
        } if (ilkHarf == 'k' || ilkHarf == 'K'){
            System.out.println("Kasım");
        }





    }
}
