// Sum Pattern
// Send Feedback
// Write a program to print triangle of user defined integers sum.
// Input Format :
// A single integer, N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// 1=1
// 1+2=3
// 1+2+3=6
// Sample Input 2 :
//  5
// Sample Output 2 :
// 1=1
// 1+2=3
// 1+2+3=6
// 1+2+3+4=10
// 1+2+3+4+5=15

// ****************Answer****************

import java.util.Scanner;
public class SumPattern_Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum =0;
        int i =1; //current row  System.out.print(sum);
        while(i<=n) {
            int j=1;
            sum=sum+i;
            while(j<=i) {
                System.out.print(j);
                if(j==i) {
                    System.out.print("=");
                }else {
                    System.out.print("+");
                }
                j++;
            }
            System.out.println(sum);
            i++;
        }
    }
}
