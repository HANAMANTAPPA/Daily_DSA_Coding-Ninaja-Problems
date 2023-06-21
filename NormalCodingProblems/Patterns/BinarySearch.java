/*/    Binary search 
   output:= return the index if element is present else return -1

/*/

public class Solution { 

    public static int binarySearch(int[] arr, int x) {
    	//Your code goes here
        
        int si=0;
        int ei=arr.length-1;
        
        
        while (si <= ei){
            z
            int mid= (si+ei)/2;
            
            if (arr[mid] == x){
                return mid;
            }
            else if (x < arr[mid]){
                ei= mid-1;
            }
            else{
                si= mid+1;
            }

        }

            return -1;
        
        
    }

}
