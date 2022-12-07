package ders12_ForLoops;

public class C04_rakamlarToplamı {
    public static void main(String[] args) {

        // kullanıcının verdigi sayinin rakamlar toplamını bulalım

        int sayi =123456789;
        String sayiStr = "" + sayi;

        int toplam =0;

        int birlerBasamagi = 0;

        for (int i = 1; i <= sayiStr.length(); i++ ) {

            birlerBasamagi =sayi % 10;
            toplam = toplam +birlerBasamagi;
            sayi = sayi /10;

        }

        System.out.println(toplam);



    }
}
