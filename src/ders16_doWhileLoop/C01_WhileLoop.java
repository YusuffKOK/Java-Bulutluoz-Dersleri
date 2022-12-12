package ders16_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        // 10,11,12 sayilarini toplayan bir while loop olusturalim
        int sayi =10;
        int toplam =0;

        while (sayi<=12){
            toplam += sayi;

            sayi++;

        }
        // while loop da önce kontroll yapilir sonra islem yapilir

        /*
        while loop da iki problem olusabilir
        1- önce degeri kontrol edip sonra islem yaptigimizdan
        body de bir kere daha kontrol etmesi gerekebilir
        2- yapilan islem sayisindan bir fazla bitis sarti kontrol edilir
        3-while loop öncesi degerleri kontrol edecegimiz bir varible olusturuyorsak
        ona yapacagımız atamayı dikkatli yapmamiz gerekir
        yanlis deger ataması while loop un calismamasina neden olabilir
         */



    }
}
