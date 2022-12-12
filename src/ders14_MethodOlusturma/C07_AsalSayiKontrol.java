package ders14_MethodOlusturma;

public class C07_AsalSayiKontrol {
    public static void main(String[] args) {
        // kullanicidan main method icerisinde bir pozitif tamsayi alin
        // girilen sayinin asal sayi olup olmadigini kontrol edin
        // sonuc olarak asal sayi veya asal sayi degil seklinde sonuc döndürün
        int sayi = 24;


        asalSayiKontolEt(sayi); // asal degil
        asalSayiKontolEt(23); // asal
        asalSayiKontolEt(2347); // asal

    }
    public static String asalSayiKontolEt (int sayi){
        String sonuc = "";

        for (int i = 2; i < sayi ; i++) {

            if (sayi% i == 0){
                sonuc = "asal degil";
                System.out.println(sonuc);
                break;
            }

            }
            if (!(sonuc.equals("asal degil"))){
                sonuc = "asal";
                System.out.println(sonuc);
            }
            return sonuc;
        }

    }







