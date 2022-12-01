//

import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        //Write your code here
        int c0=0;
        int c1=0;
        int c2=0;
        for (int i=0; i <arr.length; i++){
            if(arr[i] == 0){
                c0++;
            }
            else if(arr[i] == 1){
                c1++;
            }
            else {
                c2++;
            }
        }
        ////// 
        while( c0!= 0){
            System.out.print("0 ");
        }
        while( c1!= 0){
            System.out.print("1 ");
        }
        while( c2!= 0){
            System.out.print("2 ");
        }
        
        
    }
}



