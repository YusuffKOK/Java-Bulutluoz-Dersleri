package ders16_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileSoru {
    public static void main(String[] args) {
        // kullanicidan bir pozitif tamsayi isteyin
        //sayinin tam kare olup olmadigini bulun
        // tam kare ise true degilse false döndürün
        // örnek input : 16 output :4
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir Pozitif tamsayi giriniz :");
        int sayi = scan.nextInt();
        int baslangic = 1;
        int bayrak =0;
        do {
            if (baslangic*baslangic == sayi){

                System.out.println("true");
                bayrak++;
                break;

            }
            baslangic++;

        }while (baslangic*baslangic <= sayi);

        if (bayrak == 0){
            System.out.println("false");
        }



    }
}
