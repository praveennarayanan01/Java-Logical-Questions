/*
 * In this class i slove how to multiply two binary value
 */
package fourwtechnologies;
import java.util.Scanner;
public class BinaryMultiply {
  public static void main(String[]args){
    Scanner scanner= new Scanner(System.in);
    String s1= scanner.nextLine();
    String s2= scanner.nextLine(); 
    int number1=binaryToDecimal(s1);
    int number2=binaryToDecimal(s2);
    int multiDecimal=number1*number2;
    System.out.println(decimalToBinary(multiDecimal));
    scanner.close();

  }
  public static int binaryToDecimal(String a){
    boolean isBinary=true;
    int decimalValue=0;
    for(char ch: a.toCharArray()){
      if(ch> '1' || ch< '0'){
        isBinary=false;
        break;
      }
    }
    if(isBinary){
      
      int l=a.length()-1;
        for(int i=0;i<=a.length()-1;i++){
          if(a.charAt(i)=='1'){
            decimalValue= decimalValue+ (int) (1*(Math.pow(2, l)));
          } l--;
        } 
    }  
    else{
      System.out.println("You entered a Wrong format!");
    } return decimalValue;
  }
  public static String decimalToBinary(int decimalValue){
    String binaryValue="";
    while(0<decimalValue){
      binaryValue += (decimalValue%2);
      decimalValue = decimalValue/2;
    }
    return binaryValue;
  }
}
