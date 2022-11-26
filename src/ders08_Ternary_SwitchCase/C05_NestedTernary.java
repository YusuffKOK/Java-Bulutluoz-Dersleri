package ders08_Ternary_SwitchCase;

public class C05_NestedTernary {
    public static void main(String[] args) {
        // Kompleks islemleri ternary ile yapmak tavsiye edilmez
        /*
        kullanıcıdan bir tam sayı alın
        sayı pozitifse çift sayı veya cift sayi degil seceneklerinden uygun olanı yazdırın
        sayı pozitif degilse 3 basamaklı veya 3 basamaklı degil seceneklerinden uygun olanı yazdırın
         */
        int sayi = 20;
        if (sayi > 0){
            System.out.println(sayi % 2 == 0 ? "cift sayı" : "tek sayı");
        }else {
            System.out.println(sayi < -99 && sayi >-1000 ? "uc basamaklı" : "uc basamaklı degil" );
        }

    }
}
