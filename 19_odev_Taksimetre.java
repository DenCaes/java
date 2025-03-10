package pkg19_odev_taksimetre;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        int km;
        double kmBasiFiyat = 2.20;
        int minUcret = 20,acilisUcret = 10;
        
        Scanner gir = new Scanner(System.in);
        
        System.out.println("Taksimetre kaç km yaptı");
        km = gir.nextInt();
        
        boolean kmOlcum = km>9;
        double toplamUcret = kmOlcum ?(kmBasiFiyat*km) +10:20;
        
        System.out.println("Ödemek yapılması gereken miktar =");
        System.out.println(toplamUcret);
      
    }
    
}
