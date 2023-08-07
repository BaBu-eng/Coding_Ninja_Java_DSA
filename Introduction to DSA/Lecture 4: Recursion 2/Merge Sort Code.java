// Merge Sort Code
// Send Feedback
// You are given the starting 'l' and the ending 'r' positions of the array 'ARR'.


// You must sort the elements between 'l' and 'r'.


// Note:
// Change in the input array itself. So no need to return or print anything.
// Example:
// Input: ‘N’ = 7,
// 'ARR' = [2, 13, 4, 1, 3, 6, 28]

// Output: [1 2 3 4 6 13 28]

// Explanation: After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
// Input format :
// The first line contains an integer <em>**'N'**</em> representing the size of the array/list.

// The second line contains 'N' single space-separated integers representing the elements in the array/list.
// Output format :
// You don't need to return anything. In the output, you will see the array after you do the modification.
// Sample Input 1:
// 7
// 2 13 4 1 3 6 28
// Sample Output 1:
// 1 2 3 4 6 13 28
// Explanation of Sample Output 1:
// After applying 'merge sort' on the input array, the output is [1 2 3 4 6 13 28].
// Sample Input 2:
// 5
// 9 3 6 2 0
// Sample Output 2:
// 0 2 3 6 9
// Explanation of Sample Output 2:
// After applying 'merge sort' on the input array, the output is [0 2 3 6 9].
// Constraints :
// 1 <= N <= 10^3
// 0 <= ARR[i] <= 10^9



// *************Answer**************


public class Solution {

static void mergeSort(int[] arr, int l, int r){
        if (l >=r){
            return;
        }
        int mid = (l + r) / 2;
        //Part1
        mergeSort(arr, l, mid);
        //PArt 2
        mergeSort(arr, mid + 1, r);
        merge(arr, l, r);
    }
    private static void merge(int[] arr, int SI, int EI ){
        int mid = (SI + EI) / 2;
        int[] ans = new int[EI - SI + 1];
        int i = SI;
        int j  = mid + 1;
        int k = 0;
        while (i <= mid && j <= EI){
            if (arr[i] < arr[j]){
                ans[k] = arr[i];
                i++;
                k++;
            }else {
                ans[k] = arr[j];
                    k++;
                    j++;
            }
        }
        while (i<= mid){
            ans[k] = arr[i];
            i++;
            k++;
        }
        while (j <= EI){
            ans[k] = arr[j];
            k++;
            j++;
        }
        for (int index = 0; index < ans.length; index++) {
                arr[SI + index] = ans[index];
        }
    }
}
