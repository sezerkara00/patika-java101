// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yas,km,tercih;
        double perKm=0.1,fiyat,indirimliFiyat,toplam=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz:");
        yas=scan.nextInt();

        System.out.println("km Giriniz:");
        km=scan.nextInt();

        System.out.println("-1 Tek yön\n-2 gidis donus");
        tercih=scan.nextInt();

        if (yas<0 || km < 0 || (tercih>2 && tercih <0))
        {
            System.out.println("HATALI GİRİS YAPTINIZ");
        }
        fiyat=perKm*km;

        if (yas<12){
            indirimliFiyat=fiyat-fiyat/2;
            if(tercih==2){
                indirimliFiyat=indirimliFiyat-indirimliFiyat*0.2;
                toplam=indirimliFiyat*2;
            }
            else {
                toplam=indirimliFiyat;
            }
        }
        else if (yas>=12 && yas <=24){
            indirimliFiyat=fiyat-fiyat*0.1;
            if(tercih==2){
                indirimliFiyat=indirimliFiyat-indirimliFiyat*0.2;
                toplam=indirimliFiyat*2;
            }
            else {
                toplam=indirimliFiyat;
            }
        }
        else if (yas>65){
            indirimliFiyat=fiyat-fiyat*0.3;
            if(tercih==2){
                indirimliFiyat=indirimliFiyat-indirimliFiyat*0.2;
                toplam=indirimliFiyat*2;
            }
            else {
                toplam=indirimliFiyat;
            }
        }
        else
        {
            toplam=fiyat;
        }

        System.out.println("Toplam tutar:"+toplam);


    }
}