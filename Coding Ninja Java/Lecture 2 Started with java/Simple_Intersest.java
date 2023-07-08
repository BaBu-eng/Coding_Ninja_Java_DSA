// Simple Interest
// Send Feedback
// Take the principal amount, rate of interest, and the time period as input and calculate the Simple Interest.
// Note: Print the answer as Floor integer value.
// Input Format:
// The first line of input contains a single integer Principal amount. 

// The Second line of input contains a single decimal Rate of interest.

// The Third line of input contains a single Integer Time period.
// Output Format:
// Calculate the Simple Interest and print it.
// Sample Input 1:
// 2000
// 2.2
// 4
// Sample Output 1:
// 176
// Explanation of Sample Input 1:
// The input is principal=2000, rate=2.2 and time=4.
// So Simple interest=Principal*rate*time/100 hence 
// answer is 2000*2.2*4/100=176



// *************Answer:-*************************


import java.util.* ;
import java.io.*; 
class Solution {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);

int fist = sc.nextInt();
double secnd = sc.nextDouble();
int thir = sc.nextInt();

int SI = (int)((fist*secnd*thir)/100);
System.out.println(SI);
}
}
