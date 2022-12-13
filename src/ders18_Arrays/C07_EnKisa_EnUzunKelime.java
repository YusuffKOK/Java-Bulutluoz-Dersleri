package ders18_Arrays;

public class C07_EnKisa_EnUzunKelime {
    public static void main(String[] args) {
        // verilen bir String array'deki
        // en uzun ve en kisa kelimeleri yazdiran bir method olusturun

        String[] arr ={"AyseZehra","ZeynepMiray","Züleyha","Asli","Kerem","Leyla",",Aysenur"};
        enUzunEnUzunIsimleriYazdir(arr);

    }
    public static void enUzunEnUzunIsimleriYazdir(String[] arr){
        String enUzunKelime = arr[0];
        String enKısaKelime = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            if (arr[i].length() > enUzunKelime.length()){

                enUzunKelime = arr[i];
            }
            if (arr[i].length() < enKısaKelime.length()){

                enKısaKelime=arr[i];
            }
        }
        System.out.println("En uzun kelime :" + enUzunKelime);
        System.out.println("En kısa kelime :" + enKısaKelime);


    }




}
