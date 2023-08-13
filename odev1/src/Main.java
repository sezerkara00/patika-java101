// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner inp = new Scanner(System.in);
        String  notlar[]={"Mat","turkce","tarih","fen","muzik"};
        float ort;
        int toplam=0;
        int sinav;
        for (String not : notlar){
            System.out.println(not + " Notunuzu giriniz:");
            sinav=inp.nextInt();
            toplam=toplam+sinav;
        }
        ort=toplam/ notlar.length;
        String durum = ort >= 60 ? "gecti":"kaldi";
        System.out.println("Ortalamanız:"+ort+" "+durum);

    }
}