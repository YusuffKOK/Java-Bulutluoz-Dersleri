package ders20_MultiDimensionalArrays;

public class C03_MDA_EnUzunKelime {
    public static void main(String[] args) {
        // verilen bir MultiDimensional String bir Array'deki
        // en uzun String'i bulan kod yaziniz

        String[][] arr = {{"Yusuf","Kenan"},{"Ayse","Gülizar","Fatmanur"},{"Gülce","Alparslan","Yavuz"}};

        String enUzunKelime = arr[0][0];

        for (int i = 0; i < arr.length; i++) { // outer array'in elemanlarini kontrol eder

            for (int j = 0; j < arr[i].length ; j++) { // inner array'in elementini kontrol eder

                if (arr[i][j].length() > enUzunKelime.length()){

                    enUzunKelime = arr[i][j];
                }

            }

        }

        System.out.println("En Uzun Kelime :" + enUzunKelime);

    }
}
