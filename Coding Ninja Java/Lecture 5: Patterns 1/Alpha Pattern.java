// Code : Alpha Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 3
//  A
//  BB
//  CCC
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 26
// Sample Input 1:
// 7
// Sample Output 1:
// A
// BB
// CCC
// DDDD
// EEEEE
// FFFFFF
// GGGGGGG
// Sample Input 2:
// 6
// Sample Output 2:
// A
// BB
// CCC
// DDDD
// EEEEE
// FFFFFF

// ****************Answer****************

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int i = 1;
		int n = 'A';
		while(i<=N){
			int j=1;
			while(j<=i){
				System.out.print((char)(n));
				j++;
			}
			n=n+1;
			System.out.println();
			i++;
		}


        
		
	}

}