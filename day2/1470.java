// Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].

// Return the array in the form [x1,y1,x2,y2,...,xn,yn].


class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int start = 0;
        for(int i = 0; i< nums.length; i++){
            if(i%2==0){
                ans[i] = nums[start];
                start += 1;
            }
            else{
                ans[i] = nums[n];
                n= n+1;
            }
        }
        return ans;
    }
}
