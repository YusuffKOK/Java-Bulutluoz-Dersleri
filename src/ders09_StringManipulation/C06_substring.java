package ders09_StringManipulation;

public class C06_substring {
    public static void main(String[] args) {
        String str = "Java ogren, isi kap";
        System.out.println(str.substring(5));
        System.out.println();
        String sonHArf = str.substring(str.length()-1);
        System.out.println(sonHArf);
        System.out.println(str.substring(str.length()-3).toUpperCase());

    }
}
