package ders12_ForLoops;

public class C05_Soru {
    public static void main(String[] args) {
        // kullanıcının verdigi sayinin asal sayi olup olmadıgını bulun
        int sayi = 5805047;

        boolean bayrak = false;

        for (int i = 2 ; i < sayi-1 ; i++) {

            if (sayi % i == 0 ){
                // askimiz bitti
                bayrak = true;
                break;
            }
        }
        if (bayrak){
            System.out.println(" sayi asal degil");
        }else {
            System.out.println(" sayi asal");
        }
    }
}
