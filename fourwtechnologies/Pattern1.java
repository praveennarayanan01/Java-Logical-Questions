/*
 * In this class we have to print Reverse Triangle pattern
 *      * * * *
 *      * * *     (example int:4)
 *      * *
 *      *
 * According to given integer input
 */

package fourwtechnologies;

public class Pattern1 {
  public static void main(String[]args){
    reverseTriangle(7);
  }
  public static void reverseTriangle(int a){
    for(int i=1;i<=a;i++){
      for(int j=i;j<=a;j++){
        System.out.print(" * ");
      } System.out.println();
    }
  }
}
