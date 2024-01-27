package fourwtechnologies;

public class BinaryMultiply {
  public static void main(String[]args){
    System.out.println(binaryToDecimal("1101"));
  }
  public static int binaryToDecimal(String a){
  int decimalValue=0;
  int l=a.length()-1;
    for(int i=0;i<=a.length()-1;i++){
      if(a.charAt(i)=='1'){
        decimalValue= decimalValue+ (int) (1*(Math.pow(2, l)));
      } l--;
    } return decimalValue;
  }
}
