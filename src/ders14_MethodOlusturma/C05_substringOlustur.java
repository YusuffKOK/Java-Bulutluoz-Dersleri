package ders14_MethodOlusturma;

public class C05_substringOlustur {
    public static void main(String[] args) {
        /* kullanicidan input olarak verilen bir String
           baslangic ve bitis indexlerine göre baslangic indexi dahil bitis index i haric olacak şekilde
           aradaki harfleri yazdiran bir method olusturun
           - kullanici baslangic degeri olarak bitis degerinden daha büyük bir sayi girirse hata mesaji verin
           - kullanicida str da olan indexden daha büyük bir index girerse hata mesaji verin
        */
        String input = "Java ne kadar güzel";
        int basIndexi = 5;
        int bitIndexi = 7;
        kendiSubstringMethodumuz(input,basIndexi,bitIndexi); // ne yazdirir
        kendiSubstringMethodumuz("Java",1,3); // av
        kendiSubstringMethodumuz("deneme",6,3); // Baslangic indexi bitis indexinden büyük olamaz
        kendiSubstringMethodumuz("java",6,8); // bitis indexi String in sinirlari disinda

    }
    public static void kendiSubstringMethodumuz(String input ,int basIndexi ,int bitIndexi){

        if (basIndexi > bitIndexi){
            System.out.println("Baslangic indexi bitis indexinden büyük olamaz");
        } else if (bitIndexi >= input.length()) {
            System.out.println("bitis indexi String in sinirlari disinda");
        }else {
            for (int i = basIndexi; i < bitIndexi ; i++) {
                System.out.print(input.charAt(i));
            }
            System.out.println();
        }


    }





}
