package ders02_DataTurleri_scanner;

public class C01_Variables_primitiveDataTurleri {
    public static void main(String[] args) {
        // Data turleri ikiye ayrılır.Primitive ve Nonprimitive
        //Primitive: boolean , char , float , double , byte , short , int , long

        // Boolean : Mantıksal data sonuçlarını store etmek için kullanılır
        // sadece iki deger barındırır " True / False " . 1 bit yer kaplar.
        boolean deger = true;

        // char : tek bir karakter barındırabilir.içerinde harf, sayı veya özel karakter alabilir.
        // tek tırnak ile kullanılır. 'c' gibi .Hafıza da 16 bit yer kaplar.
        char harf = 'Y';

        // Tamsayı barındıran data turleri
        // byte         8 bit           -2^7=-128 ve 2^7-1=127 arası deger alır.
        // short        16 bit          -2^15=-32768 ve 2^15-1=32767 arası deger alır.
        // int          32 bit          -2^31=-2147483648 ve 2^31-1=2147483647 arası deger alır.
        // long         64 bit          -2^63=-9223372036854755808 ve 2^63-1=-9223372036854755807 arası deger alır.
         byte sayı1 = 38;
         short sayı2 = 3202;
         int sayı3 = 464654646;
         long sayı4 = 425244616;
         // Not: Bir variable için hangi data türünü kullanacagımız uygulamamızın hafıza kullanımı için çok önemlidir.
        // Ondalık sayı barındıran data turleri
        // float 32 bit         ondalık basamak sayısı 6-7 basamak
        //double 64 bit         ondalık basamak sayısı 15-16 basamak
        // Not: Deger ataması yaptıgımızda javanın float ile double ı ayırt edebilmesi için float sayıların yanına
        // f veya F koymamız gerekir.
        float sayı5 =25.45446F;
        double sayı6 = 45.6564644;





    }
}
