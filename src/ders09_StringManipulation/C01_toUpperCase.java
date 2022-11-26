package ders09_StringManipulation;

public class C01_toUpperCase {
    public static void main(String[] args) {
        String str = "Java Mutluluktur";
        System.out.println(str.toUpperCase()); // JAVA MUTLULUKTUR
        System.out.println(str);

        // Kalıcı olarak degistirmek icin atama yapmamız lazım

        str = str.toUpperCase();
        System.out.println(str);

        String str2 = "Necip Fazıl KISAKÜREK";
        System.out.println(str2.toLowerCase());
        str2 = str2.toLowerCase();
        System.out.println(str2);



    }
}
