package ders08_Ternary_SwitchCase;

public class C02_Ternary {
    public static void main(String[] args) {
        String str1 = "Ali";
        String str2 = "ali";
        if (str1.equals(str2)){
            System.out.println("Metinler aynı");
        }else {
            System.out.println("Metinler farklı");
        }
        System.out.println(str1.equals(str2) ? "metinler aynı" : "Metinler farklı");

    }
}
