class CharConvertion{
  /*
   * in this method i have written how to convert char
   * to ASCII value 
   */
  public static int charToASCII(char a){
    int b=a;
    return b;
  }
  /*
   * in this method i have written how to convert
   * ASCII to char value
   */
  public static char convertASCIIToChar(int a){
    char b=(char)a;
    return b;
  }
  /*
   * in this method i have witten logic for to change Upper alphabet to
   * Lower alphabet letter
   */
  public static char upperToLower(char a){
    a+=32;      //Because In ASCII value F is 70 and f is 102 and the difference 
    return a;   //is 32 number so bascially we adding 32 
  }
  public static char lowerToUpper(char a){
    a-=32;
    return a;
  }
  public static void main(String[]args){
    System.out.println(charToASCII('h'));
    System.out.println(convertASCIIToChar(90));
    System.out.println(upperToLower('F'));
    System.out.println(lowerToUpper('t'));
    
  }
}