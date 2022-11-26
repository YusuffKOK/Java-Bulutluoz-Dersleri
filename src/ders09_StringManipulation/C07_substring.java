package ders09_StringManipulation;

public class C07_substring {
    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesiyor";
        System.out.println(str.substring(5,8)); // gun
        // 5. index dahil (inclusive), 8. index haric (exclusive)
        System.out.println(str.substring(9,17)); // gectikce
        String isim = "YAKUPEFE";
        // verilen ismin ilk harfini büyük geri kalanı kücük yazdırın
        isim = isim.substring(0,1).toUpperCase() +
                isim.substring(1).toLowerCase();
        System.out.println(isim);

        System.out.println(isim.substring(2,2)); // hiçlik yazdırır

    }

}
