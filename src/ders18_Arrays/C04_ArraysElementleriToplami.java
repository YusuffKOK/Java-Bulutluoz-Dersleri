package ders18_Arrays;

public class C04_ArraysElementleriToplami {
    public static void main(String[] args) {
        // verilen bir array deki pozitif tamsayilari toplayip
        // sonucu bize donduren bir method yazdirin
        int[] arr ={3,-3,5,-7,-6,1,-2};

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0){
                toplam += arr[i] ;
            }

        }
        System.out.println(toplam);

        System.out.println(pozitifElementleriTopla(arr));


    }
    public static int pozitifElementleriTopla (int[] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0){
                toplam += arr[i] ;
            }

        }


        return toplam;
    }






}
