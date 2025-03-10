package pkg20_odev_daire;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
        int yaricap,merkezaci;
        double pi = 3.14,cevre,alan,malan;
        Scanner gir = new Scanner(System.in);
        
        System.out.println("Yarı çapı giriniz :");
        yaricap = gir.nextInt();
        
        System.out.println("Merkez açiyi giriniz :");
        merkezaci = gir.nextInt();
        
        
        cevre = 2*pi*yaricap;
        alan = pi*yaricap*yaricap;
        
        System.out.println("Dairenin Alanı:"+ alan +"\nDairenin cevresi "+ cevre);
        
        malan = (pi*(yaricap*yaricap)*merkezaci)/360;
        System.out.println("Merkez açi yardimyla bulunan alan:" + malan);
    }
    
}
