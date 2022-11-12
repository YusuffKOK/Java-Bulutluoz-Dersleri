package ders08_Ternary_SwitchCase;

public class C04_Ternary {
    public static void main(String[] args) {
        // kullanıcıdan bir ucgenin kenar uzunluklarını alın
        // ucgen eskenar ise "eskenar ucgen" yazdırın degşlse "eskenar ucgen degil"
        int a = 10;
        int b = 20;
        int c = 10;
        System.out.println((a == b) && (b == c) ? "eskenar ucgen" : "eskenar ucgen degil");
        // Basit durumlarda ternary kullanışlı olabilir fakat burda kenar uzunlugu 0 dan büyük olması
        // gerekir onlar icin ayrı sartlar koyarsa ternary pek kullanışlı olmaz


    }
}
