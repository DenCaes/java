package pkg28_sinif_gecme_notu;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        
        int mat,turkce,fiz,kimya,muzik;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Matematik notunuzu giriniz");
        mat = input.nextInt();
        
        System.out.println("Turkce notunuzu giriniz");
        turkce = input.nextInt();
        
        System.out.println("fizik notunuzu giriniz");
        fiz = input.nextInt();
        
        System.out.println("kimya notunuzu giriniz");
        kimya = input.nextInt();
        
        System.out.println("muzik notunuzu giriniz");
        muzik = input.nextInt();
        
        if(100<mat || mat<0){
            mat = 0;
        }else if(100<turkce ||  turkce<0){
            turkce = 0;
        }else if(100<fiz ||  fiz<0){
            fiz = 0;
        }else if(100<kimya ||  kimya<0){
            kimya = 0;
        }else if(100<muzik ||  muzik<0){
            muzik = 0;
        }
        
        
        double ort = (mat + turkce + fiz + kimya + muzik)/5;
        
        if(ort >= 55){
            System.out.println("Tebrikler sinifi geçtiniz");
        }else{
            System.out.println("Maalesef sinifi geçemediniz");
        }
        System.out.println("Ortalamniz :" + ort);
    }
    
}
