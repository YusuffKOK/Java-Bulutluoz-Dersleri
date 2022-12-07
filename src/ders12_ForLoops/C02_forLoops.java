package ders12_ForLoops;

public class C02_forLoops {
    public static void main(String[] args) {
        for (int i = 0 ; i <= 10 ; i++){
            System.out.print(i + " ");
        }
        // 2 basamaklı sayilardan 7 ile tam bolunenleri yan yana yazdirin
        System.out.println("");

        for (int i =10 ; i <=99 ; i++){
            if (i % 7 == 0){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        // 13 den baslayip 100 e kadar 7 ser 7 ser yazdiralim
        for (int i =13 ; i <=100; i+=7){
            System.out.print(i + " ");
        }
        System.out.println("");
        // 1 den 100 e kadar (sınırlar dahil) sayilarin karelerini yazdiralim
        for (int i = 1; i <=10; i++) {
            System.out.print((i*i) + " " );
        }



    }
}
