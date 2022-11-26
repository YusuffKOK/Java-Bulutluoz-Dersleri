package ders08_Ternary_SwitchCase;

public class C07_SwitchCase {
    public static void main(String[] args) {
        int ayNo = 7;
        switch (ayNo){
            case 12 :
            case 1 :
            case 2 :
                System.out.println("KIŞ Mevsimi");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("İLKBAHAR Mevsimi");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("YAZ Mevsimi");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("SONBAHAR Mevsimi");
            default:
                System.out.println("Gecersiz ayNO girdiniz :");

        }
    }
}
