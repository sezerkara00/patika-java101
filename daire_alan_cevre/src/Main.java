// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
import java.math.MathContext;
public class Main {
    public static void main(String[] args) {
        //Dairenin Alanını ve Çevresini Hesaplayan Program
        //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        //
        //Alan Formülü : π * r * r;
        //
        //Çevre Formülü : 2 * π * r;
        //
        //Ödev
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //
        //𝜋 sayısını = 3.14 alınız.
        //
        //Formül : (𝜋 * (r*r) * 𝛼) / 360
        double pi=3.14,daireDilimAlan,r,a;
        Scanner inp = new Scanner(System.in);
        System.out.println("Yarıçap gir");
        r=inp.nextDouble();
        System.out.println("Merkez açı olcusu:");
        a=inp.nextDouble();
        daireDilimAlan=(pi*(r*r)*a)/360;
        System.out.println("Daire Dilimin alanı:"+ daireDilimAlan);



    }
}