package ders11_StringManipulation;

public class C08_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan bir sifre isteyip ve asagıdaki sartları kontrol edin
        // düzeltmesi gereken tüm eksikleri söyleyin
        // eger tüm sartları saglarsa "sifre basari ile kaydedildi" yazdirin
        // ilk harf kucuk harf olmalı
        // son harf rakam olmalı
        // sıfre bosluk icermemeli
        // uzunlugu en az 10 karakter olmali

        String sifre = "nasilsinKardes9";
        int bayrak = 0;

        if ( !(sifre.charAt(0) > 'a' && sifre.charAt(0) < 'z')){
            System.out.println("ilk harf kucuk harf olmalı ");
            bayrak++;
        }
        if (!(sifre.charAt(sifre.length()-1) >= '0' && sifre.charAt(sifre.length()-1) <= '9')){
            System.out.println("son harf rakam olmalı");
            bayrak++;
        }
        if (sifre.contains(" ")){
            System.out.println("sıfre bosluk icermemeli");
            bayrak++;
        }
        if (!(sifre.length() >= 10)){
            System.out.println("uzunlugu en az 10 haneli olmali");
            bayrak++;
        }
        if (bayrak == 0){
            System.out.println("sifre basari ile kaydedildi");
        }




    }
}
