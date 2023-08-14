import java.util.Scanner;

public class ArtikYilKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Yıl Giriniz: ");
        int yil = scanner.nextInt();

        boolean artik = false;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artik = true;
                }
            } else {
                artik = true;
            }
        }

        if (artik) {
            System.out.println(yil + " bir artık yıldır !");
        } else {
            System.out.println(yil + " bir artık yıl değildir !");
        }
    }
}