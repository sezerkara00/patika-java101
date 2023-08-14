// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayac=0 , mat, fizik,turkce,kimya,muzik,toplam=0;
        double avg;
        String kontrol;
        Scanner inp = new Scanner(System.in);

        System.out.println("mat notu gir:");
        mat=inp.nextInt() ;
        if (mat>=0 && mat <=100){
            sayac++;
            toplam+=mat;
        }

        System.out.println("fizik notu gir:");
        fizik=inp.nextInt() ;
        if (fizik>=0 && fizik <=100){
            sayac++;
            toplam+=fizik;
        }

        System.out.println("turkce notu gir:");
        turkce=inp.nextInt() ;
        if (turkce>=0 && turkce <=100){
            sayac++;
            toplam+=turkce;
        }

        System.out.println("kimya notu gir:");
        kimya=inp.nextInt() ;
        if (kimya>=0 && kimya <=100){
            sayac++;
            toplam+=kimya;
        }

        System.out.println("muzik notu gir:");
        muzik=inp.nextInt() ;
        if (muzik>=0 && muzik <=100){
            sayac++;
            toplam+=muzik;
        }

        avg=(toplam/sayac) ;
        kontrol=avg >= 55 ? "geçti" : "kaldi";
        System.out.println(kontrol);



    }
}