
import java.util.* ;
import java.io.*; 
import java.util.* ;
import java.io.*; 
public class Solution{
    public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
        /// sort the given array 
        for(int i=0; i< arr.length-1; i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]> arr[j+1]){
                    int temp=arr[i];
                    arr[i] =arr[j];
                    arr[j]= temp;
                }
            }
        }
        // just to verify that arry is sorted 
        for( int x:arr){
            System.out.println(x); 
        }
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        for (int i=0; i<arr.length-1; i++){ //let's take till 2nd last element 
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] + arr[j] == s){// Conition for pairsum
                    al.add(arr[i]);
                    al.add(arr[j]);
                }
            }
        }
        // add arr list to  an array 
        int sizeofarr= al.size()/2;
        int[][] oarr=new int[sizeofarr][2];
        
        int indexofAL=0;
        
        for (int i=0; i<sizeofarr ;i++){
            for(int j=0; j<2; j++){
                oarr[i][j] =al.get(indexofAL);
                indexofAL++;
            }
        }
        
        return oarr;
    }
}
