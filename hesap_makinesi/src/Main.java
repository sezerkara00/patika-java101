// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Scanner inp = new Scanner(System.in);
        int n1,n2,select;
        System.out.println("1.sayiyi gir:");
        n1=inp.nextInt();
        System.out.println("2.sayiyi gir:");
        n2=inp.nextInt();

        System.out.println("1-Toplama \n2- Çıkarma \n3- Çarpma \n4 -Bölme");
        select=inp.nextInt();
        switch (select){
            case 1:System.out.println("Toplam:"+(n1+n2)); break;
            case 2:System.out.println("Çıkarma:"+(n1-n2)) ; break;
            case 3:System.out.println("Çarpma:"+(n1*n2)); break;
            case 4:System.out.println("Bölme:"+(n1/n2)); break;
        }
    }
}