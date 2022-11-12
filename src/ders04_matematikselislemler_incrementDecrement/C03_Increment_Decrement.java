package ders04_matematikselislemler_incrementDecrement;

public class C03_Increment_Decrement {
    public static void main(String[] args) {
        // Javada deger artırma üc farklı sekilde olur. toplama ve carpma
        int sayi1 = 10;
        sayi1 = sayi1 + 7;
        System.out.println(sayi1);

        int sayi2 = 20;
        sayi2 *=3;
        System.out.println(sayi2);

        int sayi3 = 5;
        sayi3 ++;
        System.out.println(sayi3);
        // aynı sekilde deger azaltmada 3 farklı sekilde olur. cıkarma islemi
        int sayi4 = 10;
        sayi4 = sayi4 - 7;
        System.out.println(sayi4);

        int sayi5 = 20;
        sayi2 -=3;
        System.out.println(sayi5);

        int sayi6 = 5;
        sayi3 --;
        System.out.println(sayi6);
        // sayi++; postincrement   ++sayi;preincrement
        int x =3;
        int y = 2 * ++x; // preincrement önce artır sonra islem yap
        int z = 5 + y--; // postincrement önce islem yap sonra artır

        System.out.println(x +" " + y + " " + z);










    }
}
