package ders11_StringManipulation;

public class C06_Soru {
    public static void main(String[] args) {
        // kullanıcıdan bir cumle alın
        // cumlede ev geciyorsa "home sweet home " yazdırın
        // cumlede is geciyorsa "calısmak guzeldır" yazdirin"
        // ikisi de geciyorsa "evde calısmak en guzeli " yazdirin
        // hicbiri gecmiyorsa "cok calısmak lazım cok" yazdirin

        String cumle = "Eve geldim , isler birikmis";
        String cumleCopy = cumle.toLowerCase();
        if (cumleCopy.contains("ev") && cumleCopy.contains("is")){
            System.out.println("evde calısmak en guzeli ");
        } else if (cumleCopy.contains("ev")) {
            System.out.println("home sweet home ");
        } else if (cumleCopy.contains("is")) {
            System.out.println("calısmak guzeldır");
        }else {
            System.out.println("cok calısmak lazım cok");
        }


    }
}
