package pkg39_donguler_karar_;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        int sayi,toplam;
       
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Sayı giriniz"); 
        sayi = input.nextInt();
        
        toplam = sayi;
        
        while(sayi % 2 == 0){
         System.out.println("Sayı giriniz");  
         sayi = input.nextInt();
         if(sayi % 2 == 0 && sayi % 4 == 0){
             toplam = sayi + toplam;
         }
        }
        System.out.println("Toplam = " + toplam);
    }
    
}
