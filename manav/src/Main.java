// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double muz=0.95 , elma=3.67 , domates=1.11 , armut=2.14, patlican=5.0 , toplam;
        Scanner enp=new Scanner(System.in);
        System.out.println("Muz kaç kilo");
        muz= enp.nextDouble()*muz;

        System.out.println("elma kaç kilo");
        elma= enp.nextDouble()*elma;

        System.out.println("domates kaç kilo");
        domates= enp.nextDouble()*domates;

        System.out.println("armut kaç kilo");
        armut= enp.nextDouble()*armut;

        System.out.println("patlican kaç kilo");
        patlican= enp.nextDouble()*patlican;

        toplam=muz+elma+domates+armut+patlican;
        System.out.println("Toplam Tutar: " + String.format("%.2f", toplam));



    }
}