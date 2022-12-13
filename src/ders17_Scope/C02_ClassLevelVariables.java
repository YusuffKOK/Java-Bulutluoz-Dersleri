package ders17_Scope;

public class C02_ClassLevelVariables {
    // class level variable'lar methodlarin disinda olusturulur
    // genel kullanım en üste olusturulmasidir
    static String hastaneIsim = "Afshar Hastanesi";
    static int hastaSayisi = 23453;
    static String basHekimIsmi ;
    String persIsmi;
    String persTelefonu;
    int persYasi;


    public static void main(String[] args) {
        System.out.println(hastaneIsim); // Afshar Hastanesi
        System.out.println(basHekimIsmi); // null
        // System.out.println(persIsmi); => static olmadigi icin static main method da kullanilamaz
        /*
        class level variable'lara deger atanmasi yapilmamis olursa
        Java bu variable'lara data turune gore default olarak tanımlanan degerleri atar
        default degerler
        - sayisal variable'lar : 0
        -boolean : false
        -char : ''
        -objeler(String dahil) : null
         */

    }
    public static void method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
        // System.out.println(persYasi); => static olmadigi icin kullanilamaz

    }

    public void method2 (){
        System.out.println(hastaneIsim); // Afshar Hastanesi => static variable ustundur her yere gidebilirler
        System.out.println(persYasi); // Static olmayan variablelar da burada kullanilabilir


    }

}
