package ders05_concatenation_Operatörler;

public class C03_LogicalMantıksalOperatoler_AND_Operatoru {
    public static void main(String[] args) {
        // And (Ve) Operatörü && , &
        // && operatörü mükemmeliyetcidir.
        int a = 10;
        int b = 15;
        System.out.println(a > 0 && b > 0 ); //true
        System.out.println(a <= b-5 && a > b-8); // true
        boolean c;
        System.out.println(c = 15 >= b && a < 0); // false
        c = a >= b && 3*a < 4*b;
        System.out.println(c); // false
        /* && ve & arasında ki fark sadece hız. && operatoru bir tane bile false görürse sorgulamanın
        geri kalanına gerek duymaz ve cevabı dönderir.
        & operatoru ise sorgulamanın tamamını yapar ondan sonra cevap dönderir.
        */
    }
}
