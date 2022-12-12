package ders15_Overloading_WhileLoops;

public class C01_Overloading {
    public static void main(String[] args) {
        String str = "Java ögrendik, siradaki gelsin";
        System.out.println(str.startsWith("a",3)); // true
        System.out.println(str.startsWith("a")); // false
        /*
        bir class da ayni isimlere sahip fakat farkli signaturelara sahip
        method lar olusturulmasina method overloading denir.
         */
    }
}
