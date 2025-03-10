
package pkg21_odev_vucut_kutle_indeksi;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        int kilo;
        double boy,vucudKitle;
        Scanner gir = new Scanner(System.in);
        
        System.out.println("Boyunuzu lütfen metre cinsinden girin : Virgülü unutmatın");
        boy = gir.nextDouble();
        
        System.out.println("Kilonuzu kilo cinsinden girin");
        kilo = gir.nextInt();
        
        vucudKitle = (kilo / (boy*boy));
        
        System.out.println("Vücud kitle endeksiniz:" +vucudKitle );
    }
    
}
