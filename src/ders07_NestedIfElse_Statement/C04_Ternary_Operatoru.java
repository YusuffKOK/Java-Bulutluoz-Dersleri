package ders07_NestedIfElse_Statement;

public class C04_Ternary_Operatoru {
    public static void main(String[] args) {
        // Ternary İf else Statement ile yapabilecegimiz basit işlemleri daha basit bir formda
        // kodlama imkanı verir
        int a = 5;
        if (a > 0){
            a *= 2;
        }else {
            a += 10;
        }
        System.out.println(a);
        // Ternary ile yazılısı
        a = a > 0 ? a*2 : a+10;
        System.out.println("Ternary :" + a);

    }
}
