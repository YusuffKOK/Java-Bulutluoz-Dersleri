package ders07_NestedIfElse_Statement;

import java.util.Scanner;

public class C01_IfElseIf_Statement {
    public static void main(String[] args) {
        // kullanıcıdan kilosunu (kg) ve Boyunu (cm)  isteyip vücut kitle endeksini hesaplayın
        // vke >30 ise obez
        // vke >25 ise kilolu
        // vke >20 ise normal
        // vke <20 ise zayıf yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu giriniz ( cm cinsinden ) : ");
        double boy = scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz ( kg cinsinden )");
        double kilo = scan.nextDouble();
        double vke = kilo / ((boy * boy) / 10000);
        System.out.println("Vücut kitle endeksiniz :" + vke);
        if (vke > 30){
            System.out.println("Obezsiniz.");
        } else if (vke >25 ) {
            System.out.println("kilolusunuz");
        } else if (vke > 20) {
            System.out.println("normalsiniz");
        }else {
            System.out.println("Zayıfsınız");
        }

    }
}
