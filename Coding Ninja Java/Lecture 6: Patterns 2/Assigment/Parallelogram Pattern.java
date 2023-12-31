// Parallelogram Pattern
// Send Feedback
// Write a program to print parallelogram pattern for the given N number of rows.
// For N = 4



// The dots represent spaces.
// Input Format :
//  A single integer : N
// Output Format :
// Required Pattern
// Constraints :
// 0 <= N <= 50
// Sample Input 1 :
// 3
// Sample Output 1 :
// ***
//  ***
//   ***
// Sample Input 2 :
// 5
// Sample Output 2 :
// *****
//  *****
//   *****
//    *****
//     *****


// *******************Answer*******************

import java.util.Scanner;

public class Parallelogram_Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        while(i<=n) {
            int space =1;
            while(space<=i-1) {
                System.out.print(" ");
                space = space +1;
            }
            int j = 1;
            while(j<=n) {
                System.out.print("*");
                j =j+1;
            }
            System.out.println();
            i =i +1;
        }
    }
}
