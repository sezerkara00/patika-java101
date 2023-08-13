// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double fiyat;
        Scanner inp = new Scanner(System.in);
        System.out.println("Aldıgınız urunun fiyat gir:");
        fiyat=inp.nextDouble();
        double kdvOrani = fiyat <= 1000 ? 0.18 : 0.08;
        System.out.println("fiyati:"+fiyat+" olan ürünün kdvli satış fiyatı: "+ (fiyat+fiyat*kdvOrani));


    }
}