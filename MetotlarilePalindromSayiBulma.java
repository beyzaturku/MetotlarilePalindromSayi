
package metotlarilepalindromsayibulma;
import java.util.*;
public class MetotlarilePalindromSayiBulma {
  public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.println("Bir sayı giriniz:");
      int sayi = input.nextInt();
      
      if(isPalindrom(sayi)){
          System.out.println(sayi + "palindrom bir sayıdır.");
      } 
      else {
          System.out.println(sayi + "palindrom bir sayı değildir.");
      }
  }
  
  public static boolean isPalindrom(int sayi){
      int temp = sayi;
      int reverseNumber =0;
      int lastNumber;
      
      while(temp !=0)
      {
          lastNumber = temp%10;
          reverseNumber = (reverseNumber * 10) + lastNumber;
          temp /= 10;
      }
      if(sayi == reverseNumber){
          return true;
      }
      else {
          return false;
      }
      
    
  }
    
 
    
}
