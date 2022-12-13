package ders18_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C06_KullaniciyaArrayOlusturma {
    public static void main(String[] args) {
        // kullanicidan array'in boyutunu ve elementlerini alip arrayi olusturan
        // ve bize döndüren bir method olusturun

        int[] kullaniciArrayi = arrayOlustur();

        System.out.println(Arrays.toString(kullaniciArrayi));


    }
    public static int[] arrayOlustur(){

        Scanner scan =new Scanner(System.in);

        System.out.println("olusturulacak array'in boyutunu giriniz :");

        int lenght = scan.nextInt();

        int[] kullaniciArrayi = new int[lenght];

        for (int i = 0; i <lenght ; i++) {

            System.out.println("array'e eklenecek bir sayi giriniz :");

            kullaniciArrayi[i] = scan.nextInt();

        }

        return kullaniciArrayi;

    }




}
