package ders07_NestedIfElse_Statement;

public class C03_NestedIfElse_Statement {
    public static void main(String[] args) {
          /*
        Kullanıcıdan cinsiyetini ve yasını alın, Kadın 60 yas üzeri ,Erkek 65 yas üzeri emekli olabilir
        Cinsiyet ve yasını dikkate alarak "Emekli olabilirsiniz " veya "Emekli olmanıza ... yıl daha var "
        yazdırın
         */
        String cinsiyet = "Erkek";
        int yas = 68;
        if (cinsiyet.equals("Kadin")){
            if (yas >= 60){
                System.out.println("Emekli oldunuz");
            }else {
                System.out.println("Emekli olmanıza " + (60-yas) + " yil var.");
            }
        }else {
            if (yas >= 65){
                System.out.println("Emekli oldunuz");
            }else {
                System.out.println("Emekli olmanıza " + (65-yas) + " yil var.");
            }
        }
    }
    }

