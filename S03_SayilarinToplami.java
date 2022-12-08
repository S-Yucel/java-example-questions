import java.util.Scanner;

public class S03_SayilarinToplami {
    public static void main(String[] args) {
        /*
        Kullanicidan 5 tane sayi alin,
        alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
        Ipuclari:
        * Sayilarin ortalamasi: toplam/5 (edited)
         */

        // benden istenenler: sayıları kullanıcıdan almam gerekiyor
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 tane sayı giriniz");

        // Kullanıcının girdigi sayıları double olarak yakalayacagım
        double sayi1 = scan.nextDouble();
        double sayi2 = scan.nextDouble();
        double sayi3 = scan.nextDouble();
        double sayi4 = scan.nextDouble();
        double sayi5 = scan.nextDouble();

        // aldıgım sayıların ortalamasını hesaplamalıyım
        // ortalama sonucunu tutacagım bir variable olusturmalıyım

        double ortalama;

        //bana verilen ortalama hesaplama formulu: Sayilarin ortalamasi: toplam/5
        // verilen formule gore heseplama yaptıracagım

        ortalama = (sayi1+sayi2+sayi3+sayi4+sayi5)/5;

        // ve yazdırıyorum
        System.out.println(ortalama);

        // veya direk sout içinde hesaplayıp yazdirabilirim
        System.out.println((sayi1 + sayi2 + sayi3 + sayi4 + sayi5) / 5);

    }
}
