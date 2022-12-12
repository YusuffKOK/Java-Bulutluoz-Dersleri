package ders16_doWhileLoop;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        // 10,11,12 sayilarini toplayan bir while loop olusturalim
        int sayi =10;
        int toplam =0;

        do {
            toplam+=sayi;
            sayi++;
        }while (sayi <= 12);
        System.out.println(toplam);
        /*
        do while loop un iki avantajı vardır
        1- loop bodysi en az bir kere calisir
        (while loop da baslangic degeri uygun degilse loop body'si calismayabilir)
        2- do while bitis kontrolu loop kadar calisir
        (while loop da bir kere fazla calisirdi)
         */


    }
}
