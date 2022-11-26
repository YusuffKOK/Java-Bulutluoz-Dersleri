package ders09_StringManipulation;

public class C02_equals {
    public static void main(String[] args) {
        String str1 = "Yusuf";
        String str2 = "YUSUF";
        String str3 = new String("Yusuf");
        String str4 = "Yusuf";
        System.out.println(str1 == str2); // false
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        // NOT: ==  Stringleri karsılastırırken bekledigimiz sonucu vermeyebilir.
        // Stringleri karsılastırırken == yerine equals() kullanılır.
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true




    }
}
