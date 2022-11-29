package ders10_StringManipulation;

public class C05_Soru {
    public static void main(String[] args) {
        /*
        mail kontrolu yapan bir program hazırlayın
        1- mail @ icermiyorsa "gecersiz mail"
        2- @gmail.com icermiyorsa "gmail adresi giriniz"
        3- @gmail.com icermiyorsa "yazım hatası"
        seklinde sonuc yazdirin
         */
        String mail = "yusufkok@gmail.com";
        if (!mail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!mail.contains("@gmail.com")) {
            System.out.println("gmail adresi giriniz");
        } else if (!mail.endsWith("@gmail.com")) {
            System.out.println("yazim hatasi");
        } else  {
            System.out.println("mail basari ile kaydedildi.");
        }


    }
}
