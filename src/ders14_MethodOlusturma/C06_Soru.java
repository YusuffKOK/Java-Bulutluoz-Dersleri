package ders14_MethodOlusturma;

public class C06_Soru {
    public static void main(String[] args) {
        // kullanicidan main method icerisinde ayrı ayrı isim ve soyisim alin
        // isim ve soyisimin ilk harfleri büyük diger harfler kücük olacak sekilde düzenleyip
        // isim bosluk soyisim seklinde bize döndüren bir method olusturun
        // input : isim = ALi  soyisim = Yılmaz output : Ali Yılmaz
        String isim = "Ali Osman";
        String soyisim ="Emirosmanoglu";

        System.out.println(isimSoyisimDuzenleme(isim, soyisim)); // Ali osman Emirosmanoglu

        System.out.println(isimSoyisimDuzenleme("Heysem" ,"RENKOGLU")); // Heysem Renkoglu

    }
    public static String isimSoyisimDuzenleme (String isim ,String soyisim){
        String yeniIsımSoyisim = isim.substring(0,1).toUpperCase() +
                                 isim.substring(1).toLowerCase() +
                                 " " +
                                 soyisim.substring(0,1).toUpperCase() +
                                 soyisim.substring(1).toLowerCase();
        return yeniIsımSoyisim;
    }




}
