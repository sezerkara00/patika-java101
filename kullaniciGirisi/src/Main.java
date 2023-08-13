// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        String id,pass;
        Scanner inp = new Scanner(System.in);
        System.out.println("Kullanici adi gir:");
        id=inp.nextLine();
        System.out.println("Sifre gir:");
        pass=inp.nextLine();
        if (id.equals("patika") && pass.equals("java123")){
            System.out.println("Giriş başarılı");
        }
        else {
            System.out.println("Giriş Başarısız tekrar deneyin.Şifre değiştirin");
            while (true){

                System.out.println("Kullanici adi gir:");
                id=inp.nextLine();
                System.out.println("Sifre gir:");
                pass=inp.nextLine();
                if(pass.equals("java123")){
                    System.out.println("Şifre eski şifreyle aynı olmamalıdır.Tekrar deneyiniz");
                }
                else {
                    System.out.println("Şifre değiştirildi"); break;
                }

            }
        }
    }
}