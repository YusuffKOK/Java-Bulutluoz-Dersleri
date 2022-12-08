package ders14_MethodOlusturma;

public class C02_StringConcate {
    public static void main(String[] args) {
        // verilen iki Stringi parametre olarak kabul edip
        // bu iki Stringi aralarında bir bosluk olan tek bir String olarak
        // main methoda döndüren bir method olusturun
    String input1 = "Java güzel bir program";
    String input2 = "ama yinede cok calismak lazim";

        System.out.println(birlestirMethodu(input1, input2));
        System.out.println(birlestirMethodu("Java" , " candir"));


    }
    public static String birlestirMethodu (String input1 ,String input2){

        return input1 + " " + input2;

    }


}
