// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,toplam=0,sayac=0;
        double ort;
        System.out.println("Sayi gir");
        sayi=scan.nextInt();

        for (int i=1;i<=sayi;i++)
        {
            if (i%3==0 && i%4 == 0)
            {
                System.out.println(i);
                toplam+=i;
                sayac++;
            }
        }
        ort=toplam/sayac;
        System.out.println(sayi+" sayisinin hem 3 hem de 4 e bolunenlerinin ortalaması:"+ort);

    }
}