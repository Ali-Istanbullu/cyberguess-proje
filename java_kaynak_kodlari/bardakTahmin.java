package BuyukProje;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class bardakTahmin {

    public static void main(String[] args) {
    
        int bakiye = 0 ;
        int yanlisTahminAzaltmasi = 20 ;
        int tahminEdilecekSayi = 0 ;
        int kontrol = 0 ;
        Random random = new Random();
        Scanner sayi = new Scanner(System.in);
        

         while (true) {
            try {
                System.out.print("Bakiye Giriniz : ");
                bakiye = sayi.nextInt();
                break; // Sayı düzgün girilirse döngüden çık
            } catch (InputMismatchException e) {
                System.out.println("Hata! Lütfen harf değil, bir sayi giriniz.");
                sayi.nextLine(); // Scanner'ın hafızasındaki hatalı harfi temizle (ÇOK ÖNEMLİ!)
                
            }
    }  


    while(bakiye<0 || bakiye<20 || bakiye==0){

     
      while (true) {
            try {
                System.out.print("Bakiye 20'den küçük veya 0'dan kücük veya 0'a eşit olamaz tekrar Giriniz : ");
                bakiye = sayi.nextInt();
                break; // Sayı düzgün girilirse döngüden çık
            } catch (InputMismatchException e) {
                System.out.println("Hata! Lütfen harf değil, bir sayi giriniz.");
                sayi.nextLine(); // Scanner'ın hafızasındaki hatalı harfi temizle (ÇOK ÖNEMLİ!)
                
            }
    }  

}
    

   // System.out.println(bakiye);

    while(true){

    int randomSayi = random.nextInt(1,4);

     while (true) {
            try {
                System.out.print("Lutfen sayiyi tahmin ediniz (1-3) : ");
                 tahminEdilecekSayi = sayi.nextInt();
                break; // Sayı düzgün girilirse döngüden çık
            } catch (InputMismatchException e) {
                System.out.println("Hata! Lütfen harf değil, bir sayi giriniz.");
                sayi.nextLine(); // Scanner'ın hafızasındaki hatalı harfi temizle (ÇOK ÖNEMLİ!)
                
            }
    }  

     while(tahminEdilecekSayi<0 || tahminEdilecekSayi>3 || tahminEdilecekSayi<1){

     
      while (true) {
            try {
                System.out.print("Lutfen sayiyi tahmin ediniz (1-3) Sayiyi eksi değer girmeyiniz : ");
              tahminEdilecekSayi = sayi.nextInt();
                break; // Sayı düzgün girilirse döngüden çık
            } catch (InputMismatchException e) {
                System.out.println("Hata! Lütfen harf değil, bir sayi giriniz.");
                sayi.nextLine(); // Scanner'ın hafızasındaki hatalı harfi temizle (ÇOK ÖNEMLİ!)
                
            }
    }  

}
    

    if(tahminEdilecekSayi==randomSayi){

        System.out.println("Tebrikler dogru tahmin "+bakiye+" x 2 :"+(bakiye*2));
        bakiye*=2;

    }else{

        System.out.println("Malesef yanlis tahmin "+bakiye+" - "+yanlisTahminAzaltmasi+" : "+(bakiye-yanlisTahminAzaltmasi));
        bakiye-=yanlisTahminAzaltmasi;

    }
     while(true){
    if(bakiye<20){

        while (true) {
            try {
                System.out.print("Yetersiz bakiye lutfen bakiye giriniz : ");
              kontrol = sayi.nextInt();
                break; // Sayı düzgün girilirse döngüden çık
            } catch (InputMismatchException e) {
                System.out.println("Hata! Lütfen harf değil, bir sayi giriniz.");
                sayi.nextLine(); // Scanner'ın hafızasındaki hatalı harfi temizle (ÇOK ÖNEMLİ!)
                
            }
    }  

        while(true){
        if(kontrol<0){

            while (true) {
            try {
                System.out.print("Eksik sayi girmeyiniz : ");
              kontrol = sayi.nextInt();
                break; // Sayı düzgün girilirse döngüden çık
            } catch (InputMismatchException e) {
                System.out.println("Hata! Lütfen harf değil, bir sayi giriniz.");
                sayi.nextLine(); // Scanner'ın hafızasındaki hatalı harfi temizle (ÇOK ÖNEMLİ!)
                
            }
    }  


        }else{
            bakiye+= kontrol;
            break;
        }
    }
        

    }else{
        break;
    }
}

    }
   

    
        
  }


}
