import java.util.Random;
import java.util.Scanner;


public class baitapdoanso {
   public static void main(String[] args) {
    Random rd = new Random();
    int rdNumber = rd.nextInt(100);
    
    Scanner scanner = new Scanner(System.in);
    int number;
    while (true) { System.out.println("nhapvao so nguyen");
                    number = scanner.nextInt();
      if (number>rdNumber) {System.out.println("so ban chon lon hon");} 
      else {if (number<rdNumber) {System.out.println("so ban chon nho hon");
      System.out.println("so ban chon chinh xac");}}
          
      }
      }   
    
    }

    

        
    
       

        
   