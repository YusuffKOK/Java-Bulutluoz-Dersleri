package ders13_nestedForLoops_metodOlusturma;

public class C01_forLoops {
    public static void main(String[] args) {
        // kullanıcıdan bir string isteyip o stringi tersten yazdirin

        String input = "Java ne kadar guzel";

        for (int i = input.length()-1; i >=0 ; i--) {

            System.out.print(input.charAt(i));
        }






    }
}
