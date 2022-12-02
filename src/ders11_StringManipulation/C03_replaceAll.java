package ders11_StringManipulation;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str = "J1ava2 G9uzel5dir8";
        // str daki sayilari silip Java Guzeldir haline
        /*
        Regex (regular expressions)
        \\s space           \\S space olmayan hersey
        \\s+ yanyana birden fazla space
        \\d digit           \\D digit olamayan
        \\w harf veya rakam \\W harf veya rakam olamayan hersey
         */

        System.out.println(str.replaceAll("\\d",""));// Java Guzeldir

        System.out.println(str.replaceAll("\\D",""));// 12958

        String s1 = "ilk ürün fiyatı : 1250 tl";
        String s2 = "ikinci ürün fiyatı : 1500 tl";
        // iki ürünün fiyatını toplayın

        s1 = s1.replaceAll("\\D",""); // 1250
        s2 = s2.replaceAll("\\D",""); // 1500
        System.out.println(s1 + s2); // 12501500 yazdırır

        System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2)); // 2750



    }
}
