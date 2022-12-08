public class S01_DaireninAlani_Cevresi {
    public static void main(String[] args) {
        /*
        Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
        Ipuclari:
        * r=7;
        * Pi=3.14
        * Dairenin Cevresi : 2*Pi*r
        * Dairenin Alani : Pi*r*r  (edited)
         */

        //once istenen bilgilerin variabllarını oluşturuyorum
        double daireninCevresi =0;
        double daireninAlani =0;

        // verilen ipuçları ve sabit degerlere bakıyorum
        // yarıcap r=7 , pi=3.14, alan hesap formulu Pi*r*r
        double piSayisi = 3.14;
        double r = 7;

        // bu variablelerle
        daireninAlani = piSayisi*(r*r);
        daireninCevresi = 2*(piSayisi*r);

        // yazdırırsak
        System.out.println("Dairenin alanı : " + daireninAlani  + " Dairenin cevresi : " + daireninCevresi);


    }
}
