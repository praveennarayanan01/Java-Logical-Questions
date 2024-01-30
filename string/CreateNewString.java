import java.util.Scanner;

public class CreateNewString {
  public static void main(String[]args){
    Scanner scanner= new Scanner(System.in);
    String string=scanner.nextLine();
    System.out.println("Method 1:");
    System.out.println(upperCaseOnly(string));
    System.out.println("Method 2:");
    System.out.println(lowerCaseOnly(string));
    scanner.close();
  }
  /*
   * In this method we return a new String with only upperCase from the String 
   * we early received
   */
  static String upperCaseOnly(String str){
    String n="";
    for(int i=0;i<str.length();i++){
      char ne=str.charAt(i);
      if(ne>64 && ne<91)
        n=n+ne;
    } return n;
  }
  /*
   * In this method we return a new String with only lowerCase from the String 
   * we early received
   */
  static String lowerCaseOnly(String str){
    String n="";
    for(int i=0;i<str.length();i++){
      char ne=str.charAt(i);
      if(ne>96 && ne<122)
        n=n+ne;
    } return n;
  }
}
