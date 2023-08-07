// Quick Sort Code
// Send Feedback
// Given the 'start' and the 'end'' positions of the array 'input'. Your task is to sort the elements between 'start' and 'end' using quick sort.


// Note :
// Make changes in the input array itself.
// Input format :
// Line 1 : Integer N i.e. Array size
// Line 2 : Array elements (separated by space)
// Output format :
// Array elements in increasing order (separated by space)
// Sample Input 1 :
// 6 
// 2 6 8 5 4 3
// Sample Output 1 :
// 2 3 4 5 6 8
// Sample Input 2 :
// 5
// 1 2 3 5 7
// Sample Output 2 :
// 1 2 3 5 7 
// Constraints :
// 1 <= N <= 10^3
// 0 <= input[i] <= 10^9



// **************Answer***************






public class Solution {
	public static int partition(int[] input, int startIndex, int endIndex){
        int pivot = input[startIndex];
        int count = 0;
        for(int i=startIndex+1;i<=endIndex;i++){
            if(input[i]<=pivot){
                count++;
            }
        }
        int pivotIndex = startIndex + count;
        input[startIndex] = input[pivotIndex];
        input[pivotIndex] = pivot;
        
        int i = startIndex, j= endIndex;
        while(i < j){
            while(i <= endIndex && input[i] <= pivot){
                i++;
            }
            while(input[j] > pivot){
                j--; 
            }
            if(i<=j){
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--; 
            }
        }
        return pivotIndex; 
    }
    public static void quickSort(int[] input, int startIndex, int endIndex){
        if(startIndex >= endIndex){
            return;  
        }
        int partitionIndex = partition(input, startIndex, endIndex);
        quickSort(input, startIndex, partitionIndex - 1);
        quickSort(input, partitionIndex+1, endIndex);
    }
    
    
    
    
    
	public static void quickSort(int[] input) {
	quickSort(input, 0, input.length -1);
		
	}
	
}