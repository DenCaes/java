package pkg27_kullanici_giris;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userName, password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanı isminiz :");
        userName = input.nextLine();

        System.out.print("Şifreniz :");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptiniz");

        } else {
            System.out.println("Bilgileriniz yanlış");
            System.out.println("Sifrenizi sıfırlamak istermisiniz? EVET yada HAYIR yazarak bu işlemi yapabilirsiniz");
            String secim = input.nextLine();
            if (secim.equals("EVET")) {
                System.out.print("Lütfen yeni sifrenizi girin:");
                String password1 = input.nextLine();
                if (password1.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");

                } else {
                    System.out.println("Şifre oluşturuldu");
                    password = password1;

                }
            } else {

            }
        }

    }

}
