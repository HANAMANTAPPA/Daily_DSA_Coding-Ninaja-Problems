//Find All Anagrams in a String
//question is in reed me 
/*
Sample Input 1 :
2
10 3
CBAEBABACD
ABC
5 2
ABADE
BA
Sample Output 1 :
0 6
0 1
Explanation For Sample Output 1:
Test Case 1:

'STR' is ‘CBAEBABACD’ and ‘PTR’ is ‘ABC’.

0-2 in 'STR' index 0,1,2 are ‘CBA’, and it is an anagram with ‘ABC’.
1-3 in 'STR' index 1,2,3 are ‘BAE’, and it is not anagram with ‘ABC’.
2-4 in 'STR' index 2,3,4 are ‘AEB’, and it is not anagram with ‘ABC’.
3-5 in 'STR' index 3,4,5 are ‘EBA’, and it is not anagram with ‘ABC’.
4-6 in 'STR' index 4,5,6 are ‘BAB’, and it is not anagram with ‘ABC’.
5-7 in 'STR' index 5,6,7 are ‘ABA’, and it is not anagram with ‘ABC’.
6-8 in 'STR' index 6,7,8 are ‘BAC’, and it is an anagram with ‘ABC’.
7-9 in 'STR' index 7,8,9 are ‘ACD’, and it is not anagram with ‘ABC’.

Hence, there are only two substrings in the given string 'STR'  that are anagram with given string  ‘PTR’ which are ‘CBA’, and ‘BAC’ and starting indices of respective anagram substrings are 0 and 6.


Test case 2:

'STR' is ‘ABADE’ and ‘PTR’ is ‘BA’.

In the given string ‘ABADE’ the substring of length 2 starting with index 0 is ‘AB’ which is an anagram with the string ‘BA’ and a substring of length 2 starting with index 1 is ‘BA’ which is also an anagram with the string ‘BA’. Because 0 and 1 are starting indices of the substrings, we print 0 and 1.
Sample Input 2:
2
10 4
BACDGABCDA
ABCD
7 1
ABABABA
A
Sample Output 2:
0 5 6
0 2 4 6
*/

import java.util.*;

public class Solution {
    public static ArrayList<Integer> findAnagramsIndices(String str, int n, String ptr, int m){
        // Write your code here.
        ArrayList<Integer> arr=new ArrayList<Integer>();
        //System.out.println(str.subSequence(0, str.length()) +""+str.length()+""+n);
        int len= n-m+1;
        //System.out.println(len);
        for(int i=0; i<len;i++){
            String s1 =str.substring(i, i+m);
            if(check(s1,ptr)){
                arr.add(i);
            }

        }
        return arr;
    }
    public static boolean check(String st, String pt){
        char[] ch1=new char[st.length()];
        char[] ch2=new char[pt.length()];
        for(int i=0 ; i<st.length();i++){
            ch1[i]=st.charAt(i);
        }
        for(int i=0 ; i<pt.length();i++){
            ch2[i]=pt.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for(int i=0 ; i<pt.length();i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
}
  
