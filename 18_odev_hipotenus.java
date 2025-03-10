package pkg18_odev_hipotenus;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner gir = new Scanner(System.in);
        
        int a,b;
        double c,cevre,alan;
        
        System.out.println("Birinci Dik kenarı giriniz:");
        a = gir.nextInt();
        
        System.out.println("İkinci kenarı giriniz:");
        b = gir.nextInt();
        
        c = Math.sqrt((a*a) + (b*b)) ; 
        System.out.println("Hipotenüs :" + c);
        
        
        cevre = (a+b+c);
        System.out.println(cevre);
        
        double u = cevre/2;
        
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(alan);
    }
    
}
