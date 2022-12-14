package ders20_MultiDimensionalArrays;

public class C04_MDA_CiftSayiAdedi {
    public static void main(String[] args) {
        // verilen iki katli bir array'deki cift sayi adedini bulan kod yaziniz

        int[][] arr = {{4,6},{3,5,8},{1,0,4},{12,13,0,2,14,18}};
        int sayac = 0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j < arr[i].length ; j++) {

                if (arr[i][j] % 2 == 0){

                    sayac++;
                }

            }

        }
        System.out.println("cift sayi adedi : " + sayac);





    }




}
