// Basic Pattern Print
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 3
// ###
// ###
// ###
// Input Format:
// Integer N (Total no. of rows)
// Output Format:
// Pattern in N lines
// Constraints:
// 0 <= N <= 50
// Sample Input1:
// 5
// Sample Output 1:
// #####
// #####
// #####
// #####
// #####
// Sample Input 2:
// 4
// Sample Output 2:
// ####
// ####
// ####
// ####


//********************Answer************************

import java.util.*;


public class Solution
{
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int N = sc.nextInt();

		 int i = 1;
		 while(i<=N){
			 int j = 1;
			 while(j<=N){
				 System.out.print("#");
				 j++;
			 }
			 System.out.println();
			 i++;
		 }


         
	}
}