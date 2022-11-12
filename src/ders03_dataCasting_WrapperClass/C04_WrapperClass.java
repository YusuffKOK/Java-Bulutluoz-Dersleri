package ders03_dataCasting_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        int sayi = 20;
        String str = "Java Güzeldir";
        /*
        str.  dediğimiz zaman metodlar gözüküyor ama sayi. dedigimiz zaman metod gözükmüyo
        Primitive data türleri sadece deger barındırır. Hazır metodları yoktur.

        Java ya yapılan talepler sonucunda java primitive data türleri ile bazı hazır metodların kullanılabilmesi
        için Wrapper Classları olusturmustur.
        Wrapper Class primitive data türlerindeki degerleri alırlar ancak methodlarıda vardır
         */
        char krk = 'b';
        Character krkWrapper = 'c';
        System.out.println(Character.isLetter('5'));// false
        System.out.println(Character.isDigit('7')); // true

        String str1 = "123";
        String str2 = "12";
        // str1 ve str2 nin degerlerini matematiksel olarak toplayın
        System.out.println(str1 + str2); // 12312 yazdırır.
        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 135 verir.
        // Integer.parseInt(str1) içine yazılan str rakamlardan oluşuyorsa str i int a çevirir
        // ancak bir karakter bile rakam degilse hata verir.
        System.out.println(Integer.MAX_VALUE); // 2147483647 int max degeri ezberlememize gerek kalmaz.
        System.out.println(Short.MIN_VALUE); // -32768 short min degeri 




    }
}
