package ders10_StringManipulation;

public class C01_Concetanation {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Güzeldir";
        Boolean bl = true;
        int sayi = 20;
        double dbl = 3.54;
        System.out.println(str1+bl+sayi);
       // System.out.println(bl+sayi); String strongdur.
        // concat() metodu sadece String variable'ları birleştirmek için kullanılır.
        System.out.println(str1.concat(str2)); // + isleminden bir farkı yok hatta eksisi vardır.


    }
}
