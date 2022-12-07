package ders11_StringManipulation;

public class C04_replaceAll {
    public static void main(String[] args) {
        // kullanicinin girdigi metinde
        // harf disinda kalan tüm karakterleri temizleyen bir kod yazin
        // NOT : space silinmemeli

        String input = "J1a5va+ C*ok guzeldir";

        input = input.replaceAll("\\d" ,""); // Java+ C*ok guzeldir

        input = input.replaceAll(" ","5"); // Java+5C*ok5guzeldir

        input = input.replaceAll("\\W" , ""); // Java5Cok5guzeldir

        input = input.replaceAll("_","");

        input = input.replaceAll("5"," "); // Java Cok guzeldir

        System.out.println(input);


    }
}
