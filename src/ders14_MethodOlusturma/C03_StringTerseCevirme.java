package ders14_MethodOlusturma;

public class C03_StringTerseCevirme {
    public static void main(String[] args) {
        // parametre olarak bir String kabul edip
        // String in terse cevrilmis halini döndüren bir method olusturun
        String str = "hakiki güc disipline muhtactir";

        System.out.println(terstenCumle(str));


    }
    public static String terstenCumle (String str){
        String tersStr = "";

        for (int i= str.length()-1 ; i >= 0; i--) {

            tersStr = tersStr + str.charAt(i);

        }
        return tersStr ;
    }

}
