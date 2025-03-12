package pkg30_sayilari_sirala;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner input = new Scanner(System.in);
        
        System.out.print("1.sayıyı girin : ");
        n1 = input.nextInt();
        
        System.out.print("2.sayıyı girin :");
        n2 = input.nextInt();
        
        System.out.print("3.sayıyı girin :");
        n3 = input.nextInt();
        
        if(n1< n2  && n1<n3){
            if(n2< n3){
                System.out.println("Girdiğiniz sayilarin siralamasi :" +n1+"<"+n2+"<"+n3);
            }else{
                 System.out.println("Girdiğiniz sayilarin siralamasi :" +n1+"<"+n3+"<"+n2);
            }
                
        }else if(n2< n1 && n2<n3){
            if(n1<n3){
                 System.out.println("Girdiğiniz sayilarin siralamasi :" +n2+"<"+n1+"<"+"<"+n3);
         }else{
             System.out.println("Girdiğiniz sayilarin siralamasi :" +n2+"<"+n3+"<"+"<"+n1);
        }
        }else{
                if(n2<n1){
                   System.out.println("Girdiğiniz sayilarin siralamasi :" +n3+"<"+n2+"<"+"<"+n1); 
                }else{
                    System.out.println("Girdiğiniz sayilarin siralamasi :" +n3+"<"+n1+"<"+"<"+n2);
                }
               }   
     
    }
    
}
