package ders13_nestedForLoops_metodOlusturma;

import java.util.Scanner;

public class C07_methodOlusturma {
    public static void main(String[] args) {

        // method call yapmazsak calismaz
        // baska classlarda kullanacaksak önce class ismini yazip sonra methodu yazariz
        // C08_methodOlusturma.isteToplaYazdir();

        isteToplaYazdir();

    }
        //kullanıcıdan iki sayi alip bunlarin toplamini yazdir
        public static void isteToplaYazdir (){
            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen iki sayi giriniz");

            double sayi1 = scan.nextDouble();
            double sayi2 = scan.nextDouble();

            System.out.println("girilen sayilarin toplami :" + (sayi1 +sayi2));
        }

}
