// You are given an array arr[] of non-negative numbers. Each number tells you the maximum number of steps you can jump forward from that position.

// For example:

// If arr[i] = 3, you can jump 1 step, 2 steps, or 3 steps forward from position i.
// If arr[i] = 0, you cannot jump forward from that position.


class Solution {
    static int minJumps(int[] arr) {
        // code here
        
        int n = arr.length;
        if(arr[0] == 0) return -1;
        if(n== 1) return 0;
        
        int maxreach = 0;
        int steps=0;
        int jumps = 0;
        
        for(int i = 0; i< n; i++){
            if(i == n-1) return jumps;
            
            maxreach = Math.max(maxreach, i + arr[i]);
            
            if(i == steps){
                jumps++;
                steps = maxreach; 
            }
          
            if(i >= maxreach) return -1;
        }
        
        return -1;
    }
}
