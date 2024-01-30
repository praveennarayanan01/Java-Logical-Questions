import java.util.Scanner;

public class CreateNewString {
  /*
   * this method return a new String with only upperCase from the String 
   * early received
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
   * this method return a new String with only lowerCase from the String 
   * early received
   */
  static String lowerCaseOnly(String str){
    String n="";
    for(int i=0;i<str.length();i++){
      char ne=str.charAt(i);
      if(ne>96 && ne<123)
        n=n+ne;
    } return n;
  }
  /*
   * this method, we will create a string with digits first then characters
   * from the String got earlier
   */
  public static void  digitsFirst(String str){
    String d="", w="";
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      if(c>47 && c<57){
        d+=c;
      }
      else{
        w+=c;
      }
    }
    System.out.println(d.concat(" "+w));
  }
  /*
   * this method Converts uppercasr to lowercase and lowercase to uppercase
   */
  public static void convertCase(String str){
    String forReturn ="";
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      if(c>64 && c<91){
        c+=32;
        forReturn+=c;;
      }
      else if(c>96 && c<122){
        c-=32;
        forReturn+=c;
      }
      else{
        forReturn+=c;
      }
    } System.out.println(forReturn);
  }
  /*
   * this method reverse the string and print the reversed string
   */
  public static void reverseString(String str){
    String forReturn="";
    for(int i=0;i<str.length();i++){
      char c=str.charAt(i);
      forReturn=c+forReturn;
    }
    System.out.println(forReturn);
  }
  public static void main(String[]args){
    Scanner scanner= new Scanner(System.in);
    String string=scanner.nextLine();
    System.out.println("Method 1:");
    System.out.println(upperCaseOnly(string));
    System.out.println("Method 2:");
    System.out.println(lowerCaseOnly(string));
    System.out.println("Method 3:");
    digitsFirst(string);
    System.out.println("Method 4:");
    convertCase(string);
    System.out.println("Method 5:");
    reverseString(string);
    scanner.close();
  }
}
