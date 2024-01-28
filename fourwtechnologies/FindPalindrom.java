/*
 * In this class i have wriiten code for how to check 
 * given String is palindrom or not
 */
package fourwtechnologies;
import java.util.Scanner;
public class FindPalindrom {
  public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    String s1= scanner.nextLine();
    if(isPalindrom(s1)){
      System.out.println("Given input is Palindrom!");
    }
    else{
      System.out.println("Given inupt is not a palindrom!");
    }
    scanner.close();
  }
  public static boolean isPalindrom(String str){
    int left=0;
    int right= str.length()-1;
    for(int i=left;i<=right;i++){
      if(str.charAt(left)!=str.charAt(right)){
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
}
