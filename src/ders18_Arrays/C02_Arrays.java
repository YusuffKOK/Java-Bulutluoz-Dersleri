package ders18_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        String [] arr = {"Ali","Aysenur" ,"Atilla"};
        // bu array'in tum elementlerini aralarinda bir bosluk olacak sekilde yazdiralim

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " "); // Ali Aysenur Atilla
        }
        System.out.println();
        // bu array'i array olarak yazdiralim

        System.out.println(arr); // [Ljava.lang.String;@566776ad
        // array bir obje / non-primitive data turu oldugundan java referansini yazdirir
        // array'i array olarak yazdirmak istiyorsaniz Arrays class'indan yardim almalisiniz

        System.out.println(Arrays.toString(arr)); // [Ali, Aysenur, Atilla]



    }
}
