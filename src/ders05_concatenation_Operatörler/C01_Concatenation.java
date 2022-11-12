package ders05_concatenation_Operatörler;

public class C01_Concatenation {
    public static void main(String[] args) {
        // bir String i baska bir String veya primitive deger ile + isareti kullanarak isleme sokarsak
        // Java bu degiskenleri birlestirerek yeni bir String olusturur.
        /*
        12 Java güzeldir.
        7 Java güzeldir.
        34Java güzeldir.
        Java12güzeldir.
        Java34güzeldir.
        Java7güzeldir.
         */
        String s1 = "Java";
        String s2 = "güzeldir.";
        String s3 = " ";
        String s4 = "";

        int a = 3;
        int b = 4;
        System.out.println(a*b + s3 + s1 + s3 + s2);
        System.out.println(a + b + s3 + s1 + s3 + s2);
        System.out.println(s4 + a + b + s1 + s3 + s2);
        System.out.println(s1 + a*b + s2);
        System.out.println(s1 + a + b + s2);
        System.out.println(s1 + (a + b) + s2);


    }
}
