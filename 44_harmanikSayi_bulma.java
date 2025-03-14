import java.util.Scanner;


public class Main {

    
    public static void main(String[] args) {
        
        int sayi;
        double toplam = 0.0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();
        
        System.out.print("Harmonik sayilarin toplami  1+  ");
        for(int i = 1; i <= sayi;i++){
            toplam = toplam + 1.0/i;
            System.out.print("1/"+i+" +");
           
           
            
        }
        toplam = toplam + 1;
        System.out.println("...= " + toplam);
    }
    
}
