// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.math.MathContext;
public class Main {
    public static void main(String[] args) {
        double []kenarlar = new double[3];
        Scanner inp = new Scanner(System.in);
        double toplam=0;
        double alan,s;
        for(int i=0;i<3;i++){
            System.out.println((i+1)+".Kenarın uzunlugunu gir:");
            kenarlar[i]=inp.nextDouble();
        }
        for (double kenar :kenarlar){
            toplam=toplam+kenar;
        }
        System.out.println(toplam);
        s=toplam/2;
        //Alan = √(s(s-a)(s-b)(s-c)) s= toplam/2
        alan=Math.sqrt(s*(s-kenarlar[0])*(s-kenarlar[1])*(s-kenarlar[2]));
        System.out.println("Kenar Uzunlukları:"+kenarlar[0]+" "+kenarlar[1]+" "+kenarlar[2]+ " olan üçgenin alanı:"+alan);
    }
}