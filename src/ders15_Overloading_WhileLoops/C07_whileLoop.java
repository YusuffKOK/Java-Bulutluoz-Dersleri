package ders15_Overloading_WhileLoops;

public class C07_whileLoop {
    public static void main(String[] args) {
        // kullanicidan bir sayi ve hesaplamak iistediği ussunu isteyin
        // while loop kullanarak verilen sayinin ussunu hesaplayip yazdiran bir method olusturun
        int sayi = 6;
        int us = 3;
        usHesapla(sayi,us);

    }
    public static void usHesapla(int sayi , int us){
        int sonuc =1;

        while (!(us == 0)){
            sonuc *= sayi;
            us--;

        }
        System.out.println(sonuc);






    }






}
