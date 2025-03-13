package pkg38_odev_girilen_sayiya_kadar;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        int sayi,tamBölünen,kacTane;
        tamBölünen = 0;
        kacTane = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Sayı giriniz:");
        sayi = input.nextInt();
        
        while(sayi>0){
            
            if(sayi % 3 == 0 && sayi %4 ==0){
                System.out.println(sayi);
                tamBölünen = sayi + tamBölünen; 
            kacTane++;    
            }
            sayi--;
            
            
        }
        int ort = tamBölünen/kacTane;
        
        System.out.println("Ortalamasi =" +ort );
    }
    
