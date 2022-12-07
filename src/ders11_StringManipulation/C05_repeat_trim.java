package ders11_StringManipulation;

public class C05_repeat_trim {
    public static void main(String[] args) {
        String str = "Java Güzeldir ";
        System.out.println(str.repeat(4));

        str = "     Java guzeldir    ";
        System.out.println(str.length()); // 22
        str = str.trim();
        System.out.println(str); //Java guzeldir
        System.out.println(str.length()); // 13



    }
}
