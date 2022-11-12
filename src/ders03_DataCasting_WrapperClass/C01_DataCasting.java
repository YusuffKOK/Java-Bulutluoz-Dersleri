package ders03_DataCasting_WrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {
        // Her data türü birbirine çevrilemez
        /*
        Benzer özelliklerdeki data türleri birbirine kolayca çevrilebilirken bazı cating işlemleri için
        extra kod yazmamız gerekir. Bazı casting işlemleri ise imkansızdır.

        int sayi = "Yusuf KöK";     String isim = "Afshar";
        String str = fasle ;        int sayi1 = isim;

        NOT : Java da bir kodun altı kırmızı çizgili oluyorsa orada javanın çözemedigi bir sorun vardır.
         o sorunu çözmediginiz takdirde java çalısmayacaktır.
         sadece o class degil diger classlarda çalısmaz
         */
        double s = 20;
        int sayi = 15;
        long ln = sayi;
        // İmplicit Data Casting
        /*
        daha kücük kapsamlı bir data türündeki degeri daha geniş kapsamlı bir data türündeki variable a
        atama yapmak istedigimizde java bunu otomatik olarak yapacaktır.
        byte < short < int < long< float < double
         */
        short sh = 23;
        int a = sh;
        long b = a;
        double c = sh;
        /*
        ama tersini yapmak isterseniz
        büyük data türündeki bir degeri kücük data türündeki bir variable atamak isterseniz
        Java bunu kabul etmez
         */
        double dbl = 20;
       // int sayi2 = dbl; bunu kabul etmez.




    }
}
