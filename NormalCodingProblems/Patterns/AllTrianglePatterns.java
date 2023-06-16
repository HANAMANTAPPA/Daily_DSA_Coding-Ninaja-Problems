/*
output 
ABCDE
 ABCD
  ABC
   AB
    A
*/

public class MyClass {
    public static void main(String args[]) {
      int n=5;
      
        for (int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            int temp=0;
            for(int j=1; j<=n-i+1; j++){
                System.out.print( (char)('A' + (temp))); //  System.out.print("*") for only stars
                temp++;
            }
            System.out.println();
        }
    }
}
//////--------------------------------------------------------------------------



