package BuyukProje;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class sayiTahmin {

   public static void main(String[] args) {
    
    Scanner sayi = new Scanner(System.in);

    int sifre = 1234;
    String ad = "Ali";
    
    System.out.print("Kullanici adi girin : ");
    String kullaniciAdGirisi = sayi.next();
    System.out.print("Kullanici sifre girin : ");
    int kullaniciSifreGirisi = sayi.nextInt();

    while(kullaniciAdGirisi != ad && kullaniciSifreGirisi != sifre){
        
        System.out.println("Sifre ve Kulanici yanlis");
        System.out.print("Kullanici adi girin : ");
        kullaniciAdGirisi = sayi.next();
        System.out.print("Kullanici sifre girin : ");
        kullaniciSifreGirisi = sayi.nextInt();

    }

       
       Random randomSayi = new Random();
       System.out.print("Bakiye Giriniz : ");
       int kullaniciBakiyesi = 0 ;
      // kullaniciBakiyesi = sayi.nextInt();
      int bakiye = 0;
      

       while (true) {
            try {
                kullaniciBakiyesi = sayi.nextInt();
                bakiye = kullaniciBakiyesi;
                break; // Sayı düzgün girilirse döngüden çık
            } catch (InputMismatchException e) {
                System.out.println("Hata! Lütfen harf değil, bir sayi giriniz.");
                sayi.nextLine(); // Scanner'ın hafızasındaki hatalı harfi temizle (ÇOK ÖNEMLİ!)
                System.out.print("Bakiye Giriniz : ");
            }
    }  
    
     int yanlisTahminAzaltmasi = 15 ;

       do{
       


       if(bakiye==0 || bakiye<0 || bakiye<15){

         System.out.println("Geçersiz bakiye bakiye 15 ten ve 0 dan buyuk olmali");
         System.out.print("Bakiye :");
         kullaniciBakiyesi = sayi.nextInt();

    
    
    }
       }while(bakiye==0 || bakiye<0 || bakiye<15);


        while(true){

           int tahminEdilecekSayi = randomSayi.nextInt(100);
           

           if(bakiye==0 || bakiye<0 || bakiye<15){

            System.out.println("Bakiye bitti lutfen para yükleyin");
            System.out.print("Bakiye :");
            while (true) {
            try {
                kullaniciBakiyesi = sayi.nextInt();
                bakiye += kullaniciBakiyesi;
                break; // Sayı düzgün girilirse döngüden çık
            } catch (InputMismatchException e) {
                System.out.println("Hata! Lütfen harf değil, bir sayi giriniz.");
                sayi.nextLine(); // Scanner'ın hafızasındaki hatalı harfi temizle (ÇOK ÖNEMLİ!)
                System.out.print("Bakiye Giriniz : ");
            }
    }  
            
            
        }

            

           if(tahminEdilecekSayi<50 && tahminEdilecekSayi%2==0){

            System.out.println("Ipucu : Sayi 0'dan Buyuk  50 den Kucuk ve Cift Olabilir");

           }
           else if(tahminEdilecekSayi>50 && tahminEdilecekSayi%2==0){

            System.out.println("Ipucu : Sayi 100'den Kucuk  50 den Buyuk ve Cift Olabilir");

           }
           else if( tahminEdilecekSayi<50 && tahminEdilecekSayi%2==1){

            System.out.println("Ipucu : Sayi  0'dan Buyuk 50 den Kucuk ve Tek Olabilir");

           }
           else if(tahminEdilecekSayi>50 && tahminEdilecekSayi%2==1){

            System.out.println("Ipucu : Sayi 100'den Kucuk 50 den Buyuk ve Tek Olabilir");

           }
           else {

            System.out.println("Ipucu : binary de ilk neye bakarsin ? ");

           }
            System.out.println(tahminEdilecekSayi);
            int kullaniciGirisi = sayi.nextInt();

           if(tahminEdilecekSayi==kullaniciGirisi){

            System.out.println("Tebrikler 2x : "+bakiye+" x "+"2");
            bakiye =bakiye*2 ;
            System.out.println("Güncel Bakiye : "+bakiye);
           

           }
           else{

            System.out.println("Malesef Yanlis Tahmin : "+bakiye+"-"+(yanlisTahminAzaltmasi));
            bakiye = bakiye-yanlisTahminAzaltmasi ; 
            System.out.println("Güncel Bakiye : "+bakiye);

           }

        }
        
    
             
   }

   
    
}
