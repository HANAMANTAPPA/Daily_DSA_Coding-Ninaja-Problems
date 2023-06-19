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

----Out put 
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
/*
    1
   121
  12321
 1234321
123454321

*/

public class MyClass {
    public static void main(String args[]) {
      int n=5;
      int temp=n*(n+1)/2 ;
        for (int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            
            int temp1=1;
            for(int j=1; j<=i; j++){
                System.out.print( temp1); //  System.out.print("*") for only stars
                temp1++;
            }
            temp1=temp1-1;
            for(int j=1; j<i ; j++){
                System.out.print(--temp1);
            }
            System.out.println();
        }
    }
}
////---------------- Problem -------------
/*
1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15
1+2+3+4+5+6=21
*/

public class MyClass {
	
    public static void main(String[] args) {
        // Write your code here
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=1;j<=i;j++){
                sum+=j;
                if(j==i){
                    System.out.println(j+"="+sum);
                }
                else{
                    System.out.print(j+"+");
                }
            }      
        }
    
	}
}

