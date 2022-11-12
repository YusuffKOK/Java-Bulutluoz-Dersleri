package ders06_IfElse_statement;

import java.util.Scanner;

public class C03_IfElse_Statement {
    public static void main(String[] args) {
        /*
        Kullanıcıdan cinsiyetini ve yasını alın, Kadın 60 yas üzeri ,Erkek 65 yas üzeri emekli olabilir
        Cinsiyet ve yasını dikkate alarak "Emekli olabilirsiniz " veya "Emekli olmanıza ... yıl daha var "
        yazdırın
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz (Kadın veya Erkek) :");
        char cinsiyet = scan.next().charAt(0);
        System.out.println("Lütfen yasınızı giriniz :");
        int yas = scan.nextInt();
        if (cinsiyet == 'E' && yas >= 65) {
            System.out.println("Emekli olabilirsiniz Beyefendi.");
        } else if (cinsiyet == 'E' && yas < 65) {
            System.out.println("Emekli olmanıza " + (65 - yas) + " daha yıl var");
        } else if (cinsiyet == 'K' && yas >= 60) {
            System.out.println("Emekli olabilirsiniz Hanımefendi.");
        } else if (cinsiyet == 'K' && yas < 60) {
            System.out.println("Emekli olmanıza " + (60 - yas) + " daha yıl var");
        }else {
            System.out.println("Yanlıs giris yaptınız");
        }
    }

    }

