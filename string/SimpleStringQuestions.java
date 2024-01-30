import java.util.Scanner;
public class SimpleStringQuestions {
  /*
   * Printing Each char of a String in a Separate line
   */
  public static void inSeparateLine(String str){
    for(int i=0;i<str.length();i++){
      System.out.println(str.charAt(i));
    }
  }
  /*
   * Printing ASCII of each Charracterr in a String in a separate line
   */
  public static void charOfStringInASCII(String str){
    for(int i=0;i<str.length();i++){
      char a=str.charAt(i);
      int b=(int)a;
      System.out.println(a+"-"+b);
    }
  }
  /*
   * Printing olny upperCase of a String
   */
  public static void printUpperCaseOfString(String str){
    for(int i=0;i<str.length();i++){
      char a=str.charAt(i);
      int b=(int)a;
      if(b<91) // By simply changing the logic we can Print
               // only lowercase,alphabet and numbers
      System.out.println(a);
    }
  }
  /*This method will print how many upperCase in your String
   * we can change the return type to int if we needed
   */
  public static void countUppercase(String str){
    int count=0;
    for(int i=0;i<str.length();i++){
      char a=str.charAt(i);
      if(a<91)
        count++;
    }
    System.out.println(count);
  }
  public static void main(String[]args){
    Scanner scanner=new Scanner(System.in);
    String string= scanner.nextLine();
    System.out.println("Method 1:");
    inSeparateLine(string);
    System.out.println("Method 2:");
    charOfStringInASCII(string);
    System.out.println("Method 3:");
    printUpperCaseOfString(string);
    System.out.println("Method 4:");
    countUppercase(string);
    scanner.close();
  } 
}
