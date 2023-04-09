

class Solution {
    public int[] runningSum(int[] nums) {


       
   //loop through nums
        for(int i=1; i<nums.length; i++){


   //start nums from index 1 and sum with previous value by nums[i-1]
            nums[i] += nums[i-1];


        }

        return nums;
        
    }
}