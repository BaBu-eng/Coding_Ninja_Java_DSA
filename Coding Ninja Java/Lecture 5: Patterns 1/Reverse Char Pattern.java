// Reverse Char Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 5
// E
// ED
// EDC
// EDCB
// EDCBA
// Input format :
// Integer N (Total no. of rows)
// Output format :
// Pattern in N lines
// Constraints
// 0 <= N <= 50
// Sample Input 1:
// 7

// Sample Output 1:
// G
// GF
// GFE
// GFED
// GFEDC
// GFEDCB
// GFEDCBA
// Sample Input 1:
// 6
// Sample Output 1:
// F
// FE
// FED
// FEDC
// FEDCB
// FEDCB

// **************Answer**************
import java.util.*;


public class Solution
{
	public static void main(String[] args) {
		 int i,j;
 		Scanner sc = new Scanner(System.in);
 		int n=sc.nextInt();
    		for(i=n;i>=1;i--)
    		{
        		for(j=n;j>=i;j--)
        		{ 		
            			System.out.print((char)(j+64));
        		} 
        		System.out.println("");
   	    }
	}
}