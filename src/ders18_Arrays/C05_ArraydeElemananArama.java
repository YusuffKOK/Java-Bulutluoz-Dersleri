package ders18_Arrays;

public class C05_ArraydeElemananArama {
    public static void main(String[] args) {
        // verilen bir array de istenilen elemanin var olup olmadigini
        // varsa kac kere kullanildigini yazdiran bri method olusturun

        int[] arr = {1,2,4,5,3,6,7,4,2,3,5,1,3,2};

        int arananEleman = 2;

        elemanAra(arr,arananEleman);


    }

    public static void elemanAra(int[] arr , int arananEleman){

        int sayac = 0;

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i] == arananEleman){
                sayac++;
            }
        }
        if (sayac == 0){
            System.out.println("aranan sayi array de yok");
        }else {
            System.out.println("Aranan " + arananEleman + " sayisi Array'de " + sayac + " kere kullanilmistir");
        }

    }


}
