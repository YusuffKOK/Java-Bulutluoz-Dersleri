package ders17_Scope;

public class C01_LocalVariables {
    public static void main(String[] args) {
        // bir method'un icerisinde olusturulan variable'larin scope'u
        // icinde olusturuldukları method'dur
        //o method'un disinda ulaşilamazlar
        int sayi = 10;
        String isim = "Ramazan";
        // System.out.println(dogruMu); => dogruMu variable ına main method icerisinde ulasılamazlar

        for (int i = 0; i < 10; i++) {
            String adres = "Ankara";
            // bir loop icerisinde olusturlan variable'lar sadece o loop icerisinde gecerlidir
        }
         // System.out.println(adres); => adres veriable'i main method icerisnde olmasina ragmen
        // loop disinda kullanilamaz
        // loop da olan loop da kalır :)

        double pi;
        // System.out.println(pi);
        // local variable'lar deger atamadan olusturlabilir ancak KULLLANILAMAZ
        // kullanmadan önce deger atanmıs olmalidir



    }
    public static void method1(){
      //  System.out.println(sayi); => sayi variable'ına da method1 icerisnden ulasamayız
     // isim ="tugay"; => isim variable'ına atama da yapilamaz

      boolean dogruMu =true;


    }





}
