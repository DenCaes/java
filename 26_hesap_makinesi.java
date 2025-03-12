package pkg26_hesap_makinesi;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      
        int n1,n2,secme;
        
        Scanner gir = new Scanner(System.in);
        
        System.out.print("Birinci sayıyı giriniz : ");
        n1 = gir.nextInt();
        
        System.out.print("İkinci sayıyı giriniz : ");
        n2 = gir.nextInt();
        
        System.out.println("Yapmak istegiğiniz işlemi secin");
        System.out.println("1-Toplama \n2-çıkarma \n3-çarpma \n4-bölme");
        secme = gir.nextInt();
        
       
        switch(secme){
            case 1:
                int toplama = n1 + n2;
                System.out.println("İki sayının toplamı = " +toplama);
                break;
            case 2:
                int cikarma = n1 - n2;
                System.out.println("çıkarma işlemi sonucu = " + cikarma);
                break;
            case 3:
                int carpma = n1 * n2;
                System.out.println("Çarpma işlemi sonucu = " + carpma);
                break;
            case 4:
                int bolme = n1 / n2;
                System.out.println("Bölme işlemi sonucu = " + bolme);
                break;
        }
    }
    
}
