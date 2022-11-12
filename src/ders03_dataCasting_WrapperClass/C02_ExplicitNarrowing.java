package ders03_dataCasting_WrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {
        /*
        geniş data türündeki degeri
        dar data türündeki bir variable a atamak isterseniz
        Java sorumlulugu almamızı ister

        Bu sorumlulugu almak icin
        cast edecegimiz degerin önüne () içerisinde
        cast etmek istedigimiz data türü yazılır
         */
        double dbl = 20;
        short shr = (short) dbl;
        System.out.println(shr);

        double sayi1 = 23.5;
        int sayi2 = (int) sayi1; // Ancak burada data kayıpları olabilir.
        // double dan int gecerken virgülden sonrası silinir.
        // veya başkalaşım olabilir. int i byte çevirecek olursak tekrar tekrar başa döner
        System.out.println(sayi2);

        sayi2 = 538 ;
        byte a = (byte) sayi2 ;
        System.out.println(a);



    }
}
