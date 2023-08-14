// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat ;
        Scanner input = new Scanner(System.in);
        System.out.println("Sıcaklık Giriniz :");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.println("Kayak Yapabilirsiniz");

        }else if  (heat <= 25) {

            if (heat <= 15) {
                System.out.println("Sinemaya Gidebilirsiniz");
            }
            if (heat >= 10) {
                System.out.println("Pikniğe Gidebilirsiniz");
            }
        }  else {
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}