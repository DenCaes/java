package pkg17_odev_kdv_tutari;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        
        double KDV = 0.18,YeniKDV = 0.08,fiyat,kdvNet,fiyatKdvli;
        
        
        System.out.println("Para miktarını giriniz");
        
        fiyat = gir.nextDouble();
        
        boolean fiyatKarsilastirma = fiyat >1000;
        double sonucKDV = fiyatKarsilastirma ? 0.08:0.18;
        System.out.println(sonucKDV);
        
        kdvNet = fiyat *sonucKDV ;
        
        fiyatKdvli = fiyat *sonucKDV + fiyat;
        
        System.out.println("KDV'siz fiyat :" + fiyat);
        System.out.println("net KDV tutarı:" + kdvNet);
        System.out.println("KDV' li fiyat:" + fiyatKdvli);
      
    }
    
}
