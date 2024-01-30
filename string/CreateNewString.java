import java.util.Scanner;

public class CreateNewString {
  public static void main(String[]args){
    Scanner scanner= new Scanner(System.in);
    String string=scanner.nextLine();
    System.out.println(upperCaseOnly(string));
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
}
