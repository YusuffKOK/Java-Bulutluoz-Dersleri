package ders19_Arrays;

import java.util.Arrays;

public class C05_StringSplitMethodu {
    public static void main(String[] args) {
        String str = "ejava gercekten cok cok guzeleeeeeeeee";
        // verilen str da kac tane e harfi ldugunu bulunuz

        // 1, yontem e harfini ayrac olarak kullaniriz bu sekilde bulabiliriz

        String[] eArrayi = str.split("e");

        System.out.println(Arrays.toString(eArrayi)); // [java g, rc, kt, n cok cok guz, l]
        System.out.println(eArrayi.length); // 5

        System.out.println("metindeki e sayisi :" + (eArrayi.length-1));

        // NOT=> e harfi sonda olursa 1. yontem patliyo sondaki e harflerini sayamiyo
        // guzeleeeeeeeee gibi bir durumu bu yontem cozemiyo
        System.out.println("2. yontem");


        // 2. yontem
        // String'i "" hiclik ile split yaparak karakterlerine ayiralim

        String[] tumKarakterlerArr = str.split("");
        System.out.println(Arrays.toString(tumKarakterlerArr));
        // [e, j, a, v, a,  , g, e, r, c, e, k, t, e, n,  , c, o, k,  , c, o, k,  , g, u, z, e, l]

        int sayac = 0;
        // bir loop ile butun karakterleri kontrol edelim

        for (int i = 0; i < tumKarakterlerArr.length ; i++) {

            if (tumKarakterlerArr[i].equals("e")){
                sayac++;
            }

        }
        System.out.println("Metindeki e sayisi :" + sayac);

    }
}
