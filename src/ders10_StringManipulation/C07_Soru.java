package ders10_StringManipulation;

import java.util.Scanner;

public class C07_Soru {
    public static void main(String[] args) {
        /*
        kullanıcıdan bir cumle ve bir metin alin
        cumlede metnin durumuna gore
        1-cumle metni icermiyor
        2-cumle metni 1 kere iceriyor
        3-cumle metni birden fazla iceriyor
        seceneklerinden uygun olanı yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("Lütfen bir metin giriniz");
        String metin = scan.nextLine();
        if (!cumle.contains(metin)){
            System.out.println("cumle metni icermiyor");
        }else {
            int ilkIndex = cumle.indexOf(metin);
            int ikinciIndex = cumle.indexOf(metin,ilkIndex+1);
            if (ikinciIndex == -1) {
                System.out.println("cumle metni 1 kere iceriyor");
            }else {
                System.out.println("cumle metni birden fazla iceriyor");
            }
        }










    }
}
