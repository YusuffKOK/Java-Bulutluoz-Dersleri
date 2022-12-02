package ders11_StringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {
        String str ="";
        // str ye deger atanmıştır
        System.out.println(str);// hiçlik yazdirir.
        System.out.println(str.concat("Java")); // Java

        String str2;
        // str2 olusturuldu ama deger atanmadı
        // System.out.println(str2); str2 ye deger atanmadıgı icin yazdirilamaz CTE verir

        // System.out.println(str2.concat("Java")); deger atanmadıgı icin metodlarda da kullanılamaz
        str2 = "Java Candır";
        System.out.println(str2);
        System.out.println(str2.concat(" Gerisi Heyacandır"));

        String str3 =null; // str3 e deger atanmamıstır
                            // null pointer ile java ya deger atamadıgımızın farkında oldugunu soyluyoruz
        System.out.println(str3); // null isaretini yazdirir

       // System.out.println(str3.concat("Java")); // NullPointerException hatası verir.
        System.out.println(str3 + "java");// nulljava yazdirir.
        // metod kullanamayız




    }
}
