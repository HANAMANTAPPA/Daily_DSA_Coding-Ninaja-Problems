/*
Given a string S (that can contain multiple words), you need to find the word which has minimum length.
Note : If multiple words are of same length, then answer will be first minimum length word in the string.
Words are seperated by single space only.
Input Format :
String S
Output Format :
Minimum length word
Constraints :
1 <= Length of String S <= 10^5
Sample Input 1 :
this is test string
Sample Output 1 :
is
Sample Input 2 :
abc de ghihjk a uvw h j
Sample Output 2 :
a
*/

public class MyClass {
    public static void main(String args[]) {
      
      String S ="This is small String";
      System.out.println(MiniumLength(S));
    }
    public static String MiniumLength(String s){
        String arr[] = s.split(" ");
        int smLen=s.length();
        String ans="";
        
        for(String x:arr){
            if(smLen > x.length()){
                ans= x;
                smLen=x.length();
            }
        }
        return ans;
    }
}
