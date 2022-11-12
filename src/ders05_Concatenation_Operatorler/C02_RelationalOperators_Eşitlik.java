package ders05_Concatenation_Operatorler;

public class C02_RelationalOperators_Eşitlik {
    public static void main(String[] args) {
        // cift esitlik isareti ==
        int a = 10;
        int b = 15;
        System.out.println(a == b); // false
        System.out.println(a == b-5); // true
        boolean c;
        System.out.println(c = 15==b); // true
        c = 15 * a == 10 * b;
        System.out.println(c); // true

        // esit degil !=
        System.out.println("esit degil örnekleri");
        int x = 7 ;
        int y = 3;
        System.out.println(x != y); // true
        System.out.println(x*3 != y*7); // false



    }
}
