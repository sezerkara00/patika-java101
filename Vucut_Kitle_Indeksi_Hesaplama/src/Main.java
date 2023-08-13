// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner enp = new Scanner(System.in);
        double boy,kilo,kitleEndex;
        System.out.println("Kilonuz: ");
        kilo=enp.nextDouble();
        System.out.println("boyunuz");
        boy=enp.nextDouble();
        kitleEndex=kilo/(boy*boy);
        System.out.println("kitle endeksiniz:"+kitleEndex);
    }
}