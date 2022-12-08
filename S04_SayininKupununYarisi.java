import java.util.Scanner;

public class S04_SayininKupununYarisi {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın ve aldiginiz
        sayının küpünün yarısını konsola yazdırin.
        Ipuclari:
        * Sayinin küpü: sayi*sayi*sayi (edited)
         */

        // hesaplamaları atayacagım degiskeni olusturuyorum
        int sayininKupu;

        //Konsolo yazdıracagım için Scanner classini cagiriyorum
        Scanner scanner = new Scanner(System.in);

        //Kullanicidan 3 deger istiyorum
        System.out.println("Lütfen  sayi giriniz");

        //Kullanicinin girdigi sayilari isleme almak icin scan.nextint ile yakalamaliyim
        int sayi = scanner.nextInt();

        // formulu ve variablları kullanarak hesaplama yaptırıyorum

        sayininKupu = sayi*sayi*sayi;
        System.out.println("Girdiginiz sayinin küpü : " +
                "" +
                "" + sayininKupu);

    }
}
