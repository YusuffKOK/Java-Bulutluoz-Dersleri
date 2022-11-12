package ders08_Ternary_SwitchCase;

public class C03_Ternary {
    public static void main(String[] args) {

        int a = 5;
        /* Ternary operatoru tek basına kullanılamaz
        ternary bize sonuc uretir
        ya direk yazdırmalıyız ya da bir variable a atamalıyız.
         */
        String sonuc = a % 2 == 0 ? "cift sayi" : "tek sayi";

        // String sonuc2 = a > 10 ? "Büyük sayi" : a * 2 ;      işlem gecersiz
        /*
        ternary nin sonucunu bir variable atayacaksak
        true ve false durumlarında uretilecek sonucun
        aynı data turunde olması gerekir
         */
        System.out.println(a > 10 ? "Büyük sayi" : a * 2); // direk yazdırırsak bi sıkıntı olmaz.



    }
}
