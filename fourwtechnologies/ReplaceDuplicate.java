/*
 * In this class we have to replace the duplicate with 0 in a Array
 */
package fourwtechnologies;

import java.util.Arrays;

public class ReplaceDuplicate {
  public static void main(String[]args){
    int array[]={1,2,3,4,1,5,2,3};
    System.out.println(Arrays.toString(array));
    replaceDuplicate(array);
    System.out.println(Arrays.toString(array));
  }
  public static void replaceDuplicate(int[]a){
    for(int i=0;i<=a.length-1;i++){ //length-1==7
      for(int j=0;j<i;j++){
        if(a[j]==a[i]){
          a[i]=0;
        }
      }
    } 
  }
}
