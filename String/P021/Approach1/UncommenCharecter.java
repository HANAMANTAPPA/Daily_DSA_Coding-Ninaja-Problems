

////// code neens to be updated 

import java.util.* ;
import java.io.*; 
public class Solution {
	public static String findUncommonCharacters(String s1, String s2) {
		// Write your code here.
        String st="";
        
        for(int i=0; i< s1.length(); i++){
            boolean b=false;
            for(int j=0; j<s2.length(); j++){
                if(s1.charAt(i) ==s2.charAt(j) ){
                    b=true;
                }
            }// inner for loop end 
            if(b==false){
                st=st+s1.charAt(i);
            }
        }
         // now check for 2nd sting 
        for(int i=0; i< s2.length(); i++){
            boolean b=false;
            for(int j=0; j<s1.length(); j++){
                if(s1.charAt(i) ==s2.charAt(j) ){
                    b=true;
                }
            }// inner for loop end 
            if(b==false){
                st=st+s2.charAt(i);
            }
        }
        ///  sort the string 
        char[] chars= st.toCharArray();
        Arrays.sort(chars);
        String st1=new String(chars);
        // return output
        return st1;
	}
}

