package BuyukProje;
import java.util.Scanner ;

public class mayinTarlasi {

    public static int[][][] diziOlusturucuBomba(int[][][] tarla ) {

        for(int f = 0 ; f<tarla.length ; f++){

                int i = (int)(Math.random()*tarla.length );
                int j = (int)(Math.random()*tarla.length );

                tarla[i][j][1] = 5 ;

        }

        return tarla ;

    }

    public static int[][][] diziOlusturucuBombaSayisi(int[][][] tarla ) {

       for(int i = 0 ; i<tarla.length ; i++){

        for(int j = 0 ; j<tarla.length ; j++){

            int toplam = 0 ;

          if(tarla[i][j][0] == 1){

            if(i!=0){

           if (tarla[i-1][j][1] == 5){

             toplam++;

           } 

            }

            if(i!=9){

           if (tarla[i+1][j][1] == 5){

             toplam++;

           } 

            }

            if(j!=0){

           if (tarla[i][j-1][1] == 5){

             toplam++;

           } 

            }

            if(j!=9){

           if (tarla[i][j+1][1] == 5){

             toplam++;

           } 

            }

            if(i!=0 && j!=0){

                if(tarla[i-1][j-1][1] == 5){

                    toplam++;

                }

            }

            if(i!=9 && j!=9){

                if(tarla[i+1][j+1][1] == 5){

                    toplam++;

                }

            }

            if(i!=0 && j!=9){

                if(tarla[i-1][j+1][1] == 5){

                    toplam++;

                }

            }

            if(i!=9 && j!=0){

                if(tarla[i+1][j-1][1] == 5){

                    toplam++;

                }

            }

          }

          tarla[i][j][2] = toplam ;

        }

       }

        return tarla ;

    }

  public static void diziYazici1(int[][][] tarla){

    System.out.println("Bu arka yuz bombalarin oldugu konumlari gösterir");

        System.out.print("   ");
        for(int k = 0 ; k<tarla.length ; k++){

            System.out.print(k+"  ");

        }
 
        System.out.println("\n--------------------------------");

        for(int i = 0 ; i<tarla.length ; i++){

            for(int j = 0 ; j<tarla[i].length ; j++){

                
                if(j==0){

                    System.out.print(i+"| "+tarla[i][j][1]+"  ");

                }
                
                

                else{

                System.out.print(tarla[i][j][1]+"  ");

                }

            }

            System.out.println();

        }

    } 

    public static void diziYazici0(int[][][] tarla){

    

        System.out.print("   ");
        for(int k = 0 ; k<tarla.length ; k++){

            System.out.print(k+"  ");

        }
 
        System.out.println("\n--------------------------------");

        for(int i = 0 ; i<tarla.length ; i++){

            for(int j = 0 ; j<tarla[i].length ; j++){

                
                if(j==0){

                    System.out.print(i+"| "+tarla[i][j][0]+"  ");

                }
                
                

                else{

                System.out.print(tarla[i][j][0]+"  ");

                }

            }

            System.out.println();

        }

    } 

    public static void diziYazici2(int[][][] tarla){

    

        System.out.print("   ");
        for(int k = 0 ; k<tarla.length ; k++){

            System.out.print(k+"  ");

        }
 
        System.out.println("\n--------------------------------");

        for(int i = 0 ; i<tarla.length ; i++){

            for(int j = 0 ; j<tarla[i].length ; j++){

                
                if(j==0){

                    System.out.print(i+"| "+tarla[i][j][2]+"  ");

                }
                
                

                else{

                System.out.print(tarla[i][j][2]+"  ");

                }

            }

            System.out.println();

        }

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

       


             while(true){

                int[][][] tarla = new int[10][10][3] ;


                  diziOlusturucuBomba(tarla);
                 // diziYazici1(tarla);

                while(true){
                    
                    for(int i = 0 ; i<tarla.length ; i++){

                    for(int j = 0 ; j<tarla[i].length ; j++){

                        if(tarla[i][j][0] != 1)

                        tarla[i][j][2] = 3 ;
                        

                    }

                }

                    
                    

                      // diziYazici1(tarla); // bomba konumlari
                       diziYazici2(tarla); // kullanıcının gormesi gereken yer


                   

                    System.out.print("Secmek istediğiniz kutunun kordinatini giriniz orn(2,5 false | 25 true ) : ");

                     int kullaniciGirisNumarasiniBirYapan = scn.nextInt();

                    int  kullanicininGirdiğiIdegeri = kullaniciGirisNumarasiniBirYapan/10 ;
                    int  kullanicininGirdiğiJdegeri = kullaniciGirisNumarasiniBirYapan%10 ;

                    tarla[kullanicininGirdiğiIdegeri][kullanicininGirdiğiJdegeri][0] = 1 ;

                    diziOlusturucuBombaSayisi(tarla);

                           // diziYazici2(tarla);

                            if(tarla[kullanicininGirdiğiIdegeri][kullanicininGirdiğiJdegeri][0]+4 == tarla[kullanicininGirdiğiIdegeri][kullanicininGirdiğiJdegeri][1]){

                                System.out.println("bomb");
                                break;

                            }else{

                                System.out.println("no problem continue");

                            }

                }

            }

    }

}
