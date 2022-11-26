package ders08_Ternary_SwitchCase;

public class C06_SwitchCase {
    public static void main(String[] args) {
        // kullanıcıdan gun numarası alın
        // gun ismini yazdırın
        int gunNo = 1;
        switch (gunNo){
            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2 :
                System.out.println("salı");
                break;
            case 3 :
                System.out.println("çarşamba");
                break;
            case 4 :
                System.out.println("perşembe");
                break;
            case 5 :
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7 :
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecersiz gun No");
            // NOT: Switch parantezi içerisinde long , double , float , boolean kullanılmaz
        }
    }
}
