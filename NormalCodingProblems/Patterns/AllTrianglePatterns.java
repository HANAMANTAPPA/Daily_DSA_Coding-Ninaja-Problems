/* -------Problem 01 ----
------ output 
*****    OR  EDCBA     OR ABCDE
 ****         DCBA         ABCD
  ***          CBA          ABC
   **           BA           AB
    *            A            A
*/

public class MyClass {
    public static void main(String args[]) {
      int n=5;
      
        for (int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            temp=n-i; // OR int temp=0;
            for(int j=1; j<=n-i+1; j++){
                 ystem.out.print("*"); // or System.out.print( (char)('A' + (temp))); System.out.print( (char)('A' + (temp))); or 
                temp--;// or temp++; 
            }
            System.out.println();
        }
    }
}
//////--------------------------------------Problem 02------------------------------------
/*  

out put 
ONMLK
 JIHG
  FED
   CB
    A
*/

public class MyClass {
    public static void main(String args[]) {
      int n=5;
      int temp=n*(n+1)/2 ;
        for (int i=1; i<=n; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            
            for(int j=1; j<=n-i+1; j++){
                System.out.print( (char)('A' + (temp-1))); //  System.out.print("*") for only stars
                temp--;
            }
            System.out.println();
        }//////----------------------------------------
    }
}

/////--------------- Problem 03 ---------------------------------------------



