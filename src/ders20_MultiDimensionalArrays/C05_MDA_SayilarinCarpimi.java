package ders20_MultiDimensionalArrays;

public class C05_MDA_SayilarinCarpimi {
    public static void main(String[] args) {
        // verilen 2 katli bir array'de bulunan tum sayilarin carpimini bize donduren bir method olusturun

        int[][] arr = {{1,2,3},{4,5},{6}};

        System.out.println("Elementler carppimi : " + elementleriCarp(arr));


    }
    public static int elementleriCarp(int[][] arr){
        int carpim = 1 ;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr[i].length ; j++) {

                carpim *= arr[i][j];
            }

        }


        return carpim;

    }




}
