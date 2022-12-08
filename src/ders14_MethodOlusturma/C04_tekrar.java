package ders14_MethodOlusturma;

public class C04_tekrar {
    public static void main(String[] args) {
        int a = 10;
        int b= 20 ;

        // bu iki sayinin carpimini yeni kod yazmadan konsola yazdirin
        System.out.println(C01_carpim.carpimMethodu(a, b));

        String c = "Nasil";
        String d = "yani";
        // Bu iki String i aralarında bir bosluk olacak sekilde birlestirin

        System.out.println(C02_StringConcate.birlestirMethodu(c, d));

        String e = "Gecip giden sey saat degil Hayatinizdir";
        // e Stringini tersten yazdirin

        System.out.println(C03_StringTerseCevirme.terstenCumle(e));

    }
}
