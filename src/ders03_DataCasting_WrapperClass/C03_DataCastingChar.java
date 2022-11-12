package ders03_DataCasting_WrapperClass;

import java.util.Scanner;

public class C03_DataCastingChar {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 97 + 98 = 195
        // kullanıcıdan bir karakter alınız
        // o karakterden sonra gelen 3 karakteri yazdırın
        // örnek input : a , output : bcd

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz :");
        char karakter = scan.next().charAt(0);
        System.out.println((karakter+1) + (karakter+2) + (karakter+3)); // a degeri girilince 297 verir
        System.out.println("" + (karakter+1) + (karakter+2) + (karakter+3)); // 9899100 şeklinde verir
        System.out.println("" + (char)(karakter+1) + (char)(karakter+2) + (char)(karakter+3)); // bcd verir.





    }
}
