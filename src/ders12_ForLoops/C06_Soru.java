package ders12_ForLoops;

public class C06_Soru {
    public static void main(String[] args) {
    /* kullanicidan bir sayi alin. 1 den başlayarak tüm sayilari sırayla yazdirin
    - 3 ile bölünen bir sayi gelirse sayi yerine fizz
    - 5 ile bölünen bir sayi gelirse sayi yerine buzz
    - hem 3 hem 5 ile bölünen sayi gelirse sayi yerine fizzbuzz yazdirin
    */
        int sayi = 130;

        for (int i = 1; i < sayi ; i++) {

            if (i % 3 == 0 && i % 5 == 0){
                System.out.print("fizzbuzz\n");
            } else if (i % 3 == 0) {
                System.out.print("fizz ");
            } else if ( i % 5 == 0) {
                System.out.print("buzz ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
