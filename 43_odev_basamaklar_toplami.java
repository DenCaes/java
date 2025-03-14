package pkg43_basamak_sayilarini_hesaplama;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
       
        int sayi1,basamak = 0;
        int tBasamak = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayı giriniz :");
        sayi1 = input.nextInt();
        
        while(sayi1 != 0){
            basamak = sayi1 % 10;
            System.out.println(basamak);
            sayi1 = sayi1 / 10; 
            tBasamak = tBasamak + basamak;
        }
    
       System.out.println("Basamakların toplami = " + tBasamak);
    }
    
}
