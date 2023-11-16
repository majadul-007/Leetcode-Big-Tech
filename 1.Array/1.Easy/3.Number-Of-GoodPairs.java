
class Solution {
    public int numIdenticalPairs(int[] nums) {

        
        //keep track of total good pairs
        int res = 0;

        //loop through nums and check nums[i] equal or not with nums[j]

        for(int i=0; i<nums.length; i++){


            for(int j=i+1; j<nums.length; j++){

                if(nums[i]== nums[j]){

                    res++;  
                }
            }

        }

        return res;

        
    }
}