import java.util.Scanner;

public class S05_YillikSekerKullanimi {
    public static void main(String[] args) {
        /*
        Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun.
        yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın ve bunları ekranda yazdırın.
        şeker = 1.5 gr
        1g = 1000 gram      olarak hesaplayın

        ipuclari: Önce gram cinsinden yıllık ne kadar seker kullandıgını
        bulun ve kiloya çevirin
         */

        //bizden istenen kullanıcının yılda kg cinsinden ne kadar seker tukettigi hesaplamak

        // yapmamiz gereken kullanicidan ictigi gunluk bardak cay adedini ve
        // her bir bardak icin kullandıgı seker miktarini gram cinsinden almak

        // alınan verilere gore yilda kac bardak cay ve kac kg seker kullandigini
        // hesaplayarak ekrana yazdirmak

        // verilen ipucu: 1000gr = 1kg

        //Once ihtiyacimiz olan variablelari tanimlayalim
        double yillikCayTuketimi;
        double yillikSekerTuketimiGr;
        double yillikSekerTuketimiKg;

        //Kullanicidan deger almak icin Scanner classini import edelim
        Scanner scan = new Scanner(System.in);

        //Kullanicidan verileri isteyelim ve scan methodu ile yakalayalim
        System.out.println("Gunde kac bardak cay tuketiyorsunuz");
        double gunlukCayTuketimi;
        gunlukCayTuketimi = scan.nextDouble();
        System.out.println("Herbir bardak cay icin kac gram seker tuketiyorsunuz");
        double tekBardakGrSekerTuketimi = scan.nextDouble();

        yillikCayTuketimi = gunlukCayTuketimi*365;
        yillikSekerTuketimiGr = (tekBardakGrSekerTuketimi*gunlukCayTuketimi)*365;
        yillikSekerTuketimiKg = yillikSekerTuketimiGr/1000;

        //ve yazdırıyoruz
        System.out.println("Yillik " + yillikCayTuketimi +
                " bardak cay ve " + yillikSekerTuketimiKg + " kg seker tuketiyorsunuz :) ");
    }
}
