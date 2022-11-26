package ders09_StringManipulation;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Afsharbey ";
        String str2 = "AfsharBey ";
        String str3 = "AFSHARBEY ";
        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); // true
        // Case sensitive iptal ediyo kücük büyük harfe dikkat etmiyo
    }
}
