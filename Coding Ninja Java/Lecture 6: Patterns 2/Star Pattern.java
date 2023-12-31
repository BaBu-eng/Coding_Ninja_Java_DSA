// Code : Star Pattern
// Send Feedback
// Print the following pattern
// Pattern for N = 4



// Hint
// As taught in the video, you just have to modify the code so that instead of printing numbers, it should output stars ('*').
// The dots represent spaces.



// Input Format :
// N (Total no. of rows)
// Output Format :
// Pattern in N lines
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
//    *
//   *** 
//  *****
// Sample Input 2 :
// 4
// Sample Output 2 :
//     *
//    *** 
//   *****
//  *******


//  ******************Answer******************

import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=1;
        while (i<=n){
            int space = 1;
            while (space <= n - i){
                System.out.print(" ");
                space++;
            }
            int j=1;
            int p=1;
            while (j<=i){
                System.out.print("*");
                p++;
                j++;
            }
            p = i-1;
            j = 1;
            while (j<=i-1){
                System.out.print("*");
                p--;
                j++;
            }
            System.out.println();
            i++;
        }
		
	}

}
