// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km;
        double kmPer=2.2,tutar;
        System.out.println("Km gir:");
        km=inp.nextInt();
        tutar=(km*kmPer)+10;
        tutar = (tutar<20) ? 20 : tutar;
        System.out.println(km+".lik yolun ücreti :"+tutar);
        }
}