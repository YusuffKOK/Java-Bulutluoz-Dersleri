package ders15_Overloading_WhileLoops;

public class C02_Overloading {
    public static void main(String[] args) {


        carpim(3,5);// method call sirasinda method parantezine yazilanlara argument denir
        carpim(3.4,2); //  double - int iki sayinin carpimi 6,8


    }
    // bir class da ayni isim ve ayni signature a sahip iki method olamaz
    /*
    method overloading olan class' larda java hangi methodun calisacagina su sekilde karar verir
    1- once method ismine bakar
    2- argument sayisi ile parametre sayisina bakar
    3- argument ve parametre uyumuna bakar
    4- min casting , Java kendini en az yoracak olanı secer
     */
    public static void carpim (int sayi1 , int sayi2){ // carpim int int ==> 0 casting
        System.out.println("iki integer sayinin carpimi :" +sayi1 *sayi2);
    }
    public static void carpim (int sayi1 , int sayi2 ,int sayi3){ // carpim int int int  ==> 0 casting
        System.out.println("üc integer sayinin carpimi :" +sayi1 *sayi2);
    }
    public static void carpim (double sayi1 , int sayi2){ // carpim double int  ==> 1 casting
        System.out.println("double - int iki sayinin carpimi :" +sayi1 *sayi2);
    }
    public static void carpim (int sayi1 , double sayi2){ // carpim int double  ==> 1 casting
        System.out.println("int - double iki sayinin carpimi :" +sayi1 *sayi2);
    }
    public static void carpim (double sayi1 , double sayi2){ // carpim double double  ==> 2 casting
        System.out.println("iki double sayinin carpimi :" +sayi1 *sayi2);
    }

}
