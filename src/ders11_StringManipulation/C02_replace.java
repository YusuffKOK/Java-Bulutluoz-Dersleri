package ders11_StringManipulation;

public class C02_replace {
    public static void main(String[] args) {
        String str = "Java candir";

        System.out.println(str.replace('a', 'A'));// jAvA cAndir

        System.out.println(str.replace(' ', '_'));// java_candir

        System.out.println(str.replace("candir","güzeldir")); // java güzeldir

        System.out.println(str.replace(" ", "")); //  javacandir

        // String deki tum a ları silin

        System.out.println(str.replace("a" ,"")); //jv cndir

        // java yerine hava , candir yerine güzeldir yazdıralım

        System.out.println(str.replace("Java" ,"Hava")
                .replace("candir" ," cok güzel"));

        System.out.println(str.replace("","_")); // _J_a_v_a_ _c_a_n_d_i_r_

        // sadece 1. a yı A yapın

        System.out.println(str.replaceFirst("a","A")); //JAva candir





    }
}
