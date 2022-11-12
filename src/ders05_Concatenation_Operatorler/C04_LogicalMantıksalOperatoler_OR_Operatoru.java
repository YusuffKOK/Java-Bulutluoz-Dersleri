package ders05_Concatenation_Operatorler;

public class C04_LogicalMantıksalOperatoler_OR_Operatoru {
    public static void main(String[] args) {
        // Or Operatoru || isareti ile gösterilir.
        // Or operaoru iyimserdir. bir tane true olsa yeter.
        int a = 10;
        int b = 15;
        System.out.println(a > 0 || b > 0 ); //true
        System.out.println(a < b-5 || a == b-8); // false
        boolean c;
        System.out.println(c = 15 >= b || a < 0); // true
        c = a >= b || 3*b < 4*a;
        System.out.println(c); // false

    }
}
