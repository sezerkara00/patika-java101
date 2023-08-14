// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        int sayi1 = scanner.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        int sayi2 = scanner.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        int sayi3 = scanner.nextInt();

        System.out.println("Küçükten büyüğe sıralama:");

        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            System.out.println(sayi1);
            if (sayi2 <= sayi3) {
                System.out.println(sayi2);
                System.out.println(sayi3);
            } else {
                System.out.println(sayi3);
                System.out.println(sayi2);
            }
        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            System.out.println(sayi2);
            if (sayi1 <= sayi3) {
                System.out.println(sayi1);
                System.out.println(sayi3);
            } else {
                System.out.println(sayi3);
                System.out.println(sayi1);
            }
        } else {
            System.out.println(sayi3);
            if (sayi1 <= sayi2) {
                System.out.println(sayi1);
                System.out.println(sayi2);
            } else {
                System.out.println(sayi2);
                System.out.println(sayi1);
            }
        }
    }
}