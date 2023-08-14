import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz: ");
        int dogumYili = scanner.nextInt();

        String[] cinZodyagiBurclari = {
                "Maymun", "Horoz", "Köpek", "Domuz",
                "Fare", "Öküz", "Kaplan", "Tavşan",
                "Ejderha", "Yılan", "At", "Koyun"
        };

        int indeks = dogumYili % 12;

        System.out.println("Çin Zodyağı Burcunuz: " + cinZodyagiBurclari[indeks]);
    }
}