import java.util.Scanner;

public class S02_DikdortgeninAlani {
    public static void main(String[] args) {
        /*
        Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
        Ipuclari:
        * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
        * Dikdortgenin Alani : uzun kenar * kisa kenar (edited)
         */

        //Benden ne isteniyor dikdortgenin alan ve cevre hesabi

        double dikdortgeninAlani;
        double dikdortgenCevresi;

        // elimde ne var: hesaplama formulu
        // Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
        // Dikdortgenin Alani : uzun kenar * kisa kenar (edited)

        // Bana ne lazım: uzun ve kısa kenar uzunlugu. Bunu nasıl alırım?
        //ya 2 variable olusturur kendim girerim
        int kisaKenar =2;
        int uzunKenar =4;
        dikdortgenCevresi = 2*(kisaKenar+uzunKenar);
        dikdortgeninAlani = kisaKenar*uzunKenar;
        System.out.println(dikdortgenCevresi+ " " + dikdortgeninAlani);

        //yada Scannerla kullanıcıdan alırım

        // once kullanıcının giris yapabilmesi icin Scanner sinifini aktif ederim
        Scanner scan = new Scanner(System.in);
        //sonra kullanıcıya mesajımı iletirim
        System.out.println("Lütfen bir kisa bir uzun olmak üzere; iki kenar uzunlugu giriniz");

        // Kullanıcının girdigi degerleri scan.nextint methodu ile yakalarım
        int kisaKenar1 = scan.nextInt();
        int uzunKenar2 = scan.nextInt();

        // ve yazdırmam istendiği icin sout ile yazdırırım
        System.out.println("Girdiginiz verilere gore : " + dikdortgenCevresi);
        System.out.println("Girdiginiz verilere gore : " + dikdortgeninAlani);

    }
}
