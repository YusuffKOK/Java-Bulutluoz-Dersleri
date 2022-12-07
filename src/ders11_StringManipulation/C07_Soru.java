package ders11_StringManipulation;

public class C07_Soru {
    public static void main(String[] args) {
        // Kullanıcıdan isim ve soy isim ayrı ayrı alın
        // isim daha uzun ise , isim ve soyismi ilk harf büyük kalanlar kucuk sekilde yazdirin
        // esit veya soyisim daha büyük ise ismi ilk harf büyük soyisim büyük harflerle yazdirin
        String isim = "Ali Osman";
        String soyisim = "Emirosmanoglu";
        String yeniIsimSoyisim ;

        if (isim.length()>soyisim.length()){
            yeniIsimSoyisim = isim.substring(0,1).toUpperCase() +
                                     isim.substring(1).toLowerCase() +
                                    " " +
                                    soyisim.substring(0,1).toUpperCase() +
                                    soyisim.substring(1).toLowerCase();

        }else {
            yeniIsimSoyisim = isim.substring(0,1).toUpperCase() +
                                     isim.substring(1).toLowerCase() +
                                     " " +
                                     soyisim.toUpperCase() ;
        }
        System.out.println(yeniIsimSoyisim);

    }
}
