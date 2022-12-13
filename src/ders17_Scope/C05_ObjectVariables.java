package ders17_Scope;

public class C05_ObjectVariables {
    public static void main(String[] args) {
        // C03 class'indaki instance variable'lara nasil ulasabiliriz
        // instance variable'larin diger ismi obje variable'laridir
        // instance variable'lara obje uzerinden ulasabiliriz

        C03_ObjectVariables pers1 = new C03_ObjectVariables();

        System.out.println(pers1.persIsmi); // isim girilmedi
        System.out.println(pers1.persYasi); // 0 => atama yapilmadigi icin

        pers1.persIsmi = "Suleyman";
        pers1.persYasi = 25;
        pers1.persTelefonu = "555 444 0 888";

        System.out.println(pers1.persIsmi); // Suleyman
        System.out.println(pers1.persYasi); // 25

        C03_ObjectVariables pers2 = new C03_ObjectVariables();

        pers2.persIsmi = "Züleyha";
        pers2.persYasi = 26;
        pers2.persTelefonu = "+90551 444 0 111";

        System.out.println(pers1.persIsmi); // Suleyman

        C03_ObjectVariables pers3 = new C03_ObjectVariables();

        pers3.persIsmi = "Ayhanım";
        pers3.persYasi = 23;
        pers3.persTelefonu = "+90551 987 654 321";

        System.out.println(pers1.persYasi);// 25
        System.out.println(pers2.persYasi);// 26
        System.out.println(pers3.persYasi);// 23


    }
}
