package ders21_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08_KullaniciyaListOlusturma {
    public static void main(String[] args) {

        // kullanicidan istedigi kadar isim alip,
        // Q ya bastiginda girdigi isimleri bize liste olarak donduren bir method olusturun

        System.out.println(listeOlustur());


    }
    public static List<String> listeOlustur(){

        List<String> isimler = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        String girilenIsim = "";

        while (!girilenIsim.equalsIgnoreCase("q")){

            System.out.println("Lütfen listeye eklemek icin isim giriniz: " +
                    "\n bitirmek ve listeyi görmek icin Q harfine basiniz");
            girilenIsim = scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){

                isimler.add(girilenIsim);
            }


        }

        return isimler;

    }

}
