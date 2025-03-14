
package pkg41_kombinasyonhesaplama;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
       
        int n,r,tFark,sonuc;
        int nTotal = 1;
        int rTotal = 1;
        int tFarkFaktoriyel = 1;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" ilk Kümenin eleman sayısını girin :");
        n = input.nextInt();
        
        System.out.println("ikinci kümenin eleman sayısını girin");
        r = input.nextInt();
        
        for(int i=1 ; i<=n ; i++){
            nTotal = i*nTotal;
             System.out.println(nTotal);
        }
        for(int i =1; i<=r; i++){
            rTotal = i*rTotal;
             System.out.println(rTotal);
        }
        
        if(n<r){
            System.out.println("n<r olduğu durumda kombinasyon sıfıra eşittir");
        }else{
            tFark = n-r; 
            for(int i =1 ; i<=tFark; i++){
                tFarkFaktoriyel = tFarkFaktoriyel * i;
                 System.out.println(tFarkFaktoriyel);
            }
        }
        
        sonuc = nTotal /(rTotal*tFarkFaktoriyel);
        
        
        
        System.out.println("Girdiğiniz iki sayının :" +n +" ve"+ r + " kombinasyonu :" + sonuc);
    }
    
}
