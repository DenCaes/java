package pkg40_4_ve_5._katlari;

import java.util.Scanner;


public class _katlari {

    
    public static void main(String[] args) {
        
        int sayi1;
        int dortKati= 0;
        int besKati = 0;
        
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Bir sayi giriniz");
        sayi1 = input.nextInt();
        
        while(sayi1>0){
            
            if(sayi1 % 4 == 0){
                dortKati = sayi1;
                 System.out.println("4 ün katı = " + dortKati);
            }
            if(sayi1 % 5 == 0){
                besKati = sayi1;
                System.out.println("5 in katı = " + besKati);
            }
            --sayi1;
           
            
           
        }
    }
    
}
