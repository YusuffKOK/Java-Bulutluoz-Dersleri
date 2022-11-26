package ders09_StringManipulation;

public class C05_length {
    public static void main(String[] args) {
        String str = "Uzunkavaklaraltındayataruyumazoglu";
        System.out.println(str.length()); // harf varmıs.
        // son harf yazdırma
        System.out.println(str.charAt(str.length()-1)); // u harfini yazdırır
        // sondan 3. harfi yazdırma
        System.out.println(str.charAt(str.length()-3));
    }
}
