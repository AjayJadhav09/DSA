// You are given an array of integers arr[]. Your task is to reverse the given array.
// Note: Modify the array in place.


class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int start = 0;
        int end = arr.length - 1;
        
        while(end >= start){
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}
