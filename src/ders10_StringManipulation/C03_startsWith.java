package ders10_StringManipulation;

public class C03_startsWith {
    public static void main(String[] args) {
        String str = "manti acarken java ogrenilmez";
        System.out.println(str.startsWith("Manti")); // false
        System.out.println(str.startsWith("m")); // true
        System.out.println(str.startsWith("manti acarken java ogrenilmez")); // true
        System.out.println(str.startsWith("")); // true bir String hiclikle baslar. hiclikle biter.
        System.out.println(str.startsWith("acarken",6)); // 6.index sonrası acarkenle mi basliyo
        System.out.println(str.startsWith("manti",0)); // true
        str.startsWith("java",10); // false
    }
}
