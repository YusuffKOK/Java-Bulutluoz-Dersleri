package ders13_nestedForLoops_metodOlusturma;

public class C04_nestedForLoopUcgen {
    public static void main(String[] args) {
        /*
            asagıdaki sekili cizdirin

            *
            * *
            * * *
            * * * *
            * * * * *

         */

        for (int i = 1; i <=5 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("ikinci örnek");
        /*
            asagıdaki sekili cizdirin
         * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *

         */
        for (int i = 10; i >=1 ; i--) {
            for (int j = i; j >= 1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

}
