package pkg33_cin_zodyagi;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        int dogumYili,zodyakBulma;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Doğum yilinizi girin");
        dogumYili = input.nextInt();
        
        zodyakBulma = dogumYili % 12;
        
        switch(zodyakBulma){
            case 0:
                System.out.println("Çin zodyağı burcunuz Maymun:");
                break;
            case 1:
                System.out.println("Çin zodyağı burcunuz Horoz:");
                break;
            case 2:
                System.out.println("Çin zodyağı burcunuz köpek");
                break;
            case 3:
                System.out.println("Çin zodyağı burcunuz Domuz");
                break;
            case 4:
                System.out.println("Çin zodyağı bucunuz Fare");
                break;
            case 5:
                System.out.println("Çin zodyağı burcunuz öküz");
                break;
            case 6:
                System.out.println("Çin zodyağı burcunuz kaplan");
                break;
            case 7:
                System.out.println("Çin zodyağı burcunuz tavşan");
                break;
            case 8:
                System.out.println("Çin zodyağı burcunuz Ejdarha");
                break;
            case 9:
                System.out.println("Çin zodyağı burcunuz Yılan");
                break;
            case 10:
                System.out.println("Çin zodyağı burcunuz At");
                break;
            case 11:
                System.out.println("Çin zodyağı burcunuz koyun");
                break;
            default:
                System.out.println("Yanlış girdiniz");
                    
                
        }
        
    }
    
}
