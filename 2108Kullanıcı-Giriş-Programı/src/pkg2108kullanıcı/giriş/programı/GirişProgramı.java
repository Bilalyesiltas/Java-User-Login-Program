
package pkg2108kullanıcı.giriş.programı;

import java.util.Scanner;


public class GirişProgramı {

    
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner (System.in);
        
        int giris_hakkı = 3;
        
        String sys_kullanici_adi ="Bilal Yesiltas";
        String sys_parola ="12345";
        
        System.out.println("************************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz...");
        System.out.println("************************************");
        
        
        while (true){
            System.out.print("Kullanıcı Adı : ");
            String kullanici = scanner.nextLine();
            System.out.print("Parola : ");
            String parola = scanner.nextLine();
            
            
            if ( kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                
                System.out.println("HOŞGELDİNİZ..."+ kullanici);
                break;

                
            }
            else if ( kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)){
                
                System.out.println("Parolanız Yanlış...");
                giris_hakkı -=1;
                System.out.println("Giriş Hakkı"+giris_hakkı);

                
            }
            else if ( !kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)){
                
                System.out.println("Kullanıcı Adınız Yanlış...");
                giris_hakkı -=1;
                System.out.println("Giriş Hakkı"+giris_hakkı);

                
            }
            else {
                System.out.println("Kullanıcı Adınızı ve Parolanızı Yanlış Girdiniz."); 
                giris_hakkı -=1;
                System.out.println("Giriş Hakkı"+giris_hakkı);
                
            }
            if(giris_hakkı == 0 ){
                
                System.out.println("Giriş Hakkınız Bitti. Daha Sonra Tekrar Deneyiniz...");
                break;
            }
            
                    
            
            
        }
                
        
    }
    
}
