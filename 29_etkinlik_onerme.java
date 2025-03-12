package pkg29_etkinlik_onerme;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        int sicaklik;
                
        Scanner input = new Scanner(System.in);
        
        System.out.print("Lütfen sicaklik değerini giriniz :");
        sicaklik = input.nextInt();
        
        
        if(sicaklik > 25){
            System.out.println("Yüzmeye gidebilirsiniz");
        }else if(sicaklik <= 25) {
            if(sicaklik >= 15){
                System.out.println("Pikniğe gidebilirsiniz");
            }
            if(sicaklik >= 5){
                System.out.println("Sinemaya gidebilirsiniz");
            }
        }   if(sicaklik <= 5){
            System.out.println("Kayağa gidebilirsiniz");
        }
            
       
    }
    
}
