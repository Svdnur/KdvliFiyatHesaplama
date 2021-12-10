import java.util.Scanner;

public class KdvliFiyatHesaplama {
    public static void main(String[] args) {

        //Kdvli fiyat hesaplama:

        double fiyat, kdvOrani = 0,kdvMiktari = 0, kdvliFiyat;

        Scanner input = new Scanner(System.in);

        System.out.println("Hesaplamak istediğiniz tutarı giriniz:");
        fiyat = input.nextDouble();

        if ( fiyat > 0 && fiyat <= 1000) {
            kdvOrani = 0.18;
            kdvMiktari = fiyat * 0.18;

        } else if ( fiyat > 1000){
            kdvOrani =  0.8;
            kdvMiktari = fiyat * 0.8;

        }

        kdvliFiyat = fiyat + kdvMiktari;

        System.out.println("Girdiğiniz tutar :" + fiyat);
        System.out.println("Uygulanan Kdv oranı :" + kdvOrani );
        System.out.println("Kdv Miktarı :" + kdvMiktari);
        System.out.println("Kdvli Fiyat :" + kdvliFiyat);


    }

}
