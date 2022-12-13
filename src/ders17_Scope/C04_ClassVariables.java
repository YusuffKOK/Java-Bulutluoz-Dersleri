package ders17_Scope;

public class C04_ClassVariables {
    public static void main(String[] args) {
        // C03 deki hastane ismini yazdirmak istesek
        System.out.println(C03_ObjectVariables.hastaneIsim);// Afshar Hastanesi

        System.out.println(C03_ObjectVariables.hastaSayisi); // 23453

        C03_ObjectVariables.hastaSayisi++;
        C03_ObjectVariables.hastaSayisi++;
        method1();

        System.out.println(C03_ObjectVariables.hastaSayisi); // 23456

    }   // kod takibi main methoddan baslar.Main methodun sonuna gelindiginde hersey biter
        // tum degisimler resetlenir
        // variable degerleri bastaki hallerine doner


    private static void method1() {

        C03_ObjectVariables.hastaSayisi++;
    }
    /*
    java Runtime bir programdir
    calismaya basladiginda variable'lara atanan degerleri isler
    calistigi muddetce yapilan degisiklikleri kaydeder
    ama calismasi bittiginde degisen degerler resetlenir
     */



}
