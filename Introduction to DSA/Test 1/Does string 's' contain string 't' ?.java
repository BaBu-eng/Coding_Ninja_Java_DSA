// Does string 's' contain string 't' ?
// Send Feedback
// Given two string s and t, write a function to check if s contains all characters of t (in the same order as they are in string t).
// Return true or false.
// Do it recursively.
// E.g. : s = “abchjsgsuohhdhyrikkknddg” contains all characters of t=”coding” in the same order. So function will return true.
// Input Format :
// Line 1 : String s
// Line 2 : String t
// Output Format :
// true or false
// Sample Input 1 :
// abchjsgsuohhdhyrikkknddg
// coding
// Sample Output 1 :
// true
// Sample Input 2 :
// abcde
// aeb
// Sample Output 2 :
// false


// ***********************Answer************



public class Solution {
	public static boolean checkSequence(String a, String b) {
		return checkSequence(a,b,0,0);
	}
	 public static boolean checkSequence(String a, String b, int a_idx, int b_idx)
   {
       if (b_idx==b.length())
       {
           return true;
       }
       if (a_idx==a.length())
       {
           return false;
       }
       if (b.charAt(b_idx)==a.charAt(a_idx))
       {
           return checkSequence(a,b,a_idx+1,b_idx+1);
       }
       else
       {
           return checkSequence(a,b,a_idx+1,b_idx);
       }
}
}