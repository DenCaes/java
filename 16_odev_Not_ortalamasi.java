package pkg16_odev_not_ortalamasi;

import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        Scanner gir = new Scanner(System.in);
        int mat,fiz,kim,turkce,tarih,muzik;
        System.out.println("Matematik notunuzu girin");
        mat = gir.nextInt();
        
        System.out.println("Fizik notunuzu girin");
        fiz = gir.nextInt();
        
        System.out.println("Kimya notunuzu girin");
        kim = gir.nextInt();
        
        System.out.println("Türkçe notunuzu girin");
        turkce = gir.nextInt();
        
        System.out.println("Tarih notunuzu girin");
        tarih = gir.nextInt();
        
        System.out.println("Müzik notunuzu girin");
        muzik = gir.nextInt();
        
        
        double ort = (mat+fiz+kim+turkce+tarih+muzik)/6;
        
        System.out.println("Girdiğiniz notun ortalamasi:"+ort);
        
        
        boolean sonuc = ort >60;
        
        String kaldiGecti = sonuc ? "Sınıfı Geçti":"Sınıfta kaldı";
        System.out.println(kaldiGecti);
    }     
 }       
   
