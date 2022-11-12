package ders06_IfElse_statement;

import java.util.Scanner;

public class C01_If_Statement {
    public static void main(String[] args) {
        // Kullanıcıdan iki sayı alın
        // Eger birinci sayı 100'den büyükse "ilk sayı 100'den büyük " yazdırın
        // Eger ikinci sayı ciftse "ikinci sayı cift "
        // Eger ilk sayı ikinciden büyükse "ilk sayı daha büyük " yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz :");
        int sayi1 = scan.nextInt();
        System.out.println("ikinci sayiyi giriniz :");
        int sayi2 = scan.nextInt();
        if (sayi1 >= 100){
            System.out.println("ilk sayı 100'den büyük ");
        }
        if (sayi2 % 2 == 0){
            System.out.println("ikinci sayı cift ");
        }
        if (sayi1 > sayi2){
            System.out.println("ilk sayı daha büyük ");
        }






    }
}
