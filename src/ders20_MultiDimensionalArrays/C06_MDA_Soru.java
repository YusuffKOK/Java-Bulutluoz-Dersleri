package ders20_MultiDimensionalArrays;

public class C06_MDA_Soru {
    public static void main(String[] args) {
        // verilen iki katli bir array'de
        // her bir inner array'in son elementlerini toplamini yazdiran bir method olusturun
        int[][] arr ={{1,2,3,4},{5,6,7},{8,9,10,11,12},{13,14},{15}};

        sonElemtleriTopla(arr);

    }
    public static void sonElemtleriTopla(int[][] arr){

        int toplam =0;

        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i][(arr[i].length-1)];


        }
        System.out.println("son elemanlar toplamı : " + toplam);

    }

}
