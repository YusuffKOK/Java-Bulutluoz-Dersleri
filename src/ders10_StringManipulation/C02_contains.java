package ders10_StringManipulation;

public class C02_contains {
    public static void main(String[] args) {
        String str = "Java ile kodlama cok zevkli";
        System.out.println(str.contains("cok")); // true
        System.out.println(str.contains("odla")); // true
        System.out.println(str.contains("a")); // true
        //  System.out.println(str.contains('a')); parametre olarak char kabul etmez
        // CharSequence :char dizisi
        System.out.println("java"); // false  caseSensitive vardır.
        String str2 = "Java";
        System.out.println(str.contains(str2)); // true
        String str3 = "234 Yakup Efe";
        System.out.println(str3.contains("2"));


    }
}
