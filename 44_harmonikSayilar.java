package pkg44_harmonik_seri_bulma;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        int sayi;
        int toplam = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();
        
        System.out.print("Harmonik sayilarin toplami  1+  ");
        for(int i = 1; i <= sayi;i++){
            toplam = toplam + 1/i;
            System.out.print("1/"+i+" +");
        }
        toplam = toplam + 1;
        System.out.println("...= " + toplam);
    }
    
}
