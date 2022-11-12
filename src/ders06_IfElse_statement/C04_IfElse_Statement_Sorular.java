package ders06_IfElse_statement;

import java.util.Scanner;

public class C04_IfElse_Statement_Sorular {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Notunuz Giriniz :");
        int not = scan.nextInt();
        if (not >= 85){
            System.out.println("AA");
        } else if (not >= 65) {
            System.out.println("BB");
        } else if (not >= 50) {
            System.out.println("CC");
        }else {
            System.out.println("DD");
        }
    }
}
