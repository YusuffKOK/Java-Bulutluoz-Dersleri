package ders13_nestedForLoops_metodOlusturma;

public class C02_StringTersineCevirme {
    public static void main(String[] args) {
        // kullanicidan bir String isteyin ve String ters cevirip Kaydedin
        String input = "Java her gecen gün güzellesiyor";
        String tersInput = "";
        for (int i = input.length()-1; i >=0 ; i--) {

            tersInput += input.substring(i , i+1);

        }
        System.out.println(tersInput);

    }
}
