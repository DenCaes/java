package pkg42_uslusayilari_hesaplama;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        int sayi,us;
        int sayiToplam = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bir sayı giriniz");
        sayi = input.nextInt();
        
        System.out.println("Sayının ussunu giriniz");
        us = input.nextInt();
        
        for(int i = 0 ;us>i;i++){
            sayiToplam = sayi *sayiToplam;
            
        }
        System.out.println("Toplam sonuc = " + sayiToplam);
    }
    
}
