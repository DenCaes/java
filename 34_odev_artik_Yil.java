package pkg34_artik_yil;

import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        int yil;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Yılı giriniz");
        yil = input.nextInt();
        
        if(yil % 4 == 0){
            System.out.println( yil +" bir artik yildir");
        }else{
            System.out.println( yil +" bir artik yil değildir");
        }
        
    }
    
}
