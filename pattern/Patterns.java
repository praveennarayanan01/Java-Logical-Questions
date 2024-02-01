package pattern;
public class Patterns{
  public static void main(String[]args){
    square(4);
    System.out.println("--------------------------------------------------------------");
    increasingTriangle(5);
    System.out.println("--------------------------------------------------------------");
    hill(5);
    System.out.println("--------------------------------------------------------------");
    butterfly(5);
    System.out.println("--------------------------------------------------------------");
  }
  public static void hill(int n){
    for(int i=1;i<=n;i++){
      for(int j=i;j<=n;j++){
        System.out.print("   ");
      }
      for(int j=1;j<=i;j++){
        System.out.print(" * ");
      }
      for(int j=1;j<i;j++){
        System.out.print(" * ");
      } System.out.println();
    }
  }
  public static void square(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
         System.out.print(" * "); 
      }   System.out.println();
  }
  }
  public static void increasingTriangle(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(" * ");
      } System.out.println();
    }
  }
  public static void butterfly(int n){
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(" * ");
      }
      for(int j=i;j<n;j++){
        System.out.print("   ");
      }
      for(int j=i;j<n;j++){
        System.out.print("   ");
      }
      for(int j=1;j<=i;j++){
        System.out.print(" * ");
      } System.out.println();
    }
    for(int i=1;i<=n;i++){
      for(int j=i;j<n;j++){
        System.out.print(" * ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("   ");
      }
      for(int j=1;j<=i;j++){
        System.out.print("   ");
      }
      for(int j=i;j<n;j++){
        System.out.print(" * ");
      }   System.out.println();
    }
  }
}