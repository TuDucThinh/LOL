/*
 SAI VÃI LÒN RỒI ĐỪNG XEM NỮA
 */
package Can_Ban;
import java.util.Scanner;
/**
 *
 * @author Thinh
 */
public class LOL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tenNV;
        int capDo;
        int luongMauBD;
        int lucChienBD;
        int soMangGietDuoc;
        int soVatPhamToiDa = 5;
        
        System.out.print("mời bạn nhập tên của nhân vật: ");
        tenNV = sc.nextLine();
        System.out.print("mời bạn nhập cấp độ của nhân vật: ");
        capDo = sc.nextInt();
        System.out.print("mời bạn nhập lượng máu ban đầu của nhân vật: ");
        luongMauBD = sc.nextInt();
        System.out.print("mời bạn nhập lực chiến ban dầu của nhân vật: ");
        lucChienBD = sc.nextInt();
        System.out.print("mời bạn nhập số mạng giết được: ");
        soMangGietDuoc = sc.nextInt();
        
        int tmpMau = 0;
        int tmpLucChien = 0;
        
        if (capDo <= 5) {
            for (int i = 1; i < capDo; i++) {
                tmpMau = luongMauBD + i*20;
                tmpLucChien =lucChienBD + i*15;
            }
            
            System.out.println("mau hien tai: " + tmpMau);
            System.out.println("luc chien hien tai: "  + tmpLucChien);   
        }
        
        if (capDo > 5 && capDo <=18) {
            for (int j = 1; j < capDo-4; j++) {
                tmpMau = luongMauBD + 80+ (j * 10);
                tmpLucChien = lucChienBD + 60 + (j * 5);
            }
            
            System.out.println("mau hien tai: " + tmpMau);
            System.out.println("luc chien hien tai: "  + tmpLucChien);   
        }else{
            System.out.println("cấp của bạn không thể vượt quá 18!!");
        }
        
        if (soMangGietDuoc == 1) {
            System.out.println("số món đồ tối đa mua được là: 1"); 
        }
        
        if (soMangGietDuoc >= 2 && soMangGietDuoc <= 5) {
            System.out.println("số món đồ tối đa mua được là: 2");
        }
        
        if (soMangGietDuoc >= 6 && soMangGietDuoc <= 10) {
            System.out.println("số món đồ tối đa mua được là: 3");
        }
        
        if (soMangGietDuoc >= 11 && soMangGietDuoc < 15) {
            System.out.println("số món đồ tối đa mua được là: 3");  
        }
        
        if (soMangGietDuoc >= 15 && soMangGietDuoc <= 69) {
            System.out.println("số món đồ tối đa mua được là: 4");   
        } 
        
        if (soMangGietDuoc > 69) {
            System.out.println("số món đồ tối đa mua được là: 5");
            
        }
        
       
    }
    
/*  public static int muaBan(){
        int STKD = 0;
        int count = 0;
        int kiemDoRan = 400;
        int cuocChim = 850;
        int bF = 1300;
        int voCucKiem = 3200;
        int giapThienThan = 3500;
        
        if (true) {
            
        }

        return count;
    }
*/ 
}

