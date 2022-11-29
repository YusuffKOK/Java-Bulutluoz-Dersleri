package ders10_StringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {
        String str = "Ahmet hoca ile java ogrenmek gercekten kolay";
        System.out.println(str.indexOf('a')); // 9 ilk a nın bulundugu index
        System.out.println(str.indexOf("c")); // 8
        System.out.println(str.indexOf("ogrenmek")); // blok hangi indexten basliyorsa onu yazdirir.
        System.out.println(str.indexOf("e",14)); // 23
        // cumledeki ikinci o nun index'ini yazdirin
        int ilkOindex = str.indexOf("o");
        System.out.println(str.indexOf("o",ilkOindex+1));
        System.out.println(str.indexOf("ali")); // olmayan indexler icin java -1 dönderir.


    }
}
